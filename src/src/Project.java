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
public class Project 
{
    private int projectId;
    private String projectType;
    private int empno;
    private String projectTitle;
    private String deadlineDate;
    private String status;
    
    public static  Connection connection;
    public static Statement statement;
    public static ResultSet result;
    
    
    static
    {
        try
        {
            connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","BadarData23");
            statement=connection.createStatement();
        }catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    public Project()
    {
        
    }
    
    public void setProjectId(int id)
    {
        projectId=id;
    }
    public void setProjectType(String projectType)
    {
        this.projectType=projectType;
    }
    
    public void setEmpno(int empNo)
    {
        this.empno=empNo;
    }
    public void setProjectTitle(String projectTitle)
    {
        this.projectTitle=projectTitle;
    }
    public void setProjectDeadline(String deadline)
    {
        this.deadlineDate=deadline;
    }
    public void setStatus(String status)
    {
        this.status=status;
    }
    
    public int getProjectId()
    {
        return projectId;
    }
    public String getProjectType()
    {
        return projectType;
    }
    public int getEmpNo()
    {
        return empno;
    }
    public String getProjectTitle()
    {
        return projectTitle;
    }
    public String getDeadLine()
    {
        return deadlineDate;
    }
    public String getStatus()
    {
        return status;
    }
}
