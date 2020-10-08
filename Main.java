import java.util.Scanner;
/**
 *
 * @author 
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // cretae a Scanner for user input
    Scanner input = new Scanner(System.in);

    // create an array to store the values
    int[] numbers = new int[10];

    // ask the user for the 10 numbers
    System.out.println("Please enter in 10 integers to put into the array");

    // use a for loop to get the values
    for(int i = 0; i < numbers.length; i++){
      // fill the array with values
      numbers[i] = input.nextInt();
    }

    // use a loop to find the biggest numbers
    for(int i = 0; i < numbers.length; i++){
      if(numbers[i] )
    }
    
  }
}
