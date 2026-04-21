
class Animal{
    void display1(){
        System.out.println("Animal class printed");
    }
}
class Dog extends Animal{          // enheriting animal
    void display2(){
        System.out.println("Dog class Printed");
    }
}
class Cat extends Animal {       //enheriting  animal
    void display3(){
        System.out.println("Cat class printed");
}
    }

  class Kitten extends Cat {     //enheriting animal,cat - hybrid 
    void display4(){
        System.out.println("Kitten class called");
    }
  }  
class Hybrid{
   public static void main(String args[]){
      Cat obj = new Cat();
       obj.display1();
       obj.display3();
      
      Dog d1 = new Dog();
       d1.display1();
       d1.display2();

      Kitten k = new Kitten();
      k.display1();
      k.display3(); 
      k.display4();
   }
}