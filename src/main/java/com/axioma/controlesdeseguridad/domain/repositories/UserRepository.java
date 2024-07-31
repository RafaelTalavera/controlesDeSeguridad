package com.axioma.controlesdeseguridad.domain.repositories;

import com.axioma.controlesdeseguridad.domain.models.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}
