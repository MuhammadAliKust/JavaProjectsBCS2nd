/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package regclass;

import java.util.Scanner;

/**
 *
 * @author NC
 */
public class RegClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        Reg _reg = new Reg("USman","Abdulrehman","3710480308441","Jand", 1200);
        
        Reg _reg2 = new Reg("USman","Abdulrehman","3710480308441","Jand", 1200);
        
        Reg _reg3 = new Reg("USman","Abdulrehman","3710480308441","Jand", 1200);
        
        String name, fname, cnic, Address;
        double fee;

        System.out.println("Enter your name : ");
        name = sc.nextLine();
        _reg.setName(name);
        System.out.println("enter your Father name:");
        fname = sc.nextLine();
        _reg.setFname(fname);
        System.out.println("Enter yout cnic:");
        cnic = sc.nextLine();
        _reg.setcnic(cnic);
        System.out.println("Enter your Address");
        Address = sc.nextLine();
        _reg.setAddress(Address);
        System.out.println("enter your fee");
        fee = sc.nextDouble();
        _reg.setfee(fee);
        System.out.println(_reg);
    }

}
