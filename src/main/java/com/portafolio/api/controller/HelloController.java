package com.portafolio.api.controller;

import com.portafolio.api.entity.Test;
import com.portafolio.api.model.ResponseHandler;
import com.portafolio.api.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class HelloController {

    @Autowired
    private TestService testService;

    @GetMapping({ "/hello" })
    public ResponseEntity<Object> hello() {
        List<Test> t = testService.ListTest();
        return ResponseHandler.send("Ok", HttpStatus.OK, t );
    }

}
