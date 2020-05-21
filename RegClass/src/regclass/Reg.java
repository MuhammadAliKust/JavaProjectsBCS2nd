/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package regclass;

/**
 *
 * @author NC
 */
public class Reg {

    private String name;
    private String fname;
    private String cnic;
    private String Address;
    private double fee;

    public Reg(String name, String fname, String cnic, String Address, double fee) {
        this.name = name;
        this.fname = fname;
        this.cnic = cnic;
        this.Address = Address;
        this.fee = fee;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getname() {
        return this.name;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getFname() {
        return this.fname;
    }

    public void setcnic(String cnic) {
        this.cnic = cnic;
    }

    public String getcnic() {
        return this.cnic;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getAddress() {
        return this.Address;
    }

    public void setfee(double fee) {
        this.fee = fee;
    }

    public double getfee() {
        return this.fee;
    }

    @Override
    public String toString() {
        return String.format("Name : %s%nFather Name : %s%nCNIC : %s%nAddress : %s%nFee : %.2f%n",getname(),getFname(),getcnic(),getAddress(),getfee());
        }}
