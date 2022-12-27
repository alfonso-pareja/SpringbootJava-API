/**
 *
 * Autor: Alfonso Pareja
 * Fecha: 23-09-2021
 *
 */
package com.portafolio.api.security;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;


import io.jsonwebtoken.ExpiredJwtException;

@Component
public class JwtRequestFilter extends OncePerRequestFilter {

    @Autowired
    private UserDetailsService userDetailService;

    @Autowired
    private JwtTokenUtil jwtTokenUtil;

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain chain)
            throws ServletException, IOException {

        final String requestTokenHeader = request.getHeader("Authorization");

        String username = null;
        String jwtToken = null;

        // El formato del token es "Bearer token". Remover la palabra Barer y se obtiene solo el token.
        if (requestTokenHeader != null && requestTokenHeader.startsWith("Bearer ")) {
            jwtToken = requestTokenHeader.substring(7);

            try {
                username = jwtTokenUtil.getUsernameFromToken(jwtToken);
            } catch (IllegalArgumentException e) {
                System.out.println("No se puede obtener el token");
            } catch (ExpiredJwtException e) {
                System.out.println("Token Expirado");
            } catch (io.jsonwebtoken.MalformedJwtException e){
                System.out.println("Token no Valido");
            }
        } else {
            logger.warn("JWT Token does not begin with Bearer String");
        }

        // Una vez obtenido el token se valida
        if (username != null && SecurityContextHolder.getContext().getAuthentication() == null) {
                UserDetails userDetails = this.userDetailService.loadUserByUsername(username);

                // Realizamos validacion del token (token pertenezca al usuario y no este expirado)
                // Si el token es valido se setea manualmente la autenticacion de Spring Security
                if (jwtTokenUtil.validateToken(jwtToken, userDetails)) {
                    UsernamePasswordAuthenticationToken usernamePasswordAuthenticationToken = new UsernamePasswordAuthenticationToken(
                            userDetails, null, null);
                    usernamePasswordAuthenticationToken
                            .setDetails(new WebAuthenticationDetailsSource().buildDetails(request));

                    // Despues de configurar la autenticacion,
                    // especificamos que el usuario actual está autenticado.
                    // Por lo tanto, pasa las configuraciones de seguridad de Spring con éxito.
                    SecurityContextHolder.getContext().setAuthentication(usernamePasswordAuthenticationToken);
                }


        }
        chain.doFilter(request, response);
    }

}
