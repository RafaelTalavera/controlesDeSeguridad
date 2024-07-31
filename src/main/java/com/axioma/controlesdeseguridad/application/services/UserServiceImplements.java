package com.axioma.controlesdeseguridad.application.services;

import com.axioma.controlesdeseguridad.application.dto.UserDTO;
import com.axioma.controlesdeseguridad.application.mappers.UserMapper;
import com.axioma.controlesdeseguridad.domain.models.User;
import com.axioma.controlesdeseguridad.domain.repositories.UserRepository;
import com.axioma.controlesdeseguridad.domain.services.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class UserServiceImplements implements IUserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserMapper userMapper;

    @Override
    @Transactional
    public List<UserDTO> findAll() {
        return StreamSupport.stream(userRepository.findAll().spliterator(), false)
                .map(userMapper::toDTO)
                .collect(Collectors.toList());
    }

    @Override
    @Transactional
    public Optional<UserDTO> findById(Long id) {
        return userRepository.findById(id).map(userMapper::toDTO);
    }

    @Override
    @Transactional
    public UserDTO createUser(UserDTO userDTO) {
        System.out.println("Creating User: " + userDTO);
        User user = userMapper.toEntity(userDTO);
        System.out.println("Mapped Entity: " + user);
        user = userRepository.save(user);
        System.out.println("Saved Entity: " + user);
        return userMapper.toDTO(user);
    }

    @Override
    @Transactional
    public UserDTO update(Long id, UserDTO userDTO) {
        if (userRepository.existsById(id)) {
            User user = userMapper.toEntity(userDTO);
            user.setId(id);
            user = userRepository.save(user);
            return userMapper.toDTO(user);
        }
        return null;
    }

    @Override
    @Transactional
    public void deletedById(Long id) {
        userRepository.deleteById(id);
    }
}
