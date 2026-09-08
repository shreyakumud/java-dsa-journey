import java.util.Scanner;

public class loops {
  public static void main(String[] args) {
     
    Scanner sc = new Scanner(System.in);
     
    //1.FOR LOOP
    System.out.print("Enter N for for-loop: ");
    int n = sc.nextInt();

    System.out.println("For Loop: ");
    for(int i = 1; i <= n; i++) {
      System.out.println(i);
    }

    //2.WHILE LOOP
    System.out.println("While Loop: ");
    int i = 1;

    while(i <= n) {
      System.out.println(i);
      i++;
    }

    //3.DO-WHILE LOOP
    System.out.print("Enter N for do-while loop: ");
    n = sc.nextInt();

    System.out.println("Do-While Loop: ");
    int j = 1;

    do {
      System.out.println(i);
      j++;
    } while (j <= n);

    //4.EVEN NUMBERS
    System.out.print("Enter N to print even numbers");
    n = sc.nextInt();

    System.out.println("Even Numbers");
    for (int k = 1; k <= n; k++) {
      if (k % 2 == 0) {
        System.out.println(k);
      }
    }

    //5.SUM OF NUMBERS
    System.out.print("Enter N to find sum: ");
    n = sc.nextInt();

    int sum = 0;
    int k = 1;

    while (k <= n) {
      sum = sum + k;
      k++;
    }

    System.out.println("Sum = " + sum);

    //6.MULTIPLICATTION TABLE
    System.out.print("Enter a number for multiplication table: ");
    int num = sc.nextInt();

    System.out.println("Multiplication Table: ");
    for (int x = 1; x <= 10; x++) {
      System.out.println(num + 'x" + x + " = " + (num * x));
    }

    sc.close();
  }
}



  
       
  

    

  
