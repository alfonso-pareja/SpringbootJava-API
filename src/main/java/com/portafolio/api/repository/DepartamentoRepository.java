package com.portafolio.api.repository;

import com.portafolio.api.dto.*;
import com.portafolio.api.dto.cliente.ClienteMultaDTO;
import com.portafolio.api.dto.cliente.DepartamentosDTO;
import com.portafolio.api.entity.Departamento;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;
import java.util.Map;

public interface DepartamentoRepository extends CrudRepository<Departamento, Integer> {

    //LIST CHECK-IN
    @Query(value = ("SELECT ci.id, d.nombre_edificio, d.numero, u.nombre, r.created_at FROM checkin ci INNER JOIN reserva r ON ci.reserva_id = r.id INNER JOIN departamento d ON ci.departamento_id = d.id INNER JOIN usuario u ON ci.usuario_id = u.id"), nativeQuery = true)
    List<Map<String, DeptoCheckinDTO>> findAllCheckins();

    //LIST CHECK-OUT
    @Query(value = "SELECT co.id, d.nombre_edificio, d.numero, u.nombre, r.created_at as fecha_creacion FROM checkout co INNER JOIN checkin ci ON co.checkin_id = ci.id INNER JOIN departamento d ON ci.departamento_id = d.id INNER JOIN usuario u ON ci.usuario_id = u.id INNER JOIN reserva r ON ci.reserva_id = r.id", nativeQuery = true)
    List<Map<String, DeptoCheckoutDTO>> findAllCheckouts();

    //CHECKLIST CHECK-IN
    @Query(value = "SELECT p.id, d.nombre_edificio, d.numero, u.nombre, p.pregunta, p.respuesta_ci FROM pregunta p INNER JOIN checkin ci ON p.checkin_id = ci.id INNER JOIN departamento d ON ci.departamento_id = d.id INNER JOIN usuario u ON ci.usuario_id = u.id WHERE ci.id = :id",nativeQuery = true)
    List<Map<String, PreguntaDTO>> findChecklistCiById(int id);

    //CHECKLIST CHECKOUT
    @Query(value = "SELECT p.id, d.nombre_edificio, d.numero, u.nombre, p.pregunta, p.respuesta_co FROM pregunta p INNER JOIN checkin ci ON p.checkin_id = ci.id INNER JOIN checkout co ON ci.id = co.checkin_id INNER JOIN departamento d ON ci.departamento_id = d.id INNER JOIN usuario u ON ci.usuario_id = u.id WHERE co.id = :id",nativeQuery = true)
    List<Map<String, PreguntaDTO>> findChecklistCoById(int id);

    //LIST INVENTORY
    @Query(value =
            "SELECT " +
            "   i.id, " +
            "   d.numero, " +
            "   d.nombre_edificio, " +
            "   i.nombre as inventario, " +
            "   i.descripcion, " +
            "   i.fecha_inicio, " +
            "   i.fecha_termino, " +
            "   u.nombre ||' '|| u.apellidos as funcionario, " +
            "   ei.nombre as estado " +
            "FROM inventario i " +
            "INNER JOIN usuario u ON i.usuario_id = u.id " +
            "INNER JOIN estado_inventario ei ON i.estado_inventario_id = ei.id " +
            "LEFT JOIN inventario_departamento iv ON i.id = iv.inventario_id " +
            "INNER JOIN departamento d ON iv.departamento_id = d.id " +
            "WHERE " +
                    "d.id = :id " +
            "ORDER BY i.id DESC", nativeQuery = true)
    List<Map<String, DeptoInventarioDTO>> findInventario(@Param("id") int id);

    @Transactional
    @Modifying
    @Query(value =
            "DELETE FROM " +
            "   MANTENCION_DEPARTAMENTO " +
            "WHERE DEPARTAMENTO_ID = :id ", nativeQuery = true)
    void removeInventarioDepartamento(@Param("id") int id);

    @Transactional
    @Modifying
    @Query(value =
            "DELETE FROM " +
                    "   INVENTARIO_DEPARTAMENTO " +
                    "WHERE DEPARTAMENTO_ID = :id ", nativeQuery = true)
    void removeMantencionDepartamento(@Param("id") int id);

