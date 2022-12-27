package com.portafolio.api.dto.funcionario;

import java.util.List;

public class TestQuestionDTO {
    List<QuestionCheckInDTO> questions;

    public TestQuestionDTO(List<QuestionCheckInDTO> questions) {
        this.questions = questions;
    }

    public List<QuestionCheckInDTO> getQuestions() {
        return questions;
    }

    public void setQuestions(List<QuestionCheckInDTO> questions) {
        this.questions = questions;
    }
}
