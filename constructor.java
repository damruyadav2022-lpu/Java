//contructor are used  to initialize the obj
//properties : 1.Constructor is alwyas the same name as class name
// there is no return type for constructor 
// even it has no return type
// it can be overloaded
import java.util.*;
class Student{
    int marks;
    int roll;
    String name;
    Student(){
        marks = 0;
        roll = 0;
        name= "N/A";
    }
    Student(int a , int b){
        marks = a;
        roll = b;
        name= "N/A";
    }
    Student(int a , int b , String s){
        marks = a;
        roll = b;
        name= s;
    }
    void display(){
         System.out.println(marks + ":" + roll + ":"  + name);
    }
} 

class constructor{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Student  s = new Student();
        Student  s1 = new Student(10,5);
        Student  s2 = new Student(11 ,2 ,"Deepak");

        s.display();
     
        s1.display();
    
        s2.display();
    }
}