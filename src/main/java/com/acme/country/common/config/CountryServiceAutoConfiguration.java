/*----------------------------------------------------------------------------*/
/* Source File:   COUNTRYSERVICEAUTOCONFIGURATION.JAVA                        */
/* Copyright (c), 2025 CSoftZ                                                 */
/*----------------------------------------------------------------------------*/
/*-----------------------------------------------------------------------------
 History
 Apr.20/2025  COQ  File created.
 -----------------------------------------------------------------------------*/
package com.acme.country.common.config;

import com.acme.country.data.CountryData;
import com.acme.country.data.DefaultCountryData;
import com.acme.country.service.CountryService;
import com.acme.country.service.DefaultCountryService;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * Holds the bean creation to configure.
 *
 * @author COQ - Carlos Adolfo Ortiz Q.
 */
@AutoConfiguration
public class CountryServiceAutoConfiguration {
    /**
     * Create the 'countryData' bean.
     */
    @Bean
    public CountryData countryData(JdbcTemplate jdbcTemplate) {
        return new DefaultCountryData(jdbcTemplate);
    }

    /**
     * Create the 'countryService' bean.
     */
    @Bean
    public CountryService countryService(CountryData countryData) {
        return new DefaultCountryService(countryData);
    }

}
