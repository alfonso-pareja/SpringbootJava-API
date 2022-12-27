package com.portafolio.api.controller;

import com.portafolio.api.dto.CrearPreguntaDTO;
import com.portafolio.api.dto.RegistrarClienteDTO;
import com.portafolio.api.dto.UsuarioDTO;
import com.portafolio.api.entity.Usuario;
import com.portafolio.api.model.ResponseHandler;
import com.portafolio.api.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;



    @GetMapping({ "/usuario" })
    public ResponseEntity<Object> getUsers(){
        List<Usuario> users = usuarioService.Users();
        return ResponseHandler.send("Lista de usuarios", HttpStatus.OK, users);
    }


    @GetMapping({ "/usuario/{userid}" })
    public ResponseEntity<Object> getUser(@PathVariable("userid") int userid){
        try{
            Usuario user = usuarioService.GetUserById(userid);
            // Usuario no existe
            if(user == null){
                return ResponseHandler.send("Usuario no encontrado", HttpStatus.BAD_REQUEST, null);
            }
            return ResponseHandler.send("Ok", HttpStatus.OK, user);

        } catch (Exception ex){
            return ResponseHandler.send("Usuario no encontrado", HttpStatus.OK, null);
        }

    }


    @PostMapping({ "/usuario" })
    public ResponseEntity<Object> saveUser(@RequestBody RegistrarClienteDTO user){
        Boolean exito = usuarioService.CreateClient(user);
        if(!exito){
            return ResponseHandler.send("Correo ya existe, prueba con otro!", HttpStatus.BAD_REQUEST, null);
        }

        return ResponseHandler.send("Registro Guardado!", HttpStatus.OK, null);
    }


    @PutMapping({ "/usuario" })
    public ResponseEntity<Object> updateUser(@RequestBody RegistrarClienteDTO user){
        Boolean update = usuarioService.UpdateUser(user);
        if(update){
            return ResponseHandler.send("Usuario Actualizado!", HttpStatus.OK, null);
        }

        return ResponseHandler.send("Usuario no existe!", HttpStatus.OK, null);
    }


    @DeleteMapping({ "/usuario/{userid}" })
    public ResponseEntity<Object> deleteUser(@PathVariable("userid") int userid){
        Boolean delete = usuarioService.DeleteUser(userid);
        if(delete){
            return ResponseHandler.send("Usuario Eliminado!", HttpStatus.OK, null);
        }

        return ResponseHandler.send("Usuario no existe!", HttpStatus.OK, null);
    }


    @PostMapping({ "/usuario/agregar" })
    public ResponseEntity<Object> saveCliente(@RequestBody RegistrarClienteDTO cliente){
        Boolean exito = usuarioService.CreateClient(cliente);
        if(!exito){
            return ResponseHandler.send("Correo ya existe, prueba con otro!", HttpStatus.BAD_REQUEST, null);
        }
        return ResponseHandler.send("Cliente registrado", HttpStatus.OK, null);
    }








}
