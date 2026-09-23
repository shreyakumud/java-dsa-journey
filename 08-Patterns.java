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

// Pattern 5: 180 Degree Rotated Half Pyramid

System.out.print("Enter the number of rows: ");
int n5 = sc.nextInt();

for (int i = 1; i <= n5; i++) {

    for (int j = 1; j <= n5 - i; j++) {
        System.out.print("  ");
    }

    for (int j = 1; j <= i; j++) {
        System.out.print("* ");
    }

    System.out.println();
}


// Pattern 6: Number Triangle

System.out.print("Enter the number of rows: ");
int n6 = sc.nextInt();

for (int i = 1; i <= n6; i++) {

    for (int j = 1; j <= i; j++) {
        System.out.print(j + " ");
    }

    System.out.println();
}


// Pattern 7: 0-1 Triangle

System.out.print("Enter the number of rows: ");
int n7 = sc.nextInt();

for (int i = 1; i <= n7; i++) {

    for (int j = 1; j <= i; j++) {

        if ((i + j) % 2 == 0) {
            System.out.print("1 ");
        } else {
            System.out.print("0 ");
        }
    }

    System.out.println();
}


// Pattern 8: Number Rectangle

System.out.print("Enter the number of rows: ");
int rows8 = sc.nextInt();

System.out.print("Enter the number of columns: ");
int cols8 = sc.nextInt();

for (int i = 1; i <= rows8; i++) {

    for (int j = 1; j <= cols8; j++) {
        System.out.print(j + " ");
    }

    System.out.println();
}

// Pattern 9: Floyd's Triangle

System.out.print("Enter the number of rows: ");
int n9 = sc.nextInt();

int number = 1;

for (int i = 1; i <= n9; i++) {

    for (int j = 1; j <= i; j++) {
        System.out.print(number + " ");
        number++;
    }

    System.out.println();
}

// Pattern 10: 0-1 Rectangle

System.out.print("Enter the number of rows: ");
int rows10 = sc.nextInt();

System.out.print("Enter the number of columns: ");
int cols10 = sc.nextInt();

for (int i = 1; i <= rows10; i++) {

    for (int j = 1; j <= cols10; j++) {

        if ((i + j) % 2 == 0) {
            System.out.print("1 ");
        } else {
            System.out.print("0 ");
        }
    }

    System.out.println();
}

// Pattern 11: Palindromic Number Pyramid

System.out.print("Enter the number of rows: ");
int n11 = sc.nextInt();

for (int i = 1; i <= n11; i++) {

    // Spaces
    for (int j = 1; j <= n11 - i; j++) {
        System.out.print("  ");
    }

    // Descending numbers
    for (int j = i; j >= 1; j--) {
        System.out.print(j + " ");
    }

    // Ascending numbers
    for (int j = 2; j <= i; j++) {
        System.out.print(j + " ");
    }

    System.out.println();
}
    
      
    
      

  
           
  

  
