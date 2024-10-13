package com.clubesmongodbgabo.app.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.clubesmongodbgabo.app.variables.Asociacion;

public interface AsociacionRepositorio extends MongoRepository<Asociacion, String> {

}
