package com.clubesmongodbgabo.app.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.clubesmongodbgabo.app.variables.Entrenador;

public interface EntrenadorRepositorio extends MongoRepository <Entrenador, String>{

}
