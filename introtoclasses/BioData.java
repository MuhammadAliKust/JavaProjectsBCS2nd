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
    
    @Override
    public String toString(){
        return String.format("Name : "+name+"\nFather Name : "+fName+"\nCNIC : "+cnic);
    }
}
