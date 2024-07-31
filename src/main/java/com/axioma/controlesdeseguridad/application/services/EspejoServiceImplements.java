package com.axioma.controlesdeseguridad.application.services;

import com.axioma.controlesdeseguridad.application.dto.EspejoDTO;
import com.axioma.controlesdeseguridad.application.dto.ExtintorDTO;
import com.axioma.controlesdeseguridad.application.mappers.EspejoMapper;
import com.axioma.controlesdeseguridad.domain.models.Espejo;
import com.axioma.controlesdeseguridad.domain.repositories.EspejoRepository;
import com.axioma.controlesdeseguridad.domain.services.IEspejoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class EspejoServiceImplements implements IEspejoService {

    @Autowired
    private EspejoRepository espejoRepository;

    @Autowired
    private EspejoMapper espejoMapper;

    @Override
    @Transactional
    public List<EspejoDTO> findAll() {
        return StreamSupport.stream(espejoRepository.findAll().spliterator(),
                false).map(espejoMapper::toDTO)
                .collect(Collectors.toList());
    }

    @Override
    @Transactional
    public Optional<EspejoDTO> findById(Long id) {
        return espejoRepository.findById(id).map(espejoMapper::toDTO);
    }

    @Override
    @Transactional
    public EspejoDTO createEspejo(EspejoDTO espejoDTO) {
        Espejo espejo = espejoMapper.toEntity(espejoDTO);
        espejo = espejoRepository.save(espejo);

        return espejoMapper.toDTO(espejo);
    }

    @Override
    @Transactional
    public EspejoDTO update(Long id, EspejoDTO espejoDTO) {
        return null;
    }

    @Override
    @Transactional
    public void deleteById(Long id) {
        espejoRepository.deleteById(id);
    }
}
