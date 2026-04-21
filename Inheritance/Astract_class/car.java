 // abtract class cannot be instantiated 
 //we cannot create the object of abstract class 
 abstract class car1{
      abstract public void drive();

      abstract public void fly();

     public void music(){
        System.out.println("Music play");
     }
}

abstract class mercedes extends car1{
    public void drive(){
       System.out.println("Drive ");
    }
}

class bmw extends mercedes {
    public void fly(){
        System.out.println("Car is flying");
    }
}

class car{
    public static void main(String args[]){
        car1 c = new bmw();
        c.drive();
        c.music();
        c.fly();
    }
}