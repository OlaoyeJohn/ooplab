/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
NAME: OLAOYE ADEYEMI JOHN
STUDENT NUMBER: 137022
DATE: 19-April-2021

*/



package person;

/**
 *String name,String gender,String regNo,String course
 * @author Admin
 */
//Using the concept of inheritance to extend Person into Student class
public class Student extends Person{ 
    String regNo;
    String course;
    public Student(String regNo, String course, String name, String gender, int dob) {
        super(name, gender, dob);
        this.regNo = regNo;
        this.course = course;
    }

    public void setRegNo(String regNo) {
        this.regNo = regNo;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getRegNo() {
        return regNo;
    }

    public String getCourse() {
        return course;
    }   
    
      public void printDetails(){
        System.out.println(getName());
        System.out.println(getGender());
        System.out.println(getAge());
        System.out.println(getRegNo());
        System.out.println(getCourse());
        System.out.println();
    }
        
}
