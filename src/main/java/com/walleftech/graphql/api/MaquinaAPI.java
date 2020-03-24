package com.walleftech.graphql.api;

import com.walleftech.graphql.service.MaquinaService;
import graphql.ExecutionResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/maquinas")
public class MaquinaAPI {

    @Autowired
    private MaquinaService service;

    @PostMapping
    public ResponseEntity<Object> getAllMaquinas(@RequestBody String query) {
        ExecutionResult execute = service.getGraphQL().execute(query);

        return new ResponseEntity<>(execute, HttpStatus.OK);
    }
}
