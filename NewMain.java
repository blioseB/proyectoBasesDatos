/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebaconex;

import com.mysql.jdbc.Blob;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

/**
 *
 * @author j1bl8
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   
            
           try{
           Connection miConex = DriverManager.getConnection("jdbc:mysql://localhost:3306/naviTec","root","");
           CallableStatement createLetterToSanta  = miConex.prepareCall("{call createLetterSanta(?,?,?,?,?,?,?)}");
           createLetterToSanta.setInt(1, );
           createLetterToSanta.setInt(2, );
           createLetterToSanta.setInt(3, );
           createLetterToSanta.setInt(5, );
           createLetterToSanta.setString(6,"");
           createLetterToSanta.setInt(7, );
           createLetterToSanta.execute();
           
           
           
         
           
        } catch (Exception e){
    }