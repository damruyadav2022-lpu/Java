
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
class Cat extends Animal {
    void display3(){
        System.out.println("Cat class printed");
}
    }
class Heararical{
   public static void main(String args[]){
      Cat obj = new Cat();
       obj.display1();
       obj.display3();

      Dog d1 = new Dog();
       d1.display1();
       d1.display2();
   }
}