interface A{
    public int  add(int x , int y);
}

public class Lambda {
    public static void main(String args[]){
        A a = (int x , int y)->(x+y); //labmda expression 
        int result = a.add(4,5);
        System.out.println("Sum: " + result);
    }
}
