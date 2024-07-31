package com.axioma.controlesdeseguridad.infrastucture.controllers;

import com.axioma.controlesdeseguridad.application.dto.EspejoDTO;
import com.axioma.controlesdeseguridad.domain.services.IEspejoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/espejos")
public class EspejoController {

    @Autowired
    private IEspejoService espejoService;

    @GetMapping
    public ResponseEntity<List<EspejoDTO>> getAllEspejos() {
        List<EspejoDTO> espejosList = espejoService.findAll();
        return new ResponseEntity<>(espejosList, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<EspejoDTO> getEspejoById(@PathVariable Long id) {
        Optional<EspejoDTO> espejoDTO = espejoService.findById(id);
        return espejoDTO
                .map(dto -> new ResponseEntity<>(dto, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping
    public ResponseEntity<EspejoDTO> createEspejo(@RequestBody EspejoDTO espejoDTO) {
        EspejoDTO createdEspejo = espejoService.createEspejo(espejoDTO);
        return new ResponseEntity<>(createdEspejo, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<EspejoDTO> updateEspejo(@PathVariable Long id, @RequestBody EspejoDTO espejoDTO) {
        EspejoDTO updatedEspejo = espejoService.update(id, espejoDTO);
        if (updatedEspejo != null) {
            return new ResponseEntity<>(updatedEspejo, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteEspejoById(@PathVariable Long id) {
        espejoService.deleteById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
