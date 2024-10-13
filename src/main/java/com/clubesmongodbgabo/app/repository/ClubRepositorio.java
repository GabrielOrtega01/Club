package com.clubesmongodbgabo.app.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.clubesmongodbgabo.app.variables.Club;

public interface ClubRepositorio extends MongoRepository<Club, String>{

}
