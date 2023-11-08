package org.jsp.onetwomantbi.controller;

import org.jsp.onetwomantbi.dto.Employee;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;
import java.util.Scanner;

public class FindEmployeeByDepartmentLocation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter teh location to find Employees");
        String loc=sc.next();
        EntityManager manager= Persistence.createEntityManagerFactory("jpa").createEntityManager();
        Query q=manager.createNamedQuery("findEmployeeByDepartmentLocation");
        q.setParameter(1,loc);
        List<Employee> l1=q.getResultList();
        if(l1.size()>0){
            for(Employee e:l1){
                System.out.println("id="+e.getId());
                System.out.println("Name="+e.getName());
                System.out.println("Desg="+e.getDesg());
                System.out.println("Department name="+e.getDept().getName());
                System.out.println("********************************************");
            }
        }else {
            System.out.println("Entered invalid Location");
        }
    }
}
