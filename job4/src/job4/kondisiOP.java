/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package job4;

/**
 *
 * @author User
 */
public class kondisiOP {
    public static void main(String[]args){
        String status = "";
        int grade = 50;
        
        //mendapatkan status pelajar
    status = (grade>=60)? "passed" : "fail";
    
    //print semua
    System.out.println(status);
    }
}
