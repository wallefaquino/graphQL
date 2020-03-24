package com.walleftech.graphql.service;

import com.walleftech.graphql.models.Maquina;
import com.walleftech.graphql.repositories.MaquinaRepository;
import graphql.schema.DataFetcher;
import graphql.schema.DataFetchingEnvironment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MaquinasDataFetcher implements DataFetcher<List<Maquina>> {

    @Autowired
    private MaquinaRepository repository;

    @Override
    public List<Maquina> get(DataFetchingEnvironment dataFetchingEnvironment) {
        return repository.findAll();
    }
}
