package com.cursojava.workshopmongo.resources;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cursojava.workshopmongo.domain.User;
import com.cursojava.workshopmongo.dto.UserDTO;
import com.cursojava.workshopmongo.services.UserService;

@RestController // Indica que essa classe vai ser um recurso REST
@RequestMapping(value = "/users") // Caminho do endpoint
public class UserResource {

    @Autowired // Instancia automaticamente um objeto
    private UserService service;

    // Método http utilizado no endpoint
    // pode usar também o @RequestMapping(method=RequestMethod.GET)
    @GetMapping 
    public ResponseEntity<List<UserDTO>> findAll() {
        List<User> list = service.findAll();
        List<UserDTO> listDto = list.stream().map(x -> new UserDTO(x)).collect(Collectors.toList());
        return ResponseEntity.ok().body(listDto);
    }
}
