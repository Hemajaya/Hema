package com.example.hema.configuration;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;

@Configuration
public class H2Configuration {

	@Bean
	public DataSource dataSource () {
		EmbeddedDatabaseBuilder dataSource = new EmbeddedDatabaseBuilder();
		return dataSource.setType(EmbeddedDatabaseType.H2).addScript("Schema.sql").build();
		//return dataSource;
	}
}
