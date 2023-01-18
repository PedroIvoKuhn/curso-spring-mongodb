package com.cursojava.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.cursojava.workshopmongo.domain.User;

// Para implementar o repositório é só extender o MongoRepository
// MongoRepository<Tipo da classe que vai gerenciar, qual o tipo do ID da classe>
public interface UserRepository extends MongoRepository<User, String> {
    
}
