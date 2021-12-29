package com.github.mateusfjs.citiesapi.repository;

import com.github.mateusfjs.citiesapi.entities.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}