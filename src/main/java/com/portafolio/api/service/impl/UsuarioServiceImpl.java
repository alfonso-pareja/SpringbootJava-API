package com.portafolio.api.service.impl;

import com.portafolio.api.dto.RegistrarClienteDTO;
import com.portafolio.api.entity.Usuario;
import com.portafolio.api.repository.UsuarioRepository;
import com.portafolio.api.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UsuarioServiceImpl implements UsuarioService {

    @Autowired
    public UsuarioRepository usuarioRepository;

    @Override
    public List<Usuario> Users() {
        return (List<Usuario>) usuarioRepository.findAll();
    }

    @Override
    public Usuario GetUserById(int id) {
        return usuarioRepository.findById(id).get();
    }

    @Override
    public void SaveUser(Usuario user) {
        usuarioRepository.save(user);
    }

    @Override
    public Boolean UpdateUser(RegistrarClienteDTO user) {
        boolean exists = usuarioRepository.existsById(user.getId());
        if(exists){
            usuarioRepository.UpdateUser(
                    user.getId(),
                    user.getRut(),
                    user.getNombre(),
                    user.getApellidos(),
                    user.getCorreo(),
                    user.getFecha_ingreso(),
                    user.getDireccion(),
                    user.getTelefono(),
                    user.getChofer_activo(),
                    user.getLicencia(),
                    user.getRol_id()
            );
            return true;
        }
        else return false;
    }

    @Override
    public Boolean DeleteUser(int id) {
        boolean exists = usuarioRepository.existsById(id);
        if(exists){
            usuarioRepository.deleteById(id);
            return true;
        }
        else return false;
    }

    @Override
    public Boolean CreateClient(RegistrarClienteDTO user) {

        List<Usuario> usuario = usuarioRepository.findByCorreo(user.getCorreo());

        if(!usuario.isEmpty()){
            System.out.println("Existe");
            return false;
        }else {
            System.out.println("No Existe");
            String encodedPassword = new BCryptPasswordEncoder().encode(user.getClave());
            usuarioRepository.createUser(
                    user.getRut(),
                    user.getNombre(),
                    user.getApellidos(),
                    user.getCorreo(),
                    encodedPassword,
                    user.getFecha_ingreso(),
                    user.getDireccion(),
                    user.getTelefono(),
                    user.getChofer_activo(),
                    user.getLicencia(),
                    user.getRol_id()
            );
            return true;
        }


    }


}
