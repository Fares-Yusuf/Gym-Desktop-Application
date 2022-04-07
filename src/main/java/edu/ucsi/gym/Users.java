
package main.java.edu.ucsi.gym;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Users {
    
    String name="";
    String UserEmail="";
    String address="";
    int phoneNumber=0;
    String password="";

  
    Users(  String name, String Email, String address, int phoneNumber,
            String password){
        
    this.name= name;
    this.UserEmail= Email;
    this.address= address;
    this.phoneNumber= phoneNumber;
    this.password=password;

    
    }
    
    
  private String getName(){
      return this.name;
  }  
  
  private void setName(String name){
      this.name=name;
  }
  
 
  
  
  private String getEmail(){
      return this.UserEmail;
  }  
  
  private void setEmail(String email){
      this.UserEmail=email;
  }
  
   private String getAddress(){
      return this.address;
  }  
  
  private void setAddress(String address){
      this.address=address;
  }
  
   private int getPhoneNumber(){
      return this.phoneNumber;
  }  
  
  private void setPhoneNumber(int num){
      this.phoneNumber=num;
  }
  
   private String getPassword(){
      return this.password;
  }  
  
  private void setPassword(String psw){
      this.password=psw;
  }
  
  


//public int registerUser(String name, String Email, String address, int phoneNumber,
//            String password){
//    
//    int rowsAffected=0;
//    
//        try {
//     
//         Connection con = ConnectionManager.getConnection();
//           
//          //PreparedStatement stm = con.prepareStatement("create table USERS (USERID INT AUTO_INCREMENT, NAME VARCHAR(100), EMAIL VARCHAR(50), ADDRESS VARCHAR(100), PHONENUMBER int, PASSWORD VARCHAR(50), PRIMARY KEY (USERID))");
//  
//           // stm.execute();
//          
//        PreparedStatement statement = con.prepareStatement("insert into USERS (NAME, EMAIL, ADDRESS, PHONENUMBER, PASSWORD) VALUES (?,?,?,?,?)");
//    
//         statement.setString(1, this.name);
//         statement.setString(2, this.UserEmail);
//         statement.setString(3, this.address);
//         statement.setInt(4, this.phoneNumber);
//         statement.setString(5, this.password);
//
//         
//         
//         
//         
//           rowsAffected = statement.executeUpdate();
//       
//       } 
//       
//         catch (Exception ex) {
//           System.out.print(ex);
//        }
//        
//        return rowsAffected;
//}




}