    @Transactional
    @Modifying
    @Query(value =
            "DELETE FROM " +
                    "   PRODUCTO_DEPARTAMENTO " +
                    "WHERE DEPARTAMENTO_ID = :id ", nativeQuery = true)
    void removeProductoDepartamento(@Param("id") int id);


    @Transactional
    @Modifying
    @Query(value =
            "DELETE FROM " +
                    "   PREGUNTA_DEPARTAMENTO " +
                    "WHERE DEPARTAMENTO_ID = :id ", nativeQuery = true)
    void removePreguntaDepartamento(@Param("id") int id);



    //EDIT INVENTORY ASSIGN
    @Transactional
    @Modifying
    @Query(value =
            "UPDATE inventario SET  " +
            "    nombre = :nombre, " +
            "    usuario_id = :usuario_id,  " +
            "    fecha_inicio = :fecha_inicio, " +
            "    descripcion = :descripcion, " +
            "    estado_inventario_id = :estado " +
            "WHERE id = :id",nativeQuery = true)
    void updateAsignacionInventario (
            @Param("id") int id,
            @Param("nombre") String nombre,
            @Param("usuario_id") int usuario_id,
            @Param("fecha_inicio") Date fecha_inicio,
            @Param("descripcion") String descripcion,
            @Param("estado") int estado
    );


    //INVENTORY RESPONSES
    @Query(value =
            "SELECT " +
            "   i.id, " +
            "   i.nombre, " +
            "   d.nombre_edificio, " +
            "   i.observaciones, " +
            "   i.descripcion, " +
            "   i.estado_inventario_id, " +
            "   i.usuario_id as funcionario, " +
            "   d.numero as departamento, " +
            "   i.fecha_inicio, " +
            "   i.fecha_termino " +
            "FROM inventario i " +
            "INNER JOIN inventario_departamento iv " +
            "ON i.id = iv.inventario_id " +
            "INNER JOIN departamento d ON iv.departamento_id = d.id " +
            "WHERE d.id = :id and i.id = :id2", nativeQuery = true)
    List<Map<String, InventarioDetalleDTO>> findAnswersByDeptId(@Param("id")int id, @Param("id2")int id2);

    //LIST MAINTENANCE
    @Query(value =
            "SELECT " +
            "   m.id, " +
            "   m.nombre, " +
            "   m.fecha_inicio, " +
            "   m.fecha_termino, " +
            "   u.nombre ||' '|| u.apellidos as funcionario, " +
            "   m.costo, m.estado " +
            "FROM mantencion m " +
            "INNER JOIN usuario u ON m.usuario_id = u.id " +
            "INNER JOIN mantencion_departamento md ON m.id = md.mantencion_id " +
            "INNER JOIN departamento d ON md.departamento_id = d.id " +
            "WHERE d.id = :id " +
            "ORDER BY m.id DESC", nativeQuery = true)
    List<Map<String, DeptoMantencionDTO>> findMaintenanceByDeptId(@Param("id") int id);

    //EDIT MAINTENANCE ASSIGN
    @Transactional
    @Modifying
    @Query(value =
            "UPDATE mantencion SET " +
            "   fecha_inicio = :fecha_inicio, " +
            "   descripcion  = :descripcion," +
            "   nombre  = :nombre," +
            "   usuario_id = :usuario_id " +
            "WHERE id = :id", nativeQuery = true)
    void updateAsignacionMantencion(
            @Param("id") int id,
            @Param("fecha_inicio") Date fecha_inicio,
            @Param("descripcion") String descripcion,
            @Param("nombre") String nombre,
            @Param("usuario_id") int usuario_id
    );

    //MAINTENANCE DETAIL
    @Query(value =
            "SELECT " +
            "   m.id, " +
            "   m.nombre, " +
            "   m.descripcion, " +
            "   m.fecha_inicio, " +
            "   m.fecha_termino, " +
            "   d.nombre_edificio, " +
            "   d.numero, m.observaciones, " +
            "   u.id as funcionario, " +
            "   u.nombre as nombrefuncionario, " +
            "   u.apellidos as apellidofuncionario, " +
            "   m.costo, m.estado " +
            "FROM mantencion m " +
            "INNER JOIN usuario u ON m.usuario_id = u.id " +
            "INNER JOIN mantencion_departamento md ON m.id = md.mantencion_id " +
            "INNER JOIN departamento d ON md.departamento_id = d.id " +
            "WHERE d.id = :id and m.id = :id2", nativeQuery = true)
    List<Map<String, MantencionDetalleDTO>> findMantencionDetailByDeptId(@Param("id") int id, @Param("id2") int id2);

