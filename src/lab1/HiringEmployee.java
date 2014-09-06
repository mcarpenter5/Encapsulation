/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab1;

/**
 *
 * @author dominicalaus
 */
public class HiringEmployee extends Employee {
    private boolean metWithHr;
    private boolean metDeptStaff;
    private boolean reviewedDeptPolicies;
    private boolean movedIn;
    private String cubeId;
    
    public HiringEmployee(String firstName, String lastName, String ssn, String birthDate) {
        super(firstName, lastName, ssn, birthDate);
    }
    
    HiringEmployee() {
    
    }
    
    public String getCubeId() {
        return cubeId;
    }

    public void setCubeId(String cubeId) {
        this.cubeId = cubeId;
    }
    
   
    public void hiringProcess(){
        meetWithHrForBenefitAndSalaryInfo();
        meetDepartmentStaff();
        reviewDeptPolicies();
        moveIntoCubicle(cubeId);
        System.out.println(getStatus());
    }
    
    
    private void meetWithHrForBenefitAndSalaryInfo() {
        metWithHr = true;
    }

    
    private void meetDepartmentStaff() {
        if(metWithHr) {
            metDeptStaff = true;
        } else {
            System.out.println("Sorry, you cannot meet with "
                    + "department staff until you have met with HR.");
        }
    }

   
    private void reviewDeptPolicies() {
        if(metWithHr && metDeptStaff) {
            reviewedDeptPolicies = true;
        } else {
            System.out.println("Sorry, you cannot review "
                    + " department policies until you have first met with HR "
                    + "and then with department staff.");
        }
    }

    
    private void moveIntoCubicle(String cubeId) {
        if(metWithHr && metDeptStaff && reviewedDeptPolicies) {
            this.cubeId = cubeId;
            this.movedIn = true;
        } else {
            System.out.println("Sorry, you cannot move in to a "
                    + "cubicle until you have first met with HR "
                    + "and then with department staff, and then reviewed"
                    + "department policies.");
        }

    }

    private String getStatus() {
        if(metWithHr && metDeptStaff
           && reviewedDeptPolicies && movedIn) {
            return "Orientation is complete";
        } else {
            return "Orientation in progress...";
        }
    }

}
