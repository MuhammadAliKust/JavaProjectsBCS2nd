/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

/**
 *
 * @author NC
 */
public class Salary extends Employee{
    private int hours;
    private double salary;
    
    public Salary(String name, String fname,int hours, double salary){
        super(name, fname);
        this.hours = hours;
        this.salary = salary;
        
    }
    
    public void setHours(int hours){
        this.hours = hours;
    }
    
    public int getHours(){
        return this.hours;
    }
    
    public void setSalary(double salary){
        this.salary = salary;
    }
    
    public double getSalary(){
        return this.salary;
    }
    
    @Override
    public String toString(){
        return String.format("%s%nHours : %d%nSalary per Hour: %.2f%n", super.toString(),getHours(),getSalary());
    }
}
