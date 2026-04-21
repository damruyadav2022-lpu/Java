// class A{
//     void show(){
//         System .out.println("Class A is printing");
        
//     }
// }



// public class Ananoymous {
//      public static void main(String args[]){
//         A a = new A(){

//             public void show(){
//                 System.out.println("Anonymous class ");
//             }
//         };
//         a.show();
//      }
// }


interface  A {
    void show();
}
/*class B implements A{
public void show(){
  System.out.println("IN class B");
  }
} */
public class Ananoymous {
     public static void main(String args[]){
        A a =() -> System.out.println("In class show");//this is lambda expression
        a.show();
     }   
}

