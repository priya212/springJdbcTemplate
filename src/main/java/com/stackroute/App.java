package com.stackroute;

import com.stackroute.springJDBC.config.SpringJdbcConfig;
import com.stackroute.springJDBC.controller.SpringJdbcController;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App
{
    public static void main( String[] args ) {
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
        context.register(SpringJdbcConfig.class);
        context.refresh();

        SpringJdbcController springJdbcController=(SpringJdbcController)context.getBean("springJdbcController");
        System.out.println(springJdbcController.insertMovie());

        System.out.println(springJdbcController.getMovieById());
        System.out.println(springJdbcController.getAllMovies());

        System.out.println(springJdbcController.updateMovieRatings());

        System.out.println(springJdbcController.getAllMovies());
        System.out.println(springJdbcController.deleteMovieById());

    }
}
