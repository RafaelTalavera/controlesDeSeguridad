package com.axioma.controlesdeseguridad.infrastucture.controllers;

import com.axioma.controlesdeseguridad.application.dto.ExtintorDTO;
import com.axioma.controlesdeseguridad.domain.services.IExtintorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/api/extintores")
public class ExtintorController {

    @Autowired
    private IExtintorService extintorService;


    @GetMapping
    @CrossOrigin(origins = "*", allowedHeaders = "*")
    public ResponseEntity<List<ExtintorDTO>> getAllExtintores() {
        List<ExtintorDTO> extintoresList = extintorService.findAll();
        return new ResponseEntity<>(extintoresList, HttpStatus.OK);
    }


    @GetMapping("/{id}")
    @CrossOrigin(origins = "*", allowedHeaders = "*")
    public ResponseEntity<ExtintorDTO> getExtintorById(@PathVariable Long id) {
        Optional<ExtintorDTO> extintorDTO = extintorService.findById(id);
        return extintorDTO
                .map(dto -> new ResponseEntity<>(dto, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }


    @PostMapping
    @CrossOrigin(origins = "*", allowedHeaders = "*")
    public ResponseEntity<ExtintorDTO> createExtintor(@RequestBody ExtintorDTO extintorDTO) {
        ExtintorDTO createdExtintor = extintorService.createExtintor(extintorDTO);
        return new ResponseEntity<>(createdExtintor, HttpStatus.CREATED);
    }


    @PutMapping("/{id}")
    @CrossOrigin(origins = "*", allowedHeaders = "*")
    public ResponseEntity<ExtintorDTO> updateExtintor(@PathVariable Long id, @RequestBody ExtintorDTO extintorDTO) {
        ExtintorDTO updatedExtintor = extintorService.update(id, extintorDTO);
        if (updatedExtintor != null) {
            return new ResponseEntity<>(updatedExtintor, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }


    @DeleteMapping("/{id}")
    @CrossOrigin(origins = "*", allowedHeaders = "*")
    public ResponseEntity<Void> deleteExtintorById(@PathVariable Long id) {
        extintorService.deleteById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
