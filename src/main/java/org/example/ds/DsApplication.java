package org.example.ds;

import org.example.ds.dto.ComputerDto;
import org.example.ds.service.ComputerService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DsApplication {

    public static void main(String[] args) {
        SpringApplication.run(DsApplication.class, args);
    }
    @Bean
    CommandLineRunner start(ComputerService computerService){
        return  args -> {
            computerService.saveComputer(

                    ComputerDto.builder().proce("proce1").ram("8Go").hardDrive("SSD").price(16000).macAddress("23:25:a5:bc:az:12").build()

            );
        };
    }

}
