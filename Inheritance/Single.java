
class Animal{
    void display1(){
        System.out.println("Animal class printed");
    }
}
class Dog extends Animal{    // extends means is a relation
    void display2(){
        System.out.println("Dog class Printed");
    }
}
class Single{
   public static void main(String args[]){
      cat d = new cat();
       d.display1();
       d.display2();
   }
}