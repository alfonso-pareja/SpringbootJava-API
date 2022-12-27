package com.portafolio.api.service;

import com.portafolio.api.dto.RegistrarClienteDTO;
import com.portafolio.api.entity.Usuario;

import java.util.List;

public interface UsuarioService {

    /**
     * Lista de usuarios con su rol
     * @return
     */
    List<Usuario> Users();

    /**
     * Usuario por id
     * @param id
     * @return
     */
    Usuario GetUserById(int id);

    /**
     *
     * @param user
     */
    void SaveUser(Usuario user);

    /**
     *
     * @param user
     */
    Boolean UpdateUser(RegistrarClienteDTO user);

    /**
     *
     * @param id
     */
    Boolean DeleteUser(int id);

    /**
     *
     * @param user
     * @return
     */
    Boolean CreateClient(RegistrarClienteDTO user);
}
