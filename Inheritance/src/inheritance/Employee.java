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
public class Employee {
    private String name;
    private String fname;
    
    public Employee(String name, String fname){
        this.name = name;
        this.fname = fname;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getName(){
        return this.name;
    }
    
    public void setFname(String fname){
        this.fname = fname;
    }
    
    public String getFname(){
        return this.fname;
    }
    
    @Override
    public String toString(){
    return String.format("Name : %s%nFname : %s%n",getName(),getFname());
    };
}
