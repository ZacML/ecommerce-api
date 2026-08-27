package com.senai.ecommerce_api.service;

import java.util. List;
import java.util. stream. Collectors;

import com.senai.ecommerce_api.dto.UserDTO;
import com.senai.ecommerce_api.model.User;
import com.senai.ecommerce_api.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public List<UserDTO> getAll() {
        List<User> usuarios = userRepository.findAll();
        return usuarios
                .stream()
                .map (UserDTO::convert)
                .collect(Collectors.toList());

    }

}