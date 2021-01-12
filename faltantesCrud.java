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
           //CallableStatement createToy = miConex.prepareCall("{call createToy(?,?,?,?,?,?,?)}");
           //createToy.setInt(1,9132 );
           
          /** CREAR PARENTS
           CallableStatement createParents = miConex.prepareCall("{call createParents(?,?,?,?,?,?)}");
           createParents.setInt(1, 1212);
           createParents.setInt(2, 0);
           createParents.setString(3, "");
           createParents.setString(4, "");
           createParents.setString(5, "");
           createParents.setInt(6, 0);
           createParents.execute();
           **/
          
           /** EDITAR PARENTS
           CallableStatement updateParents = miConex.prepareCall("{call updateParents(?,?,?,?,?,?)}");
           updateParents.setInt(1, 1212);
           updateParents.setInt(2, 0);
           updateParents.setString(3, "a");
           updateParents.setString(4, "v");
           updateParents.setString(5, "c");
           updateParents.setInt(6, 1212);
           updateParents.execute();
           **/
           
           //CRUD SON
           /**CREATE SON
           CallableStatement createSon = miConex.prepareCall("{call createSon(?,?,?,?,?,?,?)}");
           createSon.setInt(1, 5151);
           createSon.setString(2, "as");
           createSon.setString(3, "as");
           createSon.setString(4, "as");
           createSon.setString(5, "as");
           createSon.setInt(6,4);
           createSon.setString(7, "nelson");
           createSon.execute();
           **/
           
         //READ
          
          /** UPDATE SON
           CallableStatement updateSon = miConex.prepareCall("{call updateSon(?,?,?,?,?,?,?)}");
           updateSon.setString(1, "fff");
           updateSon.setString(2, "fff");
           updateSon.setString(3, "fff");
           updateSon.setString(4, "fff");
           updateSon.setInt(5, 17);
           updateSon.setString(6, "");
           updateSon.setInt(7, 5151);
           updateSon.execute();
           **/
          
           /** DELETE SON
           CallableStatement deleteSon = miConex.prepareCall("{call deleteSon(?)}");
           deleteSon.setInt(1, 5151);
           deleteSon.execute();
           **/
           
           /**CREATE BEHAVIOR
           CallableStatement createBehavior = miConex.prepareCall("{call createBehavior(?,?,?,?)}");
           createBehavior.setInt(1, 1212);
           createBehavior.setString(2, "");
           createBehavior.setString(3, "");
           createBehavior.setString(4, "");
           createBehavior.execute();
           */
           
        } catch (Exception e){
    }
            
       
       
    }
}
    






