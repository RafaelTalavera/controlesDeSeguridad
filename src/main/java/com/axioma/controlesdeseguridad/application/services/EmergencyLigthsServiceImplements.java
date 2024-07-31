package com.axioma.controlesdeseguridad.application.services;

import com.axioma.controlesdeseguridad.application.dto.EmergencyLightsDTO;
import com.axioma.controlesdeseguridad.application.mappers.EmergencyLightsMapper;
import com.axioma.controlesdeseguridad.domain.models.EmergencyLights;
import com.axioma.controlesdeseguridad.domain.repositories.EmergencyLightsRepository;
import com.axioma.controlesdeseguridad.domain.services.IEmergencyLightsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class EmergencyLigthsServiceImplements implements IEmergencyLightsService {

    @Autowired
    private EmergencyLightsRepository emergencyLightsRepository;

    @Autowired
    private EmergencyLightsMapper emergencyLightsMapper;

    @Override
    @Transactional
    public List<EmergencyLightsDTO> findAll() {
        return StreamSupport.stream(emergencyLightsRepository.findAll().spliterator(),false)
                .map(emergencyLightsMapper::toDTO)
                .collect(Collectors.toList());
    }

    @Override
    @Transactional
    public Optional<EmergencyLightsDTO> findById(Long id) {
        return emergencyLightsRepository.findById(id).map(emergencyLightsMapper::toDTO);
    }

    @Override
    @Transactional
    public EmergencyLightsDTO createEmergencyLinghts(EmergencyLightsDTO emergencyLightsDTO) {

        EmergencyLights emergencyLights = emergencyLightsMapper.toEntity(emergencyLightsDTO);
        emergencyLights = emergencyLightsRepository.save(emergencyLights);

        return emergencyLightsMapper.toDTO(emergencyLights);
    }

    @Override
    @Transactional
    public EmergencyLightsDTO update(Long id, EmergencyLightsDTO emergencyLightsDTO) {
        return null;
    }

    @Override
    @Transactional
    public void deletedById(Long id) {
        emergencyLightsRepository.deleteById(id);

    }
}
