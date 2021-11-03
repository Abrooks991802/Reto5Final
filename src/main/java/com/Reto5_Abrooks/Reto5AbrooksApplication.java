package com.Reto5_Abrooks;

//import com.Reto17.Reto3_Angie.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

//@EnableConfigurationProperties
//@EntityScan(basePackages = "Modelo")
@SpringBootApplication
public class Reto5AbrooksApplication {

	public static void main(String[] args) {
		SpringApplication.run(Reto5AbrooksApplication.class, args);
	}

}
