/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introtoclasses;

import java.util.Scanner;

/**
 *
 * @author NC
 */
public class IntroToClasses {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BioData _bioData = new BioData("asdfs","jkldf","slk");
        
        String name, fName, cnic;
        System.out.println("Enter your name : ");
        name = sc.nextLine();
        _bioData.setName(name);
        System.out.println("Enter your Father Name : ");
        fName = sc.nextLine();
        _bioData.setfName(fName);
        System.out.println("Enter your cnic number : ");
        cnic = sc.nextLine();
        _bioData.setCnic(cnic);
        System.out.println(_bioData);
        
    }
    
}
