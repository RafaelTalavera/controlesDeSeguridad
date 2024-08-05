package com.axioma.controlesdeseguridad.infrastucture.controllers;

import com.axioma.controlesdeseguridad.application.dto.TablerosElectricosDTO;
import com.axioma.controlesdeseguridad.domain.services.ITableroElectricoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/api/tableros-electricos")
public class TableroElectricosController {

    @Autowired
    private ITableroElectricoService tableroElectricoService;

    @GetMapping
    @CrossOrigin(origins = "*", allowedHeaders = "*")
    public ResponseEntity<List<TablerosElectricosDTO>> getAllTablerosElectricos() {
        List<TablerosElectricosDTO> tablerosList = tableroElectricoService.findAll();
        return new ResponseEntity<>(tablerosList, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    @CrossOrigin(origins = "*", allowedHeaders = "*")
    public ResponseEntity<TablerosElectricosDTO> getTablerosElectricosById(@PathVariable Long id) {
        Optional<TablerosElectricosDTO> tablerosElectricosDTO = tableroElectricoService.findById(id);
        return tablerosElectricosDTO
                .map(dto -> new ResponseEntity<>(dto, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<TablerosElectricosDTO> createTablerosElectricos(@RequestBody TablerosElectricosDTO tablerosElectricosDTO) {
        TablerosElectricosDTO createdTablerosElectricos = tableroElectricoService.createTablerosElectricos(tablerosElectricosDTO);
        return new ResponseEntity<>(createdTablerosElectricos, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    @CrossOrigin(origins = "*", allowedHeaders = "*")
    public ResponseEntity<TablerosElectricosDTO> updateTablerosElectricos(@PathVariable Long id, @RequestBody TablerosElectricosDTO tablerosElectricosDTO) {
        TablerosElectricosDTO updatedTablerosElectricos = tableroElectricoService.update(id, tablerosElectricosDTO);
        if (updatedTablerosElectricos != null) {
            return new ResponseEntity<>(updatedTablerosElectricos, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{id}")
    @CrossOrigin(origins = "*", allowedHeaders = "*")
    public ResponseEntity<Void> deleteTablerosElectricosById(@PathVariable Long id) {
        tableroElectricoService.deletedById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}