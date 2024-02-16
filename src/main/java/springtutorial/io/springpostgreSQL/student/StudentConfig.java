package springtutorial.io.springpostgreSQL.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student ramu = new Student(
                    "Ramu",
                    "ramugudimalla@gmail.com",
                    LocalDate.of(2000,4,25)
            );
            Student alex = new Student(
                    "Alex",
                    "alex@gmail.com",
                    LocalDate.of(2010,5,21)
            );
            repository.saveAll(List.of(ramu,alex));
        };
    }
}
