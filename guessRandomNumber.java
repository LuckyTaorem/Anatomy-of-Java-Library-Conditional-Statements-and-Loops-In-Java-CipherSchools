import java.util.*;
public class guessRandomNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();
        int computerChoice = rnd.nextInt(20);
        System.out.println("Computer Choice: "+computerChoice);

        for(int i=1;i<=6;i++){
            System.out.println("Chance 6: Guess a number between 0 and 20");
            int userChoice = sc.nextInt();
            if(userChoice>computerChoice){
                System.out.println("Your Guess is too High");
            }else if(userChoice<computerChoice){
                System.out.println("Your Guess is too Low");
            }else{
                System.out.println("Gotcha! You Guessed it Right!!");
                break;
            }
        }
    }
}
