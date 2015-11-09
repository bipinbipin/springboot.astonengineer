package com.astontech.astonengineer.configuration;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Created by Bipin on 10/5/2015.
 */
@Configuration
@EnableAutoConfiguration
@EntityScan(basePackages = {"com.astontech.astonengineer.domain"})
@EnableJpaRepositories(basePackages = {"com.astontech.astonengineer.repositories"})
@EnableTransactionManagement
public class RepositoryConfiguration {
}
