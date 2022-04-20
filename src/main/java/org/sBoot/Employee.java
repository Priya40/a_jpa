package org.sBoot;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
//import javax.validation.constraints.NotNull;

@Entity
public class Employee {
    @Id
    @GeneratedValue
    private Long id;

    @Column(length = 60)
    private String name;
   @Column(length = 90)
    private String lastName;

    private Integer age;


    //@NotNull
    private Long sal;

    public Long getId() {        return id;    }
    public void setId(Long id) {        this.id = id;    }

    public String getName() {        return name;    }
    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {        return age;    }
    public void setAge(Integer age) {        this.age = age;    }

    public String getLastName() {        return lastName;    }
    public void setLastName(String lastName) {        this.lastName = lastName;    }

    public Long getSal() {        return sal;    }
    public void setSal(Long sal) {        this.sal = sal;    }

    public Employee(String name, Integer age, String lastName, Long sal) {
        this.name = name;
        this.age = age;
        this.lastName = lastName;
        this.sal = sal;
    }

    public Employee() {
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                "last Name=" + lastName +
                "Age=" + age +
                ", name= '" + name + '\'' +
                '}';
    }

}
