package com.Employee_Management_System;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Conn {

    Connection c;
    Statement s;

    public Conn(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            c= DriverManager.getConnection("jdbc:mysql:///employeemanagementsystem","root","Its4MySql");
            s=c.createStatement();
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
