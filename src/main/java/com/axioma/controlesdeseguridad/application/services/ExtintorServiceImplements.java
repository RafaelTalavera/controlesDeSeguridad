package com.axioma.controlesdeseguridad.application.services;

import com.axioma.controlesdeseguridad.application.dto.EspejoDTO;
import com.axioma.controlesdeseguridad.application.dto.ExtintorDTO;
import com.axioma.controlesdeseguridad.application.mappers.ExtintorMapper;
import com.axioma.controlesdeseguridad.domain.models.Extintor;
import com.axioma.controlesdeseguridad.domain.repositories.ExtintorRepository;
import com.axioma.controlesdeseguridad.domain.services.IEspejoService;
import com.axioma.controlesdeseguridad.domain.services.IExtintorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class ExtintorServiceImplements implements IExtintorService {

    @Autowired
    private ExtintorRepository extintorRepository;

    @Autowired
    private ExtintorMapper extintorMapper;

    @Override
    @Transactional
    public List<ExtintorDTO> findAll() {
        return StreamSupport.stream(extintorRepository.findAll()
                        .spliterator(),false).map(extintorMapper::toDTO)
                .collect(Collectors.toList());
    }

    @Override
    @Transactional
    public Optional<ExtintorDTO> findById(Long id) {
        return extintorRepository.findById(id).map(extintorMapper::toDTO);
    }

    @Override
    @Transactional
    public ExtintorDTO createExtintor(ExtintorDTO extintorDTO) {

        Extintor extintor = extintorMapper.toEntity(extintorDTO);
        extintor = extintorRepository.save(extintor);

        return extintorMapper.toDTO(extintor);
    }

    @Override
    @Transactional
    public ExtintorDTO update(Long id, ExtintorDTO extintorDTO) {
        return null;
    }


    @Override
    @Transactional
    public void deleteById(Long id) {
        extintorRepository.deleteById(id);
    }
}
