import java.util.*;

class Student<T>{
   T id;
   String name ;
   Student(T id  ,String name){
    this.id = id;
    this.name = name;
   }

   void display(){
    System.err.println("Id: " + id );
    System.err.println("Name: " + name );
   }
}

class Generic {
    public static void main(String[] args) {
        Student <Integer> s1 = new Student<>(1, "Deepak ");
         s1.display();

        Student <String> s2 = new Student<>("12519231", "Rahul");
         s2.display();
    }
}
