package com.portafolio.api.repository;

import com.portafolio.api.dto.RegistrarClienteDTO;
import com.portafolio.api.dto.cliente.ReservaDepartamentoDTO;
import com.portafolio.api.entity.Usuario;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;
import java.util.Map;


public interface UsuarioRepository extends CrudRepository<Usuario, Integer> {

    List<Usuario> findByCorreo(String correo);
   // Usuario findById(Integer id);

//    @Query("select count(e) from MyEntity e where ...")
//    public Boolean existUser(int id);

    //CREATE CLIENT
    @Transactional
    @Modifying
    @Query(value =
            "INSERT INTO USUARIO (" +
                    "ID, " +
                    "RUT, " +
                    "NOMBRE, " +
                    "APELLIDOS, " +
                    "CORREO, " +
                    "CLAVE, " +
                    "FECHA_INGRESO, " +
                    "DIRECCION, " +
                    "TELEFONO, " +
                    "CHOFER_ACTIVO, " +
                    "LICENCIA, " +
                    "ACTIVO, " +
                    "ROL_ID) " +
            "VALUES (" +
                    "SEQ_USUARIO.NEXTVAL, " +
                    ":rut, " +
                    ":nombre, " +
                    ":apellidos, " +
                    ":correo, " +
                    ":clave, " +
                    ":fecha_ingreso, " +
                    ":direccion, " +
                    ":telefono, " +
                    ":chofer_activo, " +
                    ":licencia, " +
                    "1, " +
                    ":rol_id" +
            ")", nativeQuery = true)
    void createUser(
            @Param("rut") String rut,
            @Param("nombre") String nombre,
            @Param("apellidos")String apellidos,
            @Param("correo")String correo,
            @Param("clave")String clave,
            @Param("fecha_ingreso") Date fecha_ingreso,
            @Param("direccion")String direccion,
            @Param("telefono")String telefono,
            @Param("chofer_activo") boolean chofer_activo,
            @Param("licencia") boolean licencia,
            @Param("rol_id") int rol_id
    );


    @Transactional
    @Modifying
    @Query(value = 
            "UPDATE USUARIO SET  " +
            "    RUT = :rut,  " +
            "    NOMBRE = :nombre,  " +
            "    APELLIDOS = :apellidos,  " +
            "    CORREO = :correo,  " +
            "    FECHA_INGRESO = :fecha_ingreso,  " +
            "    DIRECCION = :direccion,  " +
            "    TELEFONO = :telefono,  " +
            "    CHOFER_ACTIVO = :chofer_activo,  " +
            "    LICENCIA = :licencia,  " +
            "    ROL_ID = :rol_id " +
            "WHERE ID = :id", nativeQuery = true)
    void UpdateUser(
            @Param("id") int id,
            @Param("rut") String rut,
            @Param("nombre") String nombre,
            @Param("apellidos")String apellidos,
            @Param("correo")String correo,
            @Param("fecha_ingreso") Date fecha_ingreso,
            @Param("direccion")String direccion,
            @Param("telefono")String telefono,
            @Param("chofer_activo") boolean chofer_activo,
            @Param("licencia") boolean licencia,
            @Param("rol_id") int rol_id
    );


    
}
