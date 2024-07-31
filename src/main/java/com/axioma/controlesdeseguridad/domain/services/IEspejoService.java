package com.axioma.controlesdeseguridad.domain.services;

import com.axioma.controlesdeseguridad.application.dto.EspejoDTO;


import java.util.List;
import java.util.Optional;

public interface IEspejoService {

    public List<EspejoDTO> findAll();

    public Optional<EspejoDTO> findById(Long id);

    public EspejoDTO createEspejo(EspejoDTO espejoDTO);

    public EspejoDTO update(Long id, EspejoDTO espejoDTO);

    public void deleteById(Long id);
}
