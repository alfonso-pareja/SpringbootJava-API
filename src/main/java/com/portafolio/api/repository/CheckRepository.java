package com.portafolio.api.repository;

import com.portafolio.api.dto.funcionario.CheckDetailDTO;
import com.portafolio.api.dto.funcionario.QuestionDTO;
import com.portafolio.api.entity.Check;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;
import java.util.Map;

@Repository
public interface CheckRepository extends JpaRepository<Check, Integer> {


    @Transactional
    @Modifying
    @Query(value =
            "SELECT  " +
                "    CK.ID CHECKIN_ID,  " +
                "    CK.OBSERVACION CHECKIN_OBS,  " +
                "    CO.ID CHECKOUT_ID,  " +
                "    CO.OBSERVACION CHECKOUT_OBS,  " +
                "    CK.CREATED_AT FECHA_CHECKIN,  " +
                "    CO.CREATED_AT FECHA_CHECKOUT,  " +
                "    R.ID RESERVA_ID,  " +
                "    R.FECHA_INICIO,  " +
                "    R.FECHA_TERMINO, " +
                "    R.BOLETA_ID PAGO_RESERVA, " +
                "    D.ID DEPTO_ID,  " +
                "    D.NUMERO DEPTO_NUM,  " +
                "    D.DIRECCION,  " +
                "    D.NOMBRE_EDIFICIO,  " +
                "    R.CLIENTE_ID, " +
                "    U.NOMBRE USUARIO_NOMBRE,  " +
                "    U.APELLIDOS USUARIO_APELLIDOS, " +
                "    R.COSTO VALOR_RESERVA, " +
                "    R.TRANSPORTE TIENE_TRANSPORTE, " +
                "    T.VALOR VALOR_TOUR, " +
                "    M.NOMBRE MOTIVO_MULTA, " +
                "    M.VALOR VALOR_MULTA, " +
                "    M.BOLETA_ID PAGO_MULTA " +
            "FROM CHECKIN CK " +
            "INNER JOIN RESERVA R ON R.ID = CK.RESERVA_ID " +
            "INNER JOIN DEPARTAMENTO D ON D.ID = CK.DEPARTAMENTO_ID " +
            "LEFT JOIN CHECKOUT CO ON CO.CHECKIN_ID = CK.ID " +
            "INNER JOIN USUARIO U ON U.ID = R.CLIENTE_ID " +
            "LEFT JOIN TOUR T ON T.ID = R.TOUR " +
            "LEFT JOIN MULTA M ON M.ID = R.MULTA_ID " +
            "ORDER BY CK.ID DESC", nativeQuery = true)
    List<Map<String, CheckDetailDTO>> getAllChecks();


    @Transactional
    @Modifying
    @Query(value =
            "SELECT  " +
                    "    CK.ID CHECKIN_ID,  " +
                    "    CK.OBSERVACION CHECKIN_OBS,  " +
                    "    CO.ID CHECKOUT_ID,  " +
                    "    CO.OBSERVACION CHECKOUT_OBS,  " +
                    "    CK.CREATED_AT FECHA_CHECKIN,  " +
                    "    CO.CREATED_AT FECHA_CHECKOUT,  " +
                    "    R.ID RESERVA_ID,  " +
                    "    R.FECHA_INICIO,  " +
                    "    R.FECHA_TERMINO, " +
                    "    R.BOLETA_ID PAGO_RESERVA, " +
                    "    D.ID DEPTO_ID,  " +
                    "    D.NUMERO DEPTO_NUM,  " +
                    "    D.DIRECCION,  " +
                    "    D.NOMBRE_EDIFICIO,  " +
                    "    R.CLIENTE_ID, " +
                    "    U.NOMBRE USUARIO_NOMBRE,  " +
                    "    U.APELLIDOS USUARIO_APELLIDOS, " +
                    "    R.COSTO VALOR_RESERVA, " +
                    "    R.TRANSPORTE TIENE_TRANSPORTE, " +
                    "    T.VALOR VALOR_TOUR, " +
                    "    M.NOMBRE MOTIVO_MULTA, " +
                    "    M.VALOR VALOR_MULTA, " +
                    "    M.BOLETA_ID PAGO_MULTA " +
                    "FROM CHECKIN CK " +
                    "INNER JOIN RESERVA R ON R.ID = CK.RESERVA_ID " +
                    "INNER JOIN DEPARTAMENTO D ON D.ID = CK.DEPARTAMENTO_ID " +
                    "LEFT JOIN CHECKOUT CO ON CO.CHECKIN_ID = CK.ID " +
                    "INNER JOIN USUARIO U ON U.ID = R.CLIENTE_ID " +
                    "LEFT JOIN TOUR T ON T.ID = R.TOUR " +
                    "LEFT JOIN MULTA M ON M.ID = R.MULTA_ID " +
                    "WHERE CK.USUARIO_ID = :id " +
                    "ORDER BY CK.ID DESC", nativeQuery = true)
    List<Map<String, CheckDetailDTO>> getChecks(@Param("id") int id);


