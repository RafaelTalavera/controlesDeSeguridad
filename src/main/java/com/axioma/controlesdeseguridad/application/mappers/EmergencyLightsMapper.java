package com.axioma.controlesdeseguridad.application.mappers;

import com.axioma.controlesdeseguridad.application.dto.EmergencyLightsDTO;
import com.axioma.controlesdeseguridad.domain.models.EmergencyLights;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface EmergencyLightsMapper {

    EmergencyLightsMapper INSTANCE = Mappers.getMapper(EmergencyLightsMapper.class);
    EmergencyLightsDTO toDTO(EmergencyLights emergencyLights);
    EmergencyLights toEntity(EmergencyLightsDTO emergencyLightsDTO);
}
