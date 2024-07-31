package com.axioma.controlesdeseguridad.application.services;

import com.axioma.controlesdeseguridad.application.dto.TablerosElectricosDTO;
import com.axioma.controlesdeseguridad.application.mappers.TableroElectricosMapper;
import com.axioma.controlesdeseguridad.domain.models.TablerosElectrico;
import com.axioma.controlesdeseguridad.domain.repositories.TableroElectricoRepository;
import com.axioma.controlesdeseguridad.domain.services.ITableroElectricoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class TableroElectricosServiceImplements implements ITableroElectricoService {

    @Autowired
    private TableroElectricoRepository tableroElectricoRepository;

    @Autowired
    private TableroElectricosMapper tableroElectricosMapper;

    @Override
    @Transactional
    public List<TablerosElectricosDTO> findAll() {
        return StreamSupport.stream(tableroElectricoRepository.findAll()
                .spliterator(),false).map(tableroElectricosMapper::toDTO)
                .collect(Collectors.toList());
    }

    @Override
    @Transactional
    public Optional<TablerosElectricosDTO> findById(Long id) {
        return tableroElectricoRepository.findById(id).map(tableroElectricosMapper::toDTO);
    }

    @Override
    @Transactional
    public TablerosElectricosDTO createTablerosElectricos(TablerosElectricosDTO tablerosElectricosDTO) {
        TablerosElectrico tablerosElectrico = tableroElectricosMapper.toEntity(tablerosElectricosDTO);
        tablerosElectrico = tableroElectricoRepository.save(tablerosElectrico);

        return tableroElectricosMapper.toDTO(tablerosElectrico);
    }

    @Override
    @Transactional
    public TablerosElectricosDTO update(Long id, TablerosElectricosDTO tablerosElectricosDTO) {
        return null;
    }

    @Override
    @Transactional
    public void deletedById(Long id) {
        tableroElectricoRepository.deleteById(id);
    }
}