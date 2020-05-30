/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculationusingmethods;

/**
 *
 * @author NC
 */
public class Calculations {
    private String name;
    private String cnic;
    private double salary;
    
    Calculations(String name, String cnic, double salary){
        this.name = name;
        this.cnic = cnic;
        this.salary = salary;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getName(){
        return this.name;
    }
    
    public void setCnic(String cnic){
        this.cnic = cnic;
    }
    
    public String getCnic(){
        return this.cnic;
    }
    
    public void setSalary(double salary){
        this.salary = salary;
    }
    
    public double getSalary(){
        return this.salary;
    }
    
    public double calculateAnnualSalary(){
        return getSalary()*12;
    }
    
    @Override
    public String toString(){
        return String.format("Name : %s%nCNIC : %s%nSalary : %.2f%nAnnual Salary : %.2f%n", getName(),getCnic(), getSalary(),calculateAnnualSalary());
    }
}
