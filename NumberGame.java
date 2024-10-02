import java.util.*;
public class NumberGame {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Welcome to this number game!!!");
        int chances =4 ;
        System.out.println("you have "+chances+" chances to win the game");
        System.out.println("A random number between 1 and 100 has been generated. Guess the number!");
        boolean play=true;
        int score=0;
        int attempts=0;
        Random r=new Random();
        int random= r.nextInt(100)+100;
        while(play){
        int i;
        for( i=1;i<=chances;i++)
        {
            System.out.println("Enter your guess");
            int guess=s.nextInt();
            if(guess == random)
            {
                System.out.println("you win");
                score += (5 - attempts);
              break;
            }
            else if (guess>random && i!=chances-1){
                System.out.println("your guess is low");
               
            }if ( i== chances){

                System.out.println("your chance is over");}
            else if (guess<random && i!=chances-1){
            System.out.println("your guess is high");
            
        }
        }
        
        System.out.println("Your score for this round: " + score);
            
    }
    }
}