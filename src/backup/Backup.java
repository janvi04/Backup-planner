/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backup;

import hib.dto.adminlogin;
import java.util.Scanner;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
public class Backup {

    
    
    
    
    public static void main(String[] args) {
 
    
      SessionFactory sf=new Configuration().configure().buildSessionFactory();
        Session   session=sf.openSession();//used to open table
        Transaction tx=session.beginTransaction();
        
         
       Scanner sc=new Scanner(System.in);

  
        System.out.println("enter the adminId");
        String adminId=sc.next();
      
        System.out.println("enter the password");
        String password=sc.next();
    
            adminlogin al=new adminlogin("adminId","password");
            session.save(al);
            
             
        tx.commit();
        session.close();
            

    
    
    
    
    
    
    
    }
    
}