    @Query(value = 
            "SELECT   " +
            "    P.ID, " +
            "    P.PREGUNTA, " +
            "    P.RESPUESTA_CI, " +
            "    P.RESPUESTA_CO, " +
            "    P.CANTIDAD " +
            "FROM PREGUNTA P  " +
            "INNER JOIN PREGUNTA_DEPARTAMENTO PD ON PD.PREGUNTA_ID = P.ID " +
            "INNER JOIN CHECKIN C ON C.ID = P.CHECKIN_ID " +
            "INNER JOIN RESERVA R ON R.ID = C.RESERVA_ID " +
            "WHERE " +
            "    PD.DEPARTAMENTO_ID = :departamento_id AND  " +
            "    R.ID = :reserva_id ", nativeQuery = true)
    List<Map<String, QuestionDTO>> getQuestions(
            @Param("departamento_id") int departamento_id,
            @Param("reserva_id") int reserva_id
    );


    /**
     * Insert CheckIN
     * @param departamento_id
     * @param boleta_id
     * @param reserva_id
     * @param usuario_id
     * @param observacion
     */
    @Transactional
    @Modifying
    @Query(value =
            "INSERT INTO CHECKIN (" +
                    "ID, " +
                    "DEPARTAMENTO_ID, " +
                    "BOLETA_ID, " +
                    "RESERVA_ID, " +
                    "USUARIO_ID, " +
                    "CREATED_AT, " +
                    "OBSERVACION) " +
            "VALUES (" +
                    "SEQ_CHECKIN.nextval, " +
                    ":departamento_id, " +
                    ":boleta_id, " +
                    ":reserva_id, " +
                    ":usuario_id, " +
                    ":fecha, " +
                    ":observacion" +
                    ")", nativeQuery = true)
    void addCheckIn(
            @Param("departamento_id") int departamento_id,
            @Param("boleta_id") String boleta_id,
            @Param("reserva_id") int reserva_id,
            @Param("usuario_id") int usuario_id,
            @Param("fecha") Date fecha,
            @Param("observacion") String observacion);

    @Transactional
    @Modifying
    @Query(value =
            "INSERT INTO CHECKOUT (" +
                    "ID, " +
                    "CHECKIN_ID, " +
                    "CREATED_AT, " +
                    "DEPARTAMENTO, " +
                    "OBSERVACION) " +
            "VALUES (" +
                    "SEQ_CHECKOUT.nextval, " +
                    ":checkin_id, " +
                    ":fecha, " +
                    ":depto, " +
                    ":observacion" +
            ")", nativeQuery = true)
    void addCheckOut(
            @Param("checkin_id") int checkin_id,
            @Param("fecha") Date fecha,
            @Param("depto") Integer depto,
            @Param("observacion") String observacion);



    /**
     * UPDATE Pregunta Checkin
     * @param id
     * @param respuesta_ci
     */
    @Transactional
    @Modifying
    @Query(value =
            "UPDATE RESPUESTA SET  " +
            "    RESPUESTA_CI = :respuesta_ci " +
            "WHERE " +
            "    DEPARTAMENTO_ID = :departamento_id AND " +
            "    RESERVA_ID = :reserva_id AND " +
            "    PREGUNTA_ID = :id", nativeQuery = true)
    void updateQuestionsCheckIn(
            @Param("id") Integer id,
            @Param("reserva_id") Integer reserva_id,
            @Param("departamento_id") Integer departamento_id,
            @Param("respuesta_ci") String respuesta_ci);


    /**
     * UPDATE Pregunta Checkout
     * @param id
     * @param respuesta_co
     */
    @Transactional
    @Modifying
    @Query(value =
            "UPDATE RESPUESTA SET  " +
            "    RESPUESTA_CO = :respuesta_co " +
            "WHERE " +
            "    DEPARTAMENTO_ID = :departamento_id AND " +
            "    RESERVA_ID = :reserva_id AND " +
            "    PREGUNTA_ID = :id", nativeQuery = true)
    void updateQuestionsCheckOut(
            @Param("id") Integer id,
            @Param("reserva_id") Integer reserva_id,
            @Param("departamento_id") Integer departamento_id,
            @Param("respuesta_co") String respuesta_co);


    @Transactional
    @Modifying
    @Query(value =
            "INSERT INTO MULTA " +
                    "(ID, NOMBRE, VALOR, RESERVA_ID) " +
            "VALUES (SEQ_MULTA.nextval, :motivo, :valor, :reserva_id)", nativeQuery = true)
    void addMulta(
            @Param("motivo") String motivo,
            @Param("valor") Integer valor,
            @Param("reserva_id") Integer reserva_id);


    @Transactional
    @Modifying
    @Query(value = "UPDATE MULTA SET BOLETA_ID = :boleta_id WHERE ID = :multa_id", nativeQuery = true)
    void addMultaPay(
            @Param("boleta_id") String boleta_id,
            @Param("multa_id") Integer multa_id);
}
