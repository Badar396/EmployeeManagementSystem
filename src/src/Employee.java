/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/**
 *
 * @author Badar Muneer
 */
public class Employee 
{
    public static Connection connection;
    public static Statement statement;
    public static ResultSet result;
    private String firstName;
    private String lastName;
    private int empNumber;
    private int deptNo;
    private boolean isAvailable;  //currently busy on project or not.
    private String gender;
    private String hDate;  //hiredate
    private int salary;    
    private String expertise;  //android devloper,desktop application.
    
    
    static
    {
        try
        {
            connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","BadarData23");
            statement=connection.createStatement();
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null, e, "Error",JOptionPane.ERROR_MESSAGE);
        }
    }
    public Employee()
    {
        
    }
    public void setDeptNo(int deptNo)
    {
        this.deptNo=deptNo;
    }
    public int getDeptNo()
    {
        return deptNo;
    }
    public final void setFirstName(String firstName)
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
    public int getEmpNumber()
    {
        return empNumber;
    }
    public void setAvailableStatus(boolean isAvailable)
    {
        this.isAvailable=isAvailable;
    }
    public void setGender(String gender)
    {
        this.gender=gender;
    }
    public void setExpertise(String expertise)
    {
        this.expertise=expertise;
    }
    public void setSalary(int salary)
    {
        this.salary=salary;
    }
    public void setHireDate(String hDate)
    {
        this.hDate=hDate;
    }
    private boolean empNumberCorrect(String emp)
    {
        return emp.matches("\\d{3}");
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
    public  String getHireDate()
    {
        return this.hDate;
    }
    public int getSal()
    {
        return salary;
    }
    public String getGender()
    {
        return gender;
    }
    public String getExpertise()
    {
        return this.expertise;
    }
}
