package com.stackroute.springJDBC.config;

import com.stackroute.springJDBC.controller.SpringJdbcController;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
@ComponentScan("com.stackroute.*")
public class SpringJdbcConfig {
    @Bean("datasource")
    public DataSource dataSource()
    {
        DriverManagerDataSource driverManagerDataSource=new DriverManagerDataSource();
        driverManagerDataSource.setDriverClassName("com.mysql.jdbc.Driver");
        driverManagerDataSource.setUrl("jdbc:mysql://localhost:3306/stackroute");
        driverManagerDataSource.setUsername("root");
        driverManagerDataSource.setPassword("Root@123");
        return  driverManagerDataSource;
    }

    @Bean("springJdbcController")
    public SpringJdbcController getJdbcController()
    {
        return new SpringJdbcController();
    }
}
