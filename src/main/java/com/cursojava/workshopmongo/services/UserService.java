package com.cursojava.workshopmongo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cursojava.workshopmongo.domain.User;
import com.cursojava.workshopmongo.repository.UserRepository;

@Service // Mostra para o Spring que é um Serviço
public class UserService {
    @Autowired // Instancia automaticamente um objeto
    private UserRepository repo;

    public List<User> findAll(){
        return repo.findAll();
    }
}
