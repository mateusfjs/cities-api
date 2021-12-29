package com.github.mateusfjs.citiesapi.repository;

import com.github.mateusfjs.citiesapi.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
