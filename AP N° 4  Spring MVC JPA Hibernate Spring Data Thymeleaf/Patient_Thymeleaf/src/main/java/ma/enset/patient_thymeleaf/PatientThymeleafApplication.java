package ma.enset.patient_thymeleaf;

import ma.enset.patient_thymeleaf.entities.Patient;
import ma.enset.patient_thymeleaf.repositories.PatientRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.Date;

@SpringBootApplication
public class PatientThymeleafApplication {

    public static void main(String[] args) {
        SpringApplication.run(PatientThymeleafApplication.class, args);
    }
    @Bean
    CommandLineRunner commandLineRunner(PatientRepository patientRepository){
       return args -> {
           patientRepository.save(new Patient(null,"Najat",new Date(),false,234));
           patientRepository.save(new Patient(null,"Salma",new Date(),true,943));

           patientRepository.save(new Patient(null,"Hamza",new Date(),true,209));

           patientRepository.save(new Patient(null,"Oussama",new Date(),false,143));

           patientRepository.findAll().forEach(p ->
                   System.out.println(p.getNom()));
       };
    }
    @Bean
    PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }

}
