import java.util.*;
public class speedTicket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter speed: ");
        int speed = sc.nextInt();
        
        System.out.println("Today is your birthday: ");
        boolean isBirthday = sc.nextBoolean();

        if(isBirthday==true){
            speed-=5;
        }
        if(speed>=80){
            System.out.println("High ticket");
        }else if(speed>=60 && speed<80){
            System.out.println("Mid ticket");
        }else{
            System.out.println("No ticket");
        }
    }
}