    //CANCEL MAINTENANCE
    @Transactional
    @Modifying
    @Query(value = "UPDATE mantencion m SET m.estado = :estado WHERE m.id = :id", nativeQuery = true)
    void updateEstadoMantencion(@Param("id")int id, @Param("estado") String estado);

    //LIST PRODUCT
    @Query(value = "SELECT p.id, p.nombre, pd.cantidad FROM producto p INNER JOIN producto_departamento pd ON p.id = pd.producto_id INNER JOIN departamento d ON pd.departamento_id = d.id WHERE d.id = :id",nativeQuery = true)
    List<Map<String, ProductoDTO>> findProductByDeptId(@Param("id") int id);

    //LIST QUESTIONS
     //"   AND  R.RESERVA_ID = :reserva_id " , @Param("reserva_id") int reserva_id
    @Query(value =
            "SELECT  " +
            "    p.id,  " +
            "    p.pregunta,  " +
            "    p.cantidad,  " +
            "    p.observacion,  " +
            "    R.RESPUESTA_CI, " +
            "    R.RESPUESTA_CO " +
            "FROM PREGUNTA P " +
            "LEFT JOIN RESPUESTA R ON R.PREGUNTA_ID = P.ID " +
            "INNER JOIN PREGUNTA_DEPARTAMENTO PD ON P.ID = PD.PREGUNTA_ID " +
            "INNER JOIN DEPARTAMENTO D ON PD.DEPARTAMENTO_ID = D.ID " +
            "WHERE " +
            "    D.ID = :id ", nativeQuery = true)
    List<Map<String, DeptoPreguntaDTO>> findQuestionByDeptId(@Param("id") int id);


    //LIST QUESTIONS
    @Query(value =
            "SELECT  " +
            "    P.id, " +
            "    P.pregunta, " +
            "    p.cantidad, " +
            "    p.observacion, " +
            "    p.respuesta_ci, " +
            "    p.respuesta_co " +
            "FROM PREGUNTA P " +
            "INNER JOIN PREGUNTA_DEPARTAMENTO PD ON P.id = PD.pregunta_id " +
            "INNER JOIN DEPARTAMENTO D ON D.id = PD.departamento_id " +
            "WHERE " +
            "    D.id = :id", nativeQuery = true)
    List<Map<String, DeptoPreguntaDTO>> findQuestionsByDeptId(@Param("id") int id);



    //DELETE QUESTIONS
    @Transactional
    @Modifying
    @Query(value = "DELETE FROM pregunta WHERE pregunta.id = :id",nativeQuery = true)
    void deleteQuestion(@Param("id")int id);

    //DELETE PRODUCT BY DEPART
    @Transactional
    @Modifying
    @Query(value = "DELETE FROM producto_departamento WHERE departamento_id  = :id and producto_id = :id2", nativeQuery = true)
    void deleteProductByDept(@Param("id")int id, @Param("id2")int id2);

    //CREATE QUESTION BY DEPT
    @Transactional
    @Modifying
    @Query(value = "INSERT INTO pregunta (id, pregunta, observacion, cantidad, flag_depto) VALUES (SEQ_PREGUNTA.nextval, :pregunta, :observacion, :cantidad, :flag_depto)",nativeQuery = true)
    void createQuestionByDept(@Param("pregunta")String pregunta, @Param("observacion")String observacion,@Param("cantidad")int cantidad, @Param("flag_depto")int flag_depto);

    //CREATE INVENTORY ASSIGN
    @Transactional
    @Modifying
    @Query(value =
            "INSERT INTO inventario (" +
            "   id," +
            "   nombre, " +
            "   fecha_inicio, " +
            "   descripcion, " +
            "   usuario_id, " +
            "   estado_inventario_id, " +
            "   flag_depto) " +
            "VALUES (" +
            "   SEQ_INVENTARIO.nextval, " +
            "   :nombre, " +
            "   :fecha_inicio, " +
            "   :descripcion, " +
            "   :usuario_id, " +
            "   :estado_inventario_id,  " +
            "   :depto)", nativeQuery = true)
    void createAsignacionInventario(
            @Param("nombre") String nombre,
            @Param("fecha_inicio") Date fecha_inicio,
            @Param("descripcion") String descripcion,
            @Param("usuario_id") int usuario_id,
            @Param("estado_inventario_id") Integer estado_inventario_id,
            @Param("depto")int depto
    );

