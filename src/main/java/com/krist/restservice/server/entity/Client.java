
package com.krist.restservice.server.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;
import org.hibernate.annotations.Proxy;

@Entity
@Table(name = "client")
//@JsonIgnore
@Proxy(lazy = false)
public class Client {
    
    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    private Integer id;

    @Column(name = "name", nullable = true, length = 50)
    private String name;
    
    @Column(name = "surname", nullable = true, length = 50)
    private String surname;
    
    @Column(name = "age", nullable = true, length = 50)
    private Integer age;
    
    @Column(name = "address", nullable = true, length = 150)
    private String address;
    
    @Column(name = "position", nullable = true, length = 100)
    private String position;
    
    @Column(name = "salary", nullable = true, length = 50)
    private String salary;
    
    @Column(name = "inn", nullable = true, length = 50)
    private String inn;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getInn() {
        return inn;
    }

    public void setInn(String inn) {
        this.inn = inn;
    }
  
}