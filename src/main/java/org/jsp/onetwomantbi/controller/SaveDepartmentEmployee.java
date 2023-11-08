package org.jsp.onetwomantbi.controller;

import org.jsp.onetwomantbi.dto.Department;
import org.jsp.onetwomantbi.dto.Employee;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;

public class SaveDepartmentEmployee {
    public static void main(String[] args) {
        Department d=new Department();
        d.setName("Development");
        d.setLocation("Bengaluru");
        Employee e1=new Employee();
        e1.setName("Rocky");
        e1.setDesg("CEO");
        e1.setSalary(56787667);
        e1.setDept(d);
        Employee e2=new Employee();
        e2.setName("Bahubali");
        e2.setDesg("king");
        e2.setSalary(5687667);
        e2.setDept(d);
        Employee e3=new Employee();
        e3.setName("Pushpa");
        e3.setDesg("Smugler");
        e3.setSalary(56767);
        e3.setDept(d);
        List<Employee> l1=new ArrayList<Employee>();
        l1.add(e1);
        l1.add(e2);
        l1.add(e3);
        d.setEmps(l1);
        EntityManager manager= Persistence.createEntityManagerFactory("jpa").createEntityManager();
        EntityTransaction transaction=manager.getTransaction();
        manager.persist(d);
        transaction.begin();
        transaction.commit();
    }
}
