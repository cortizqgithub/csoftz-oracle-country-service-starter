package com.acme.country.data;

import com.acme.country.domain.Country;
import java.util.List;
import java.util.Optional;

public interface CountryData {
    List<Country> findAll();

    Optional<Country> findById(Long id);

    Country save(Country country);

    void deleteById(Long id);
}
