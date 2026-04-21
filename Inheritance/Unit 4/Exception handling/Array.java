//package Exception handling;

public class Array{
  public static void main(String ags[]){
int nums[]= new int[5];
System.out.println(nums[1]); // 0
 try {
    System.out.println(nums[6]);
  }catch(ArrayIndexOutOfBoundsException e ){
    System.out.println("Accessing the index out of bound");
  }
}
}
