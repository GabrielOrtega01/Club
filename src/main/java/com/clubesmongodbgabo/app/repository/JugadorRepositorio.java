package com.clubesmongodbgabo.app.repository;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.clubesmongodbgabo.app.variables.Jugador;

public interface JugadorRepositorio extends MongoRepository <Jugador, String>{

}
