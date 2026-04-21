
class Animal{
    void display1(){
        System.out.println("Animal class printed");
    }
}
class Dog extends Animal{
    void display2(){
        System.out.println("Dog class Printed");
    }
}
class cat extends Dog {
    void display3(){
        System.out.println("Cat class printed");
}
    }
class multiple{
   public static void main(String args[]){
      cat d = new cat();
       d.display1();
       d.display2();
       d.display3();
   }
}