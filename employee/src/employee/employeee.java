/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee;

/**
 *
 * @author NC
 */
public class employeee {

    private String employeName;
    private String employeDesignation;
    private double employeSalary;
    private int employeExp;

    public employeee(String employeName, String employeDesignation, double employeSalary, int employeExp) {
        this.employeDesignation = employeDesignation;
        if (employeSalary >= 5000) {
            this.employeSalary = employeSalary;
        }
        this.employeName = employeName;
        if (employeExp >= 3) {
            this.employeExp = employeExp;
        }

    }

    public void setname(String employeName) {
        this.employeName = employeName;
    }

    public String getName() {
        return this.employeName;
    }

    public void setemployeDesignation(String employeDesignation) {
        this.employeDesignation = employeDesignation;
    }

    public String getemployeDesignation() {
        return this.employeDesignation;

    }

    public void setemployeSalary(double employeSalary) {
        this.employeSalary = employeSalary;

    }

    public double getemplyeSalaey() {
        return this.employeSalary;
    }

    public void setemployeExp(int employeExp) {
        this.employeExp = employeExp;
    }

    public int getemployeExp() {
        return this.employeExp;
    }
    
    public String empValidation(){
        if(getemployeExp()==0){
            return "Employee is not elligible for this post.";
        }
        return "Congrats! You are selected.";
    }

    @Override
    public String toString() {
        return String.format("Employee Name : %s%nEmployee Designation : %s%nEmployee Salary : %.2f%nEmployee Experience : %d%nFinal Selection Result : %s%n", getName(), getemployeDesignation(),
                getemplyeSalaey(), getemployeExp(), empValidation());
    }
}
