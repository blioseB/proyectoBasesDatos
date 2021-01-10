/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebaconex;

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
            Connection miConex = DriverManager.getConnection("jdbc:mysql://localhost:3306/proyectodos","root","");
            
            //pruebas read
            //prueba readToy
            CallableStatement readToy= miConex.prepareCall("{call readToy}");
            ResultSet rs1 = readToy.executeQuery();
            //prueba readToyCategory
            CallableStatement readToyCategory = miConex.prepareCall("{call readToyCategory}");
            ResultSet rs2 = readToyCategory.executeQuery();
            //prueba readSantaAssistants
            CallableStatement readSantaAssistants = miConex.prepareCall("{call readSantaAssistants}");
            ResultSet rs3 = readSantaAssistants.executeQuery();
            
            //pruebas create
            
              
            
            
            while (rs1.next()&& rs2.next() && rs3.next()){
                System.out.println(rs1.getInt(1)+ "--" + rs1.getInt(2)+"--"+ rs1.getString(3)+"--"+rs1.getString(4)+"--"+rs1.getString(5)+"--"+rs1.getInt(6)+"--"+rs1.getInt(7)+"--"+rs1.getInt(8)); 
                System.out.println(rs2.getInt(1)+"--"+rs2.getString(2)+"--"+rs2.getInt(3)+"--"+rs2.getString(4)+"--"+rs2.getString(5));
                System.out.println(rs3.getInt(1)+"--"+rs3.getInt(2)+"--"+rs3.getString(3)+"--"+rs3.getString(4)+"--"+rs3.getString(5)+"--"+rs3.getDate(6));
                       
            }
            rs1.close();
            rs2.close();
            rs3.close();
            
        } catch (Exception e){
    }
       
        
    }
    
}
