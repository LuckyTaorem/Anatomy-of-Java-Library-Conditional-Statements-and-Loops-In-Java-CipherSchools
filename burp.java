import java.util.*;
public class burp {
    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
       System.out.println("How Long is Your Burp ?");
       int burpLength  = sc.nextInt();
       String msg="";
       for(int i=1;i<=burpLength;i++){
        msg = msg+"r";
       }
       System.out.println("Bu"+msg+"p");
    }
}