    //CREATE ASSIGN MAINTENANCE
    @Transactional
    @Modifying
    @Query(value =
            "INSERT INTO mantencion " +
                    "(ID, NOMBRE, DESCRIPCION, FECHA_INICIO, ESTADO, USUARIO_ID, FLAG_DEPTO) " +
            "VALUES (" +
                    "SEQ_MANTENCION.nextval, " +
                    ":nombre, " +
                    ":descripcion, " +
                    ":fecha_inicio, " +
                    ":estado, " +
                    ":usuario_id, :depto)", nativeQuery = true)
    void insertMantencion(
            @Param("nombre") String nombre,
            @Param("descripcion") String descripcion,
            @Param("fecha_inicio") Date fecha_inicio,
            @Param("estado") String estado,
            @Param("usuario_id") int usuario_id,
            @Param("depto") Integer depto);

    //ADD PRODUCT BY DEPT
    @Transactional
    @Modifying
    @Query(value = "INSERT INTO producto_departamento (id, departamento_id, producto_id, cantidad) VALUES (SEQ_PRODUCTO_DEPARTAMENTO.nextval, :departamento_id, :producto_id, :cantidad)",nativeQuery = true)
    void insertProductByDept(@Param("departamento_id") int departamento_id, @Param("producto_id") int producto_id, @Param("cantidad") int cantidad);

    //STATES LIST
    @Query(value = "SELECT id, nombre from estado_inventario",nativeQuery = true)
    List<Map<String, EstadoInventarioDTO>> getEstadosInventario ();


    //PRODUCT LIST
    @Query(value = "SELECT id, nombre FROM producto", nativeQuery = true)
    List<Map<String, ProductoDTO>> getListaProducto();

    //DEPARTMENT DETAIL
    @Query(value = "SELECT id, nombre_edificio, numero, direccion, piso, valor_arriendo, dormitorios, banos, mt2, porc_anticipo, evaluo, fecha_construccion, imagen, imagen2, imagen3 FROM departamento WHERE id = :id", nativeQuery = true)
    List<Map<String,DepartamentoDetalleDTO>> getDepartamentoDetalle(@Param("id")int id);

    /////////////


    @Transactional
    @Modifying
    @Query(value =
        "INSERT INTO DEPARTAMENTO " +
        "    (ID, DORMITORIOS, MT2, NUMERO, BANOS, PISO, FECHA_CONSTRUCCION, EVALUO, DIRECCION, " +
        "    VALOR_ARRIENDO, PORC_ANTICIPO, NOMBRE_EDIFICIO, TIPODEPARTAMENTO_ID, ESTADODEPARTAMENTO_ID, COMUNA_ID, " +
        "    IMAGEN, IMAGEN2, IMAGEN3) " +
        "VALUES " +
        "    (SEQ_DEPARTAMENTO.nextval, :dormitorios, :mt2, :numero, :banos, :piso, :fecha_construccion, :evaluo, " +
        "    :direccion, :valor_arriendo, :porc_anticipo, :nombre_edificio, :tipodepartamento_id, :estadodepartamento_id, :comuna_id, " +
        "    :imagen, :imagen2, :imagen3)",nativeQuery = true)
    void addDepartment(@Param("dormitorios") int dormitorios,
                       @Param("mt2") int mt2,
                       @Param("numero") int numero,
                       @Param("banos") int banos,
                       @Param("piso") int piso,
                       @Param("fecha_construccion") Date fecha_construccion,
                       @Param("evaluo") int evaluo,
                       @Param("direccion") String direccion,
                       @Param("valor_arriendo") int valor_arriendo,
                       @Param("porc_anticipo") int porc_anticipo,
                       @Param("nombre_edificio") String nombre_edificio,
                       @Param("tipodepartamento_id") int tipodepartamento_id,
                       @Param("estadodepartamento_id") int estadodepartamento_id,
                       @Param("comuna_id") int comuna_id,
                       @Param("imagen") String imagen,
                       @Param("imagen2") String imagen2,
                       @Param("imagen3") String imagen3);


