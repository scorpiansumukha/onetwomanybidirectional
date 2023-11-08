package org.jsp.onetwomantbi.controller;

import org.jsp.onetwomantbi.dto.Employee;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;
import java.util.Scanner;

public class FindEmployeeBySalary {
    public static void main(String[] args) {
        EntityManager manager= Persistence.createEntityManagerFactory("jpa").createEntityManager();
        Query q= manager.createNamedQuery("findEmployeeBySalary");
        List<Employee> l1=q.getResultList();
        if(l1.size()>0){
            for(Employee e:l1){
                System.out.println("Id="+e.getId());
                System.out.println("Name="+e.getName());
                System.out.println("Desg="+e.getDesg());
                System.out.println("***********************************************************");
            }
        }else{
            System.out.println("No result found");
        }
    }
}
