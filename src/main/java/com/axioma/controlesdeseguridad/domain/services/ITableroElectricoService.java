package com.axioma.controlesdeseguridad.domain.services;


import com.axioma.controlesdeseguridad.application.dto.TablerosElectricosDTO;

import java.util.List;
import java.util.Optional;

public interface ITableroElectricoService {

    public List<TablerosElectricosDTO> findAll();

    public Optional<TablerosElectricosDTO> findById(Long id);

    public TablerosElectricosDTO createTablerosElectricos(TablerosElectricosDTO tablerosElectricosDTO);

    public TablerosElectricosDTO update(Long id, TablerosElectricosDTO tablerosElectricosDTO);

    public void deletedById(Long id);
}
