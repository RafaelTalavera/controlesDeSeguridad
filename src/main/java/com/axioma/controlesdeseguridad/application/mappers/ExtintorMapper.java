package com.axioma.controlesdeseguridad.application.mappers;


import com.axioma.controlesdeseguridad.application.dto.ExtintorDTO;
import com.axioma.controlesdeseguridad.domain.models.Extintor;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ExtintorMapper {
    ExtintorDTO toDTO(Extintor extintor);
    Extintor toEntity(ExtintorDTO extintorDTO);
}
