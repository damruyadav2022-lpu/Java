import java.util.*;

class keyword{
    public static void main(String args[]) {

        StringBuilder sb = new StringBuilder("JAVA");
        sb.append(" Programming ");
        sb.append(101);

        System.out.println(sb);


        StringBuilder sb1 = new StringBuilder("JAVA");
        sb1.insert(4, " Programming");

        System.out.println(sb1);


        StringBuilder sb3 = new StringBuilder("JAVA");
        sb3.reverse();
        System.out.println(sb3);


    }
};



