package com.jpaTest.LibraryManagementSystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Scanner sc=new Scanner(System.in);
    	
       EntityManagerFactory emf=Persistence.createEntityManagerFactory("TP");
       EntityManager em=emf.createEntityManager();
       
       do {
		
       System.out.println("1. Insert Data");
       System.out.println("2. Update Data");
       System.out.println("3. Delete");
       System.out.println("4. Show");
       System.out.println("5. Exit");
       
       System.out.println("Enter Your Choice");
       int choice=sc.nextInt();
       
       switch (choice) {
	case 1:
	{
		em.getTransaction().begin();
		
		List<Student> student=new ArrayList<Student>();
		Student s1=new Student(1, "Mayur", "Bhor", "GPP");
		Student s2=new Student(2, "Aditi", "Nagar", "AISSMS");
		
		student.add(s1);
		student.add(s2);
		
		Library l1=new Library(101, "Logipool", "Computer", student);
		
		em.persist(s1);
		em.persist(s2);
		em.persist(l1);
		em.getTransaction().commit();
		System.out.println("Data Inserted");
		break;
	}
	case 2:
	{
		em.getTransaction().begin();
		
		Library l1=em.find(Library.class, 101);
		l1.setLname("Technogrowth");
		
		em.persist(l1);
		
		em.getTransaction().commit();
		System.out.println("Data Update");
		
		break;
	}
	case 3:
	{
		em.getTransaction().begin();
		
		Library l1=em.find(Library.class, 101);
		em.persist(l1);
		System.out.println("Data Deleted");
		break;
	}
	case 4:
	{
		em.getTransaction().begin();
		Library l1 = em.find(Library.class, 101);
        System.out.println(l1);
		System.out.println("Data Displayed");
		em.getTransaction().commit();
		break;
	}
	case 5:
	{
		System.err.println("Exit");
		System.exit(0);
		break;
	}

	default:
	{
		break;
		
	}
	}
       
       } while (true);
    }
}
