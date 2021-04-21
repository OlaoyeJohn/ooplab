/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package person;

public class Person {
    private String name;
    private String gender;
    private int dob;
   
   public Person(String name){
        this.name = name;
    }
    public Person(String name, String gender, int dob){
        this.name = name;
        this.gender = gender;
        this.dob = dob;
    }
    

    public void setName(String name) {
        this.name = name;
    }
    
    public void setGender(String gender){
        this.gender = gender;
    }
    
    public void setDob(int dob){
        this.dob = dob;
    }
    
    public String getName(){
        return name;
    }
    
    public String getGender(){
        return gender;
    }
    
    public int getAge(){
       return dob = 2021 - dob;
    }
}
