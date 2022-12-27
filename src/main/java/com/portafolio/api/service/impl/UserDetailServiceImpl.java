package com.portafolio.api.service.impl;

import com.portafolio.api.dto.UsuarioDTO;
import com.portafolio.api.entity.Rol;
import com.portafolio.api.repository.UsuarioRepository;
import com.portafolio.api.entity.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserDetailServiceImpl implements UserDetailsService {
    @Autowired
    private UsuarioRepository usuarioRepository;


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        List<Usuario> users = usuarioRepository.findByCorreo(username);
        Usuario user = users.get(0);


        if(!user.getActivo()){
           throw new UsernameNotFoundException("Usuario no se encuentra activo");
        }

        if (user.getCorreo().equals(username)) {
            return new User(user.getCorreo(), user.getClave(),
                    new ArrayList<>());
        } else {
            throw new UsernameNotFoundException("No se encontro el usuario " + username);
        }
    }





}
