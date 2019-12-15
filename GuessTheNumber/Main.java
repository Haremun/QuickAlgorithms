import java.util.Random;
import java.util.Scanner;

public class Main{
  public static void main(String[] args) {
    Random rand = new Random();
    int randomNumber = rand.nextInt(100) + 1;
    Scanner scanner = new Scanner(System.in);
    while(true){
      System.out.println("Choose number <1-100>:");
      int playerNumber = scanner.nextInt();
      if ( playerNumber == randomNumber){
        System.out.println("You won!");
        break;
      }
      else if (playerNumber < randomNumber){
        System.out.println("Your number is too low!");
      } else {
        System.out.println("Your number is too high!");
      }
    }
  }
}
