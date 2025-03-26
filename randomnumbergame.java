import java.util.Scanner;
import java.util.Random;
class numberGame
{
    Random r=new Random();
    Scanner sc=new Scanner(System.in);
    int score=0;
    int max_attempts=5;
    void playGame()
    {
        boolean playAgain;
        do{
            int random_number=r.nextInt(100)+1;
            int attempts_left=max_attempts;
            boolean isCorrect=false;
            System.out.println("A random number between 1 and 100 has been generated. Guess it!");
            while(attempts_left>0)
            {
                System.out.print("Enter your guess: ");
                int guess=sc.nextInt();
                attempts_left--;
                if(guess==random_number)
                {
                    System.out.println("Congratulations! Your guess is correct.");
                    score++;
                    isCorrect=true;
                    break;
                }
                else if(guess>random_number)
                    System.out.println("Your guess is too high! ");
                else 
                    System.out.println("Your guess is too low!");
                System.out.println("Attempts left: "+attempts_left);
            }
            if(!isCorrect)
                System.out.println("Out of attempts! The correct number was: "+random_number);
            System.out.print("Do you want to play this game again? (Yes/No): ");
            playAgain=sc.next().equalsIgnoreCase("Yes");
        }while(playAgain);
        System.out.println("Game Over. Your final score is: "+score);
    }
}
class randomnumbergame
{
    public static void main(String args[])
    {
        numberGame obj=new numberGame();
        obj.playGame();
    }

}

