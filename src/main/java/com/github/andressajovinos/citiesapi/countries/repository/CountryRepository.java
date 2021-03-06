package com.github.andressajovinos.citiesapi.countries.repository;

import com.github.andressajovinos.citiesapi.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
