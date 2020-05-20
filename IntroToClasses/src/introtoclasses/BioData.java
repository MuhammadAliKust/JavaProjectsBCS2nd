/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introtoclasses;

/**
 *
 * @author NC
 */
public class BioData {
    private String name;
    private String fName;
    private String cnic;
    
    public BioData(String name, String fName, String cnic){
        this.name = name;
        this.fName = fName;
        this.cnic = cnic;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getName(){
        return this.name;
    }
    
    public void setfName(String fName){
        this.fName = fName;
    }
    
    public String getfName(){
        return this.fName;
    }
    
    public void setCnic(String cnic){
        this.cnic = cnic;
    }
    
    public String getCnic(){
        return this.cnic;
    }
    
    @Override
    public String toString(){
        return String.format("Name : %s%nFather Name : %s%nCNIC : %s%n",getName(),getfName(),getCnic());
    }
}
