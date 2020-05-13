/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;
import java.util.Scanner;
/**
 *
 * @author NC
 */
public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     //(obt. marks/ total marks)*100
        Scanner sc = new Scanner(System.in);
        final int total_marks = 300;
        double  obt_marks,eng_marks, urdu_marks, isl_marks;
        double percentage;
        System.out.println("Enter english marks : ");
        eng_marks = sc.nextInt();
        System.out.println("Enter urdu marks : ");
        urdu_marks = sc.nextInt();
        System.out.println("Enter Isl marks : ");
        isl_marks = sc.nextInt();
        obt_marks = eng_marks + urdu_marks + isl_marks;
        percentage = (obt_marks/total_marks)*100;
        System.out.println("Obt Marks of a student is : "+obt_marks);
        System.out.println("Percentage of a student : "+percentage);
        
        
        
        
    }
    
}
