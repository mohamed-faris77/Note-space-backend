package com.example.Project.Journal;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class JournalConfig {
    @Bean
    CommandLineRunner commandLineRunner(JournalRepository journalRepository) {
        return args -> {
            Journal j1 = new Journal(
                    "12",
                    "url",
                    "Jan-23",
                    "Journal 1",
                    "This is journal one"
            );
            journalRepository.saveAll(
                    List.of(j1)
            );
        };
    }
}
