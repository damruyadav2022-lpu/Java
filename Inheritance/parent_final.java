
class parent{
    final void display(){     //keyword final is used to avoid the overriding
       System.out.println("This is final method");
    }
}

class Child extends parent{  // final class cannot be enherited
    
}

class  parent_final{
    public static void main(String args[]){
        Child obj = new Child();
        obj.display();
    }
}