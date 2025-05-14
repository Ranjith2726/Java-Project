import java.util.Scanner;
import java.util.Random;
public class NumberGuessingGame {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Random random = new Random();
    
    int numberGuess = random.nextInt(50) + 1 ;
     
    int userGuess = 0;
    int attempt = 0;
    
    System.out.println("Play the NumberGuessingGame ");
    System.out.println("Enter the number blw 1 to 50");

    while(userGuess != numberGuess){
      System.out.println("enter the number:");
      userGuess = sc.nextInt();
      attempt++;
    
    if( userGuess <  numberGuess)
    {
      System.out.println("to low! try again.\n ");
    } else if(userGuess > numberGuess){
      System.out.println("to high! try again \n ");
    }else {
      System.out.println("congratulations you guessed the number" + numberGuess +" correctly");
      System.out.println("the attempts you tries:" + attempt);
    }
  }
  sc.close();
 
}

}