package com.axioma.controlesdeseguridad.domain.services;

import com.axioma.controlesdeseguridad.application.dto.EmergencyLightsDTO;

import java.util.List;
import java.util.Optional;

public interface IEmergencyLightsService {

    public List<EmergencyLightsDTO> findAll();

    public Optional<EmergencyLightsDTO> findById(Long id);

    public EmergencyLightsDTO createEmergencyLinghts(EmergencyLightsDTO emergencyLightsDTO);

    public EmergencyLightsDTO update(Long id, EmergencyLightsDTO emergencyLightsDTO);

    public void deletedById(Long id);
}
