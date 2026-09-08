import java.util.Scanner;

public class Patterns {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    //Pattern 1: SOLIC RECTANGLE
    System.out.print("Enter rows: ");
    int n = sc.nextInt();

    System.out.print("Enter columns: ");
    int m = sc.nextInt();

    for(int i = 1; i <= n; i++) {
      for(int j = 1; j <= m; j++) {
        System.out.print("* ");
      }
      System.out.println();
    }

    //Pattern 2: HOLLOW RECTANGLE
    System.out.print("Enter rows: ");
    int n = sc.nextInt();

    System.out.print("Enter column: ");
    int m = sc.nextInt();

    for(int i = 1; i <= n; i++) {
      for(int j = 1; j <= m; j++) {
        if(i == 1 || i == rows || j == 1 || j == columns) {
          System.out.print("* ");
        } else {
          System.out.print(" ");
        }
      }

      System.out.println();
    }

    //Patern 3: INCREASING TRIANGLE
    System.out.print("Enter the number of rows: ");
    int n = sc.nextInt();

    for(int i = 1; i <= n; i++) {
      for(int j = 1; j <= i; j++) {
        System.out.print("* ");
      }
      System.out.println();
    }

    //Pattern 4: DECREASING TRIANGLE
    System.out.print("Enter number of rows: ");
    n = sc.nextInt();

    for(int i = n; i >= 1; i--) {
      for(int j = 1; j <= i; j++) {
        System.out.print("* ");
      }
      System.out.println();
    }

    sc.close();
  }
}
    
      
    
      

  
           
  

  
