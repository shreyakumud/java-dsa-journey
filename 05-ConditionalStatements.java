import java.util.Scanner;

public class ConditionalStatements {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    //if-else
    System.out.print("Enter your age: ");
    int age = sc.nextInt();

    if(age >= 18) {
      System.out.println("You are an adult.");
    } else {
      System.out.println("You are a minor.")
        }

    //else-iF
    System.out.println("Enter your marks: ");
    int marks = sc.nextInt();

    if (marks >= 90) {
      System.out.println("Grade A+");
    } else if (marks >= 80) {
      System.out.println("Grade A");
    } else if (marks >= 70) {
      System.out.println("Grade B");
    } else {
      System.out.println("Grade C");
    }

    //Nested if 
    System.out.print("Enter a number: ");
    int number = sc.nextInt();

    if(number > 0) {
      if (number % 2 == 0) {
        System.out.println("Positive even number");
      }
    }

    sc.close();
  }
}



    
      
     
    

  

  
