class A{
    void show(){
        System.out.println("In A class A ");
    }
    class B{
        void display(){
            System.out.println("In class B ");
        }
        class C{
            void print(){
            System.out.println("In class c");
        }
    }
    }
}
class nested{
    public static void main(String args[]){
        A a =new A();
        a.show();
       A.B b = a.new B();  // this is the object of the inner class of A that is b
       b.display();
       A.B.C x = b.new C(); //this is the object of inner class of b that is c 
       x.print();
    }
}