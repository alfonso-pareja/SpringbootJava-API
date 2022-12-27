package com.portafolio.api.controller;

import java.util.List;
import java.util.Objects;

import com.portafolio.api.dto.UsuarioDTO;
import com.portafolio.api.entity.Rol;
import com.portafolio.api.entity.Usuario;
import com.portafolio.api.model.JwtRequest;
import com.portafolio.api.model.JwtResponse;
import com.portafolio.api.model.ResponseHandler;
import com.portafolio.api.repository.UsuarioRepository;
import com.portafolio.api.security.JwtTokenUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.bind.annotation.*;


@RestController
@CrossOrigin
public class AuthenticationController {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private JwtTokenUtil jwtTokenUtil;

    @Autowired
    private UserDetailsService jwtInMemoryUserDetailsService;


    @Autowired
    private UsuarioRepository usuarioRepository;

    @RequestMapping(value = "/authenticate", method = RequestMethod.POST)
    public ResponseEntity<?> createAuthenticationToken(@RequestBody JwtRequest authenticationRequest)
            throws Exception {

        try {
            authenticate(authenticationRequest.getUsername(), authenticationRequest.getPassword());

            final UserDetails userDetails = jwtInMemoryUserDetailsService
                    .loadUserByUsername(authenticationRequest.getUsername());

            final String token = jwtTokenUtil.generateToken(userDetails);
            List<Usuario> users = usuarioRepository.findByCorreo(authenticationRequest.getUsername());
            Usuario user = users.get(0);

            UsuarioDTO _user = new UsuarioDTO();
            _user.setId(user.getId());
            _user.setRut(user.getRut());
            _user.setNombre(user.getNombre());
            _user.setApellidos(user.getApellidos());
            _user.setCorreo(user.getCorreo());
            _user.setDireccion(user.getDireccion());
            _user.setActivo(user.getActivo());
            _user.setLicencia(user.getLicencia());
            _user.setChoferActivo(user.getChoferActivo());
            _user.setToken(token);

            //ROLE
            Rol rol = user.getRol();
            String userRol = rol.getCodigo();
            if(userRol.equals("ADMIN")){
                _user.setRol("ADMIN");
            } else if(userRol.equals("FUNC")){
                _user.setRol("USER");
            }else if(userRol.equals("CLIENT")){
                _user.setRol("CLIENT");
            }else{
                _user.setRol("");
            }

            return ResponseHandler.send("OK", HttpStatus.OK, _user);
        }catch (Exception ex){
            return ResponseHandler.send("Usuario o contraseña no valido", HttpStatus.BAD_REQUEST, new JwtResponse(null));
        }

    }

    private void authenticate(String username, String password) throws Exception {
        Objects.requireNonNull(username);
        Objects.requireNonNull(password);

        try {
            authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(username, password));
        } catch (DisabledException e) {
            throw new Exception("USER_DISABLED", e);
        } catch (BadCredentialsException e) {
            throw new Exception("INVALID_CREDENTIALS", e);
        }
    }
}
