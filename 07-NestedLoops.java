import java.util.Scanner;

Public class NestedLoops {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    //1.Multiplication table from 1 to N 
    System.out.print("Enter N: ");
    int n = sc.nextInt();

    System.out.println("Multiplication tables:");

    for (int i = 1; i <= n; i++) {
        System.out.println("Table of " + i);

        for (int j = 1; j <=10; j++) {
          System.out.println( i + "x" + j + " = " + (i * j));
        }
        System.out.println();
    }

    //2.Suare Pattern
    System.out.print("Enter the size of square pattern: ");
    int size = sc.nextInt();

    for(int i = 1; i <= size; i++) {

      for(int j = 1; j <= size; j++) {
          System.out.print("* );
      }

      System.out.println();
    }

    sc.close();
  }
}
      
    
   

       

     //3.Right angle triangle
  
  
    
  
  
      
      
    

    
      
       

    



  
