package com.axioma.controlesdeseguridad.application.mappers;

import com.axioma.controlesdeseguridad.application.dto.EmergencyLightsDTO;
import com.axioma.controlesdeseguridad.domain.models.EmergencyLights;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface EmergencyLightsMapper {
    EmergencyLightsDTO toDTO(EmergencyLights emergencyLights);
    EmergencyLights toEntity(EmergencyLightsDTO emergencyLightsDTO);
}