    @Transactional
    @Modifying
    @Query(value =
            "UPDATE DEPARTAMENTO  " +
            "    SET DORMITORIOS = :dormitorios, MT2 = :mt2, NUMERO = :numero, BANOS = :banos, PISO = :piso, FECHA_CONSTRUCCION = :fecha_construccion, " +
            "    EVALUO = :evaluo, DIRECCION = :direccion, VALOR_ARRIENDO = :valor_arriendo, PORC_ANTICIPO = :porc_anticipo, " +
            "    NOMBRE_EDIFICIO = :nombre_edificio, TIPODEPARTAMENTO_ID = :tipodepartamento_id, ESTADODEPARTAMENTO_ID = :estadodepartamento_id, " +
            "    COMUNA_ID = :comuna_id, IMAGEN = :imagen, IMAGEN2 = :imagen2, IMAGEN3 = :imagen3 " +
            "WHERE  " +
            "    ID = :id", nativeQuery = true)
    void updateDepartment(@Param("id") int id,
                          @Param("dormitorios") int dormitorios,
                          @Param("mt2") int mt2,
                          @Param("numero") int numero,
                          @Param("banos") int banos,
                          @Param("piso") int piso,
                          @Param("fecha_construccion") Date fecha_construccion,
                          @Param("evaluo") int evaluo,
                          @Param("direccion") String direccion,
                          @Param("valor_arriendo") int valor_arriendo,
                          @Param("porc_anticipo") int porc_anticipo,
                          @Param("nombre_edificio") String nombre_edificio,
                          @Param("tipodepartamento_id") int tipodepartamento_id,
                          @Param("estadodepartamento_id") int estadodepartamento_id,
                          @Param("comuna_id") int comuna_id,
                          @Param("imagen") String imagen,
                          @Param("imagen2") String imagen2,
                          @Param("imagen3") String imagen3);



    @Query(value = "SELECT DP.ID,DP.DORMITORIOS,DP.MT2,DP.NUMERO,DP.BANOS,DP.PISO,DP.NOMBRE_EDIFICIO,DP.DIRECCION,DP.VALOR_ARRIENDO,DP.PORC_ANTICIPO, DP.IMAGEN, DP.IMAGEN2, DP.IMAGEN3, TD.ID AS TIPO_ID,TD.NOMBRE AS TIPO FROM DEPARTAMENTO DP INNER JOIN TIPO_DEPARTAMENTO TD ON DP.TIPODEPARTAMENTO_ID = TD.ID", nativeQuery = true)
    List<Map<String, DepartamentosDTO>> clienteDepartamentos();

    @Query(value =
            "SELECT " +
                    "DP.ID," +
                    "DP.DORMITORIOS," +
                    "DP.MT2," +
                    "DP.NUMERO," +
                    "DP.BANOS," +
                    "DP.PISO," +
                    "DP.NOMBRE_EDIFICIO," +
                    "DP.DIRECCION," +
                    "DP.VALOR_ARRIENDO," +
                    "DP.PORC_ANTICIPO, " +
                    "DP.IMAGEN, " +
                    "DP.IMAGEN2, " +
                    "DP.IMAGEN3, " +
                    "TD.ID AS TIPO_ID," +
                    "TD.NOMBRE AS TIPO, " +
                    "DP.COMUNA_ID  " +
                    "FROM DEPARTAMENTO DP " +
                    "INNER JOIN TIPO_DEPARTAMENTO TD ON DP.TIPODEPARTAMENTO_ID = TD.ID " +
                    "WHERE DP.id = :id", nativeQuery = true)
    List<Map<String, DepartamentosDTO>> clienteDepartamento(@Param("id") int id);


    @Query(value =
            "SELECT  " +
                    "    M.ID, " +
                    "    M.NOMBRE, " +
                    "    M.VALOR, " +
                    "    M.RESERVA_ID " +
                    "FROM RESERVA R " +
                    "INNER JOIN MULTA M ON R.MULTA_ID = M.ID " +
                    "WHERE  " +
                    "    R.CLIENTE_ID = :id AND " +
                    "    M.BOLETA_ID IS NULL", nativeQuery = true)
    List<Map<String, ClienteMultaDTO>> clienteMultas(@Param("id") int id);

}

