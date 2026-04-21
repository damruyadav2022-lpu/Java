//package Exception handling;

public class nullptr {
  public static void main(String[] args) {
    String s = null;
    try{
        int len =s.length();

    }catch(NullPointerException e ){
        System.err.println("cannot find length");
    }
  }  
}
