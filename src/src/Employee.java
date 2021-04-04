/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

/**
 *
 * @author Badar Muneer
 */
public class Employee 
{
    private String firstName;
    private String lastName;
    private int empNumber;
    private boolean isAvailable;
    
    public Employee()
    {
        
    }
    public Employee(String firstName,String lastName,int empNumber,boolean isAvailable)
    {
        setFirstName(firstName);
        setLastName(lastName);
        setEmpNumber(empNumber);
        setAvailableStatus(isAvailable);
    }
    
    public void setFirstName(String firstName)
    {
        this.firstName=firstName;
    }
    public void setLastName(String lastName)
    {
        this.lastName=lastName;
    }
    
    public void setEmpNumber(int empNumber)
    {
        if(empNumberCorrect(empNumber+""))
        {
            this.empNumber=empNumber;
        }
        else
            throw new IllegalArgumentException("Employee Number must contain 3-digits");
    }
    public void setAvailableStatus(boolean isAvailable)
    {
        this.isAvailable=isAvailable;
    }
    
    private boolean empNumberCorrect(String emp)
    {
        return emp.matches("//{3}d");
    }
    
    public String getFirstName()
    {
        return firstName;
    }
    public String getLastName()
    {
        return lastName;
    }
    public int empNumber()
    {
        return empNumber;
    }
    public boolean getAvailableStatus()
    {
        return isAvailable;
    }
}
