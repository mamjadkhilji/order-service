package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@ComponentScan(basePackages = {"com.example"})
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World..........Container!!!REBUILD-1!" );
    	SpringApplication.run(App.class, args);
        System.out.println( "Hello World!" );
    }
}
