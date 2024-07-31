package com.axioma.controlesdeseguridad.domain.services;


import com.axioma.controlesdeseguridad.application.dto.UserDTO;

import java.util.List;
import java.util.Optional;

public interface IUserService {

    public List<UserDTO> findAll();

    public Optional<UserDTO> findById(Long id);

    public UserDTO createUser(UserDTO userDTO);

    UserDTO update(Long id, UserDTO userDTO);

    public void deletedById(Long id);

}