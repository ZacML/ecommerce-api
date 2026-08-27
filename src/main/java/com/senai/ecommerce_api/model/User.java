package com.senai.ecommerce_api.model;

import com.senai.ecommerce_api.dto.UserDTO;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String nome;
    @NotNull
    private String cpf;
    @NotNull
    private String endereco;
    @NotNull
    private String email;
    @NotNull
    private String telefone;
    @NotNull
    private LocalDateTime data_cadastro;

    public static User convert(UserDTO userDTO) {
        User user = new User();
        user.setNome(userDTO.getNome());
        user.setCpf(userDTO.getCpf());
        user.setEndereco(userDTO.getEndereco());
        user.setEmail(userDTO.getEmail());
        user.setTelefone(userDTO.getTelefone());
        user.setData_cadastro(userDTO.getDataCadastro());

        return user;
    }
}
