package com.axioma.controlesdeseguridad.infrastucture.controllers;

import com.axioma.controlesdeseguridad.application.dto.EmergencyLightsDTO;
import com.axioma.controlesdeseguridad.domain.services.IEmergencyLightsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/emergency-lights")
public class EmergencyLightsController {

    @Autowired
    private IEmergencyLightsService emergencyLightsService;

    @GetMapping
    public ResponseEntity<List<EmergencyLightsDTO>> getAllEmergencyLights() {
        List<EmergencyLightsDTO> emergencyLightsList = emergencyLightsService.findAll();
        return new ResponseEntity<>(emergencyLightsList, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<EmergencyLightsDTO> getEmergencyLightsById(@PathVariable Long id) {
        Optional<EmergencyLightsDTO> emergencyLightsDTO = emergencyLightsService.findById(id);
        return emergencyLightsDTO
                .map(dto -> new ResponseEntity<>(dto, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping
    public ResponseEntity<EmergencyLightsDTO> createEmergencyLights(@RequestBody EmergencyLightsDTO emergencyLightsDTO) {
        EmergencyLightsDTO createdEmergencyLights = emergencyLightsService.createEmergencyLinghts(emergencyLightsDTO);
        return new ResponseEntity<>(createdEmergencyLights, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<EmergencyLightsDTO> updateEmergencyLights(@PathVariable Long id, @RequestBody EmergencyLightsDTO emergencyLightsDTO) {
        EmergencyLightsDTO updatedEmergencyLights = emergencyLightsService.update(id, emergencyLightsDTO);
        if (updatedEmergencyLights != null) {
            return new ResponseEntity<>(updatedEmergencyLights, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteEmergencyLightsById(@PathVariable Long id) {
        emergencyLightsService.deletedById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}

