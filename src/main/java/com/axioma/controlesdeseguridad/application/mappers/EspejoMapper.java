package com.axioma.controlesdeseguridad.application.mappers;

import com.axioma.controlesdeseguridad.application.dto.EspejoDTO;
import com.axioma.controlesdeseguridad.domain.models.Espejo;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface EspejoMapper {
    EspejoDTO toDTO(Espejo espejo);
    Espejo toEntity(EspejoDTO espejoDTO);
}
