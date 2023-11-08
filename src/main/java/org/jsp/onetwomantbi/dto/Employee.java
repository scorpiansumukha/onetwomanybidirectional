package org.jsp.onetwomantbi.dto;

import javax.persistence.*;
@NamedQueries(value = {@NamedQuery(name="findDepartmentByEmpId",query = "select e.dept from Employee e where e.id=?1"),
@NamedQuery(name = "findEmployeeBySalary",query = "select e from Employee e where e.salary>5000"),
@NamedQuery(name = "findEmployeeByDepartmentLocation",query = "select e from Employee e where e.dept.location=?1")})
@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String desg;
    private double salary;
    @ManyToOne
    @JoinColumn(name="department_id")
    private Department dept;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesg() {
        return desg;
    }

    public void setDesg(String desg) {
        this.desg = desg;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Department getDept() {
        return dept;
    }

    public void setDept(Department dept) {
        this.dept = dept;
    }
}
