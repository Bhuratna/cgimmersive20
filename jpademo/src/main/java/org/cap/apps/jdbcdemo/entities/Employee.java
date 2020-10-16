package org.cap.apps.jdbcdemo.entities;

import javax.persistence.*;
import java.util.Objects;

@Table(name = "employees")
@Entity
public class Employee {

    @GeneratedValue
    @Id
    private Integer id;

    @Column(nullable = false,name = "ename")
    private String name;

    private Double balance;

    public Employee() {

    }

    public Employee( String name, Double balance) {
        this.name = name;
        this.balance = balance;
    }

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

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(id, employee.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
