package com.axioma.controlesdeseguridad.domain.services;

import com.axioma.controlesdeseguridad.application.dto.ExtintorDTO;

import java.util.List;
import java.util.Optional;

public interface IExtintorService {

    public List<ExtintorDTO> findAll();

    public Optional<ExtintorDTO> findById(Long id);

    public ExtintorDTO createExtintor(ExtintorDTO extintorDTO);

    public ExtintorDTO update(Long id, ExtintorDTO extintorDTO);

    public void deleteById(Long id);
}
