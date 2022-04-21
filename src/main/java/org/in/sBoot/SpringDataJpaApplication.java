package org.in.sBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//import javax.persistence.EntityManagerFactory;

@SpringBootApplication
//@ComponentScan({"org.controller"})
public class SpringDataJpaApplication {
    private static String name;
    //EntityManagerFactory
    public static void main(String[] args) {
        name = args[0];
            System.out.println("Hello "+ name);
            SpringApplication.run(SpringDataJpaApplication.class, args);
            System.out.println("To you");
    }

//    @Bean
//    public CommandLineRunner run(EmployeeRepository repository){
//        return (args -> {
//            insert(repository);
//            System.out.println(repository.findAll());
//            //System.out.println(repository.findEmployeeByLastName("Agarwal"));
//        });
//    }
//
//    private void insert(EmployeeRepository repository){
//        repository.save(new Employee(name, 42, "Agarwal", 15000L));
//    }
}
