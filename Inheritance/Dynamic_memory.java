// class A{
//     void move(){
//         System.out.println("In Base class called");
//     }
// }
// class B extends A{
//     void move(){
//         System.out.println("In derived  class called");
//     }
// }
 
// class Dynamic_memory{
//     public static void main(String args[]){
//      B b = new B();
//        b.move();

//     // A a = new B();   //upcating 
//     // a.move();

//     }
// }


class parent{
    final void display(){     //keyword final is used to avoid the overriding
      System.out.println("This is final method");
    }
}

class Child extends parent{
    // void display(){
    //       System.out.println("This is derived");
    // }
}
class   Dynamic_memory{
    public static void main(String args[]){
        Child obj = new Child();
        obj.display();
    }
}