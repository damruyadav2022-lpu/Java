// package Exception handling;

public class first {
    public static void main(String[] args) {
        int i = 18;
        //int j = 2;
        int j= 0;
        //int ans = i/j;
       //System.err.println("Value:" + ans);

        try{
               int ans= i/j;
        }catch(Exception e){
           System.out.println("Wong happen");
        }

     }
}
