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

public class PersonApp {
    
    
    
    public static void main(String[] args) {
                
        //Object one is person1 and using first constructor with one parameter
        //Person person1 = new Person();
        Student student1 = new Student("111333", "System Modeling", "Joshua James", "Male", 1989);
        
        student1.printDetails();
        
        //object two is person2 and using second constructor with three parameters
        //Person person2 = new Person();
        student1.setName("John Doe");
        student1.setGender("Male");
        student1.setDob(1974);
        student1.setCourse("Object Oriented Language");
        student1.setRegNo("137022");
        student1.printDetails();
        
        //outputing using the second constructor
        //person2.printDetails();
    }

    public PersonApp() {
    }
}
