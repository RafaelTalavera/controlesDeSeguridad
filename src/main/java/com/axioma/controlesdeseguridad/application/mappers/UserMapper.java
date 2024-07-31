package com.axioma.controlesdeseguridad.application.mappers;

import com.axioma.controlesdeseguridad.application.dto.UserDTO;
import com.axioma.controlesdeseguridad.domain.models.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface UserMapper {
    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    @Mapping(target = "id", source = "id")
    @Mapping(target = "name", source = "name")
    @Mapping(target = "lastname", source = "lastname")
    @Mapping(target = "job", source = "job")
    @Mapping(target = "signature", source = "signature")
    UserDTO toDTO(User user);

    @Mapping(target = "id", source = "id")
    @Mapping(target = "name", source = "name")
    @Mapping(target = "lastname", source = "lastname")
    @Mapping(target = "job", source = "job")
    @Mapping(target = "signature", source = "signature")
    User toEntity(UserDTO userDTO);
}
