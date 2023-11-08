package org.jsp.onetwomantbi.controller;

import org.jsp.onetwomantbi.dto.Department;
import org.jsp.onetwomantbi.dto.Employee;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.Scanner;

public class FindDepartmentByEmpId {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Employee id to get Department name");
        int id=sc.nextInt();
        EntityManager manager= Persistence.createEntityManagerFactory("jpa").createEntityManager();
        Query q= manager.createNamedQuery("findDepartmentByEmpId");
        q.setParameter(1,id);
        try {
            Department d= (Department) q.getSingleResult();
            System.out.println("Id="+d.getId());
            System.out.println("Name="+d.getName());
            System.out.println("Location="+d.getLocation());
        }catch (NoResultException e){
            System.err.println("Entered invalid id");
        }



    }
}
