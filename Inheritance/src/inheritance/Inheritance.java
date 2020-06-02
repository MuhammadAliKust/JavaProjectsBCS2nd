/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;
import java.util.Scanner;
/**
 *
 * @author NC
 */
public class Inheritance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
         Salary _salary = new Salary("John","Smith",12,2000);
        String name;
        String fname;
        int hours;
        double salary;
         System.out.println("enter the name");
         name=sc.nextLine();
         _salary.setName(name);
         System.out.println("enter fathe name ");
         fname=sc.nextLine();
         _salary.setFname(fname);
         System.out.println("enter hours");
         hours=sc.nextInt();
         _salary.setHours(hours);
         System.out.println("enter salary");
         salary=sc.nextDouble();
         _salary.setSalary(salary);
         System.out.println(_salary);
        
        
    }
    
}
