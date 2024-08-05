package com.axioma.controlesdeseguridad.application.mappers;


import com.axioma.controlesdeseguridad.application.dto.ExtintorDTO;
import com.axioma.controlesdeseguridad.domain.models.Extintor;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface ExtintorMapper {

    ExtintorMapper INSTANCE = Mappers.getMapper(ExtintorMapper.class);

    ExtintorDTO toDTO(Extintor extintor);
    Extintor toEntity(ExtintorDTO extintorDTO);
}
