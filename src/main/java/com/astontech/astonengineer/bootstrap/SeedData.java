package com.astontech.astonengineer.bootstrap;

import com.astontech.astonengineer.domain.Employee;
import com.astontech.astonengineer.domain.Ent;
import com.astontech.astonengineer.domain.EntityType;
import com.astontech.astonengineer.domain.Person;
import com.astontech.astonengineer.repositories.EmployeeRepository;
import com.astontech.astonengineer.repositories.EntityTypeRepository;
import com.astontech.astonengineer.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;
import org.apache.log4j.Logger;

/**
 * Created by Bipin on 10/6/2015.
 */
@Component
public class SeedData implements ApplicationListener<ContextRefreshedEvent> {

    @Autowired
    private PersonRepository personRepository;
    @Autowired
    private EmployeeRepository employeeRepository;
    @Autowired
    private EntityTypeRepository entityTypeRepository;

    private Logger log = Logger.getLogger(SeedData.class);


    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {

        generateEntityType();
        generateEmployeePerson();


    }

    public void generateEmployeePerson(){
        Person person = new Person();
        person.setFirstname("Bipin");
        person.setMiddlename("Eric");
        person.setLastname("Butala");
        person.setSocialsecuritynumber("111-22-3333");
        personRepository.save(person);

        Employee employee = new Employee();
        employee.setBackground("interesting stuff");
        employee.setPerson(person);
        employee.setCategory(entityTypeRepository.findOne(11));
        employee.setLaptop(entityTypeRepository.findOne(3));
        employee.setPayrate(entityTypeRepository.findOne(14));
        employeeRepository.save(employee);

        log.info("Saved Person: " + employee.getPerson().getFirstname() + " " + employee.getPerson().getLastname() + " - id: " + employee.getPerson().getId());

        //log.info("EntityTypes: " + employee.getCategory().getEntityTypeName() + " - " + employee.getLaptop().getEntityTypeName());

        Person person2 = new Person();
        person2.setFirstname("Sean");
        person2.setMiddlename("Patrick");
        person2.setLastname("Nilsen");
        person2.setSocialsecuritynumber("444-55-6666");
        personRepository.save(person2);

        Employee employee2 = new Employee();
        employee2.setBackground("Java Developer");
        employee2.setPerson(person2);
        employee2.setCategory(entityTypeRepository.findOne(11));
        employee2.setLaptop(entityTypeRepository.findOne(5));
        employee2.setPayrate(entityTypeRepository.findOne(13));
        employeeRepository.save(employee2);

        log.info("Saved Person: " + employee2.getPerson().getFirstname() + " " + employee2.getPerson().getLastname() + " - id: " + employee2.getPerson().getId());


        Person person3 = new Person();
        person3.setFirstname("Dan");
        person3.setMiddlename("Ethan");
        person3.setLastname("Simmer");
        person3.setSocialsecuritynumber("777-88-9999");
        personRepository.save(person3);

        Employee employee3 = new Employee();
        employee3.setBackground("C# Developer");
        employee3.setPerson(person3);
        employee3.setCategory(entityTypeRepository.findOne(11));
        employee3.setLaptop(entityTypeRepository.findOne(4));
        employee3.setPayrate(entityTypeRepository.findOne(13));
        employeeRepository.save(employee3);

        log.info("Saved Person: " + employee3.getPerson().getFirstname() + " " + employee3.getPerson().getLastname() + " - id: " + employee3.getPerson().getId());

        //loop to generate People and Employees
        int NUMBER_TO_GENERATE = 10;
        for(int i = 1; i <= NUMBER_TO_GENERATE; i++) {

            Person genPer = new Person();
            genPer.setFirstname("Employee");
            genPer.setLastname("Number" + i);
            genPer.setSocialsecuritynumber("xxx-xx-" + i + i + i + i);
            personRepository.save(genPer);

            Employee genEmp = new Employee();
            genEmp.setBackground("Auto Generated Employee #" + i);
            genEmp.setPerson(genPer);
            genEmp.setCategory(entityTypeRepository.findOne(10));
            genEmp.setLaptop(entityTypeRepository.findOne(4));
            genEmp.setPayrate(entityTypeRepository.findOne(12));
            employeeRepository.save(genEmp);

        }
    }

    public void generateEntityType(){

        String[] name = new String[17];
        String[] value = new String[17];

        name[0] = "Email";	value[0] = "Work";
        name[1] = "Email";	value[1] = "Personal";
        name[2] = "Laptop";	value[2] = "Acer";
        name[3] = "Laptop";	value[3] = "Dell";
        name[4] = "Laptop";	value[4] = "Samsung";
        name[5] = "Phone";	value[5] = "Work";
        name[6] = "Phone";	value[6] = "Cell";
        name[7] = "Phone";	value[7] = "Home";
        name[8] = "EmployeeCategory";	value[8] = "Mentee";
        name[9] = "EmployeeCategory";	value[9] = "Field";
        name[10] = "EmployeeCategory";	value[10] = "Internal";
        name[11] = "PayRate";	value[11] = "10";
        name[12] = "PayRate";	value[12] = "100";
        name[13] = "PayRate";	value[13] = "1000";
        name[14] = "TierLevel";	value[14] = "Junior";
        name[15] = "TierLevel";	value[15] = "Mid";
        name[16] = "TierLevel";	value[16] = "Senior";

        for (int i = 0; i < name.length; i++){

            EntityType entityType = new EntityType();
            entityType.setEntityTypeName(name[i]);
            entityType.setEntityTypeValue(value[i]);
            entityTypeRepository.save(entityType);

            log.info("Saved Entity: " + entityType.getId() + " - " + entityType.getEntityTypeName() + " - " + entityType.getEntityTypeValue());
        }

    }
}
