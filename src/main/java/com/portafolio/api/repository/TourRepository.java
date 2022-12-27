package com.portafolio.api.repository;

import com.portafolio.api.dto.TourDTO;
import com.portafolio.api.dto.cliente.TourClienteDTO;
import com.portafolio.api.dto.cliente.TourComunaDTO;
import com.portafolio.api.dto.FiltrarTourCiudadDTO;
import com.portafolio.api.dto.FiltrarTourIdDTO;
import com.portafolio.api.dto.ListaMantencionDTO;
import com.portafolio.api.dto.filtros.CiudadDTO;
import com.portafolio.api.dto.filtros.ComunasDTO;
import com.portafolio.api.entity.Tour;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;
import java.util.Map;

public interface TourRepository extends CrudRepository<Tour, Integer> {

    @Query(value ="SELECT ID, NOMBRE, DESCRIPCION, UBICACION, VALOR, FECHA_INICIO, FECHA_TERMINO FROM TOUR WHERE COMUNA_ID = :id", nativeQuery = true)
    List<Map<String, TourComunaDTO>> tourComuna(@Param("id") int id);

    @Query(value =
            "SELECT " +
            "    t.ID, " +
            "    t.NOMBRE, " +
            "    t.DESCRIPCION, " +
            "    t.UBICACION, " +
            "    t.VALOR, " +
            "    t.FECHA_INICIO, " +
            "    t.FECHA_TERMINO, " +
            "    t.COMUNA_ID, " +
            "    t.TRANSPORTE, " +
            "    t.IMAGE, " +
            "    t.IMAGE2, " +
            "    t.IMAGE3, " +
            "    c.NOMBRE comuna_nombre, " +
            "    ci.nombre ciudad_nombre " +
            "FROM TOUR t " +
            "INNER JOIN COMUNA c ON t.COMUNA_ID = c.id " +
            "LEFT JOIN CIUDAD ci ON c.CIUDAD_ID = ci.id " +
            "ORDER BY t.ID DESC", nativeQuery = true)
    List<Map<String, TourClienteDTO>> toursCliente();

    //FILTER TOUR BY ID
    //@Query(value="SELECT t.id ,t.nombre as nombre_tour, t.descripcion,t.UBICACION, t.valor,t.FECHA_INICIO, t.FECHA_TERMINO from tour t WHERE t.id=:id", nativeQuery = true)
    @Query(value=
            "SELECT  " +
            "    ID, " +
            "    NOMBRE, " +
            "    DESCRIPCION, " +
            "    UBICACION, " +
            "    VALOR, " +
            "    FECHA_INICIO, " +
            "    FECHA_TERMINO, " +
            "    COMUNA_ID, " +
            "    IMAGE, IMAGE2, IMAGE3 " +
            "FROM TOUR  " +
            "WHERE ID = :id " +
            "ORDER BY ID DESC", nativeQuery = true)
    List<Map<String, FiltrarTourIdDTO>> findTourById(@Param("id")int id);


    //FILTER TOUR BY CITY
    @Query(value="SELECT t. id as codigo,t.nombre as nombre_tour, t.descripcion, t.valor,t.UBICACION from tour t inner join COMUNA co on t.COMUNA_ID=co.ID inner join ciudad ci on co.ciudad_id=ci.ID WHERE ci.id=:id", nativeQuery = true)
    List<Map<String, FiltrarTourCiudadDTO>> findTourByCity(@Param("id")int id);

    @Transactional
    @Modifying
    @Query(value=
            "INSERT INTO TOUR (" +
            "   ID, " +
            "   NOMBRE, " +
            "   DESCRIPCION, " +
            "   UBICACION, " +
            "   VALOR, " +
            "   FECHA_INICIO, " +
            "   FECHA_TERMINO, " +
            "   COMUNA_ID, " +
            "   IMAGE, IMAGE2, IMAGE3) " +
            "VALUES (" +
            "   SEQ_TOUR.NEXTVAL, " +
            "   :nombre, " +
            "   :descripcion, " +
            "   :ubicacion," +
            "   :valor, " +
            "   :fecha_inicio, " +
            "   :fecha_termino," +
            "   :comuna_id," +
            "   :image, :image2, :image3)", nativeQuery = true)
    void addTours(
            @Param("nombre") String nombre,
            @Param("descripcion") String descripcion,
            @Param("ubicacion") String ubicacion,
            @Param("valor") int valor,
            @Param("fecha_inicio") Date fecha_inicio,
            @Param("fecha_termino") Date fecha_termino,
            @Param("comuna_id") Integer comuna_id,
            @Param("image") String image,
            @Param("image2") String image2,
            @Param("image3") String image3
    );

    @Transactional
    @Modifying
    @Query(value =
            "UPDATE TOUR SET " +
            "   NOMBRE = :nombre, " +
            "   DESCRIPCION = :descripcion, " +
            "   UBICACION = :ubicacion, " +
            "   VALOR = :valor, " +
            "   FECHA_INICIO = :fecha_inicio, " +
            "   FECHA_TERMINO = :fecha_termino, " +
            "   COMUNA_ID = :comuna_id, " +
            "   IMAGE = :image, IMAGE2 = :image2, IMAGE3 = :image3 " +
            "WHERE ID = :id", nativeQuery = true)
    void updateTour(
            @Param("id") int id,
            @Param("nombre") String nombre,
            @Param("descripcion") String descripcion,
            @Param("ubicacion") String ubicacion,
            @Param("valor") int valor,
            @Param("fecha_inicio") Date fecha_inicio,
            @Param("fecha_termino") Date fecha_termino,
            @Param("comuna_id") int comuna_id,
            @Param("image") String image,
            @Param("image2") String image2,
            @Param("image3") String image3
    );


    @Transactional
    @Modifying
    @Query(value =
            "DELETE FROM TOUR WHERE ID = :id", nativeQuery = true)
    void DeleteTour(@Param("id") int id);


    @Query(value = "SELECT ID, NOMBRE FROM CIUDAD", nativeQuery = true)
    List<Map<String, CiudadDTO>> getCiudades();

    @Query(value = "SELECT ID, NOMBRE FROM COMUNA", nativeQuery = true)
    List<Map<String, ComunasDTO>> getComunas();

}
