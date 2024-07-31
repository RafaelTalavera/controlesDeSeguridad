package com.axioma.controlesdeseguridad.domain.repositories;

import com.axioma.controlesdeseguridad.domain.models.EmergencyLights;
import org.springframework.data.repository.CrudRepository;

public interface EmergencyLightsRepository extends CrudRepository<EmergencyLights,Long> {
}
