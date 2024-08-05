package com.axioma.controlesdeseguridad.application.mappers;

import com.axioma.controlesdeseguridad.application.dto.EspejoDTO;
import com.axioma.controlesdeseguridad.domain.models.Espejo;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface EspejoMapper {

    EspejoMapper INSTANCE = Mappers.getMapper(EspejoMapper.class);

    EspejoDTO toDTO(Espejo espejo);
    Espejo toEntity(EspejoDTO espejoDTO);
}
