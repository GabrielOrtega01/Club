package com.clubesmongodbgabo.app.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.clubesmongodbgabo.app.variables.Competicion;

public interface CompeticionRepositorio extends MongoRepository<Competicion, String>{

}