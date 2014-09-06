package lab1;

/**
 * In this lab your challenge is to fix the code in both classes to use
 * proper encapsulation and the other best practices as explained by 
 * your instructor.
 *
 * @author      Jim Lombardo, WCTC Instructor
 * @version     1.01
 */
public class Startup {
    public static void main(String[] args) {
        /*
            Are we violating SRP (Single Responsibility Principle)?
        
            HINT: think about what we are trying to do ... hire an employee.
            Whose job is it to do this? The current class? Or, a new class?
            Should we do the work here or delegate to the new class? You
            may need to create a new class that talks to Employee. This does
            not have to be a GUI class.
        */
        HiringEmployee e = new HiringEmployee();
        e.setFirstName("Peter");
        e.setLastName("Piper");
        e.setSsn("333-1234");
        e.setCubeId("1414");
        System.out.println("Welcome" + " " + e.getFirstName() 
                + " " + " First you have to meet with the HR");
        System.out.println("Now you must meet with the Department Staff,");
        System.out.println("Now let's set down and review the company polices....");
        System.out.println("Finally, lets get you moved into your cubicle... your cubicle ID is:" + " " + e.getCubeId());
        
        e.hiringProcess();
    }
    
    
}
