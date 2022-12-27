package com.portafolio.api.dto.funcionario;

public class QuestionDTO {

    private Integer ID;
    private String PREGUNTA;
    private String RESPUESTA_CI;
    private String RESPUESTA_CO;
    private Integer CANTIDAD;

    public QuestionDTO(Integer ID, String PREGUNTA, String RESPUESTA_CI, String RESPUESTA_CO, Integer CANTIDAD) {
        this.ID = ID;
        this.PREGUNTA = PREGUNTA;
        this.RESPUESTA_CI = RESPUESTA_CI;
        this.RESPUESTA_CO = RESPUESTA_CO;
        this.CANTIDAD = CANTIDAD;
    }


    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getPREGUNTA() {
        return PREGUNTA;
    }

    public void setPREGUNTA(String PREGUNTA) {
        this.PREGUNTA = PREGUNTA;
    }

    public String getRESPUESTA_CI() {
        return RESPUESTA_CI;
    }

    public void setRESPUESTA_CI(String RESPUESTA_CI) {
        this.RESPUESTA_CI = RESPUESTA_CI;
    }

    public String getRESPUESTA_CO() {
        return RESPUESTA_CO;
    }

    public void setRESPUESTA_CO(String RESPUESTA_CO) {
        this.RESPUESTA_CO = RESPUESTA_CO;
    }

    public Integer getCANTIDAD() {
        return CANTIDAD;
    }

    public void setCANTIDAD(Integer CANTIDAD) {
        this.CANTIDAD = CANTIDAD;
    }
}
