
/*
============================================================
                    09 - JAVA METHODS
============================================================

A METHOD is a block of code that performs a specific task.

Methods help in:
1. Code reusability
2. Reducing code duplication
3. Improving readability
4. Dividing programs into smaller tasks
5. Simplifying debugging and maintenance

GENERAL SYNTAX:

accessModifier returnType methodName(parameters) {
    // Method body
    return value; // Required for non-void methods
}

TOPICS COVERED:

01. Simple Method Without Parameters
02. Method With Parameters
03. Method With Return Value
04. Void vs Return Method
05. Static Method
06. Non-Static Method
07. Method Overloading (Number of Parameters)
08. Method Overloading (Parameter Types)
09. Pass By Value
10. Reverse a Number Using Methods
11. Prime Number Using Methods
12. Palindrome Number Using Methods

FILE NAME : 09-Methods.java
CLASS NAME: MethodsDemo

============================================================
*/

class MethodsDemo {

    /*
    ========================================================
    01. SIMPLE METHOD WITHOUT PARAMETERS
    ========================================================

    A method without parameters does not receive arguments.

    void means the method does not return a value.

    static means the method belongs to the class.

    This method simply prints a greeting message.
    */

    static void greet() {

        System.out.println("Hello, Welcome to Java Methods!");

    }


    /*
    ========================================================
    02. METHOD WITH PARAMETERS
    ========================================================

    Parameters are variables declared in a method definition.

    Arguments are actual values passed during a method call.

    Example:

    add(10, 20);

    Here:
    a = 10
    b = 20

    The method calculates and prints the sum.
    */

    static void add(int a, int b) {

        int sum = a + b;

        System.out.println("First Number : " + a);
        System.out.println("Second Number: " + b);
        System.out.println("Sum          : " + sum);

    }


    /*
    ========================================================
    03. METHOD WITH RETURN VALUE
    ========================================================

    A method with a return type sends a value back
    to the calling method.

    int means the method returns an integer.

    return sends the calculated value to the caller.
    */

    static int multiply(int a, int b) {

        int product = a * b;

        return product;

    }


    /*
    ========================================================
    04. VOID METHOD VS RETURN METHOD
    ========================================================

    VOID METHOD:
    - Does not return a value.
    - Can directly print the result.

    RETURN METHOD:
    - Returns a value to the caller.
    - Returned value can be stored or reused.
    */

    static void printSquare(int n) {

        int square = n * n;

        System.out.println("Square using void: " + square);

    }

    static int getSquare(int n) {

        int square = n * n;

        return square;

    }


    /*
    ========================================================
    05. STATIC METHOD
    ========================================================

    A static method belongs to the class.

    It can be called without creating an object.

    Example:

    MethodsDemo.staticDisplay();

    Inside the same class, staticDisplay() also works.
    */

    static void staticDisplay() {

        System.out.println("This is a static method.");

    }


    /*
    ========================================================
    06. NON-STATIC METHOD
    ========================================================

    A non-static method belongs to an object.

    To call it from static main(), create an object.

    Syntax:

    MethodsDemo obj = new MethodsDemo();

    obj.nonStaticDisplay();
    */

    void nonStaticDisplay() {

        System.out.println("This is a non-static method.");

    }


    /*
    ========================================================
    07. METHOD OVERLOADING - NUMBER OF PARAMETERS
    ========================================================

    Method overloading means defining multiple methods
    with the same name but different parameter lists.

    Here, the number of parameters is different.

    First method  : calculate(int, int)
    Second method : calculate(int, int, int)

    This is compile-time polymorphism.
    */

    static int calculate(int a, int b) {

        return a + b;

    }

    static int calculate(int a, int b, int c) {

        return a + b + c;

    }


    /*
    ========================================================
    08. METHOD OVERLOADING - PARAMETER TYPES
    ========================================================

    Methods can also be overloaded by changing
    the parameter data types.

    show(int a)
    show(double a)

    IMPORTANT:

    Changing only the return type is NOT overloading.

    Example of invalid overloading:

    int show(int a)
    double show(int a)

    Both methods have identical parameter lists.
    */

    static int show(int a) {

        return a;

    }

    static double show(double a) {

        return a;

    }


    /*
    ========================================================
    09. PASS BY VALUE
    ========================================================

    Java always uses pass by value.

    For primitive variables, a copy of the value
    is passed to the method.

    Changing the parameter does not change
    the original variable.

    Example:

    int a = 10;

    change(a);

    Inside method:
    x becomes 100.

    Outside method:
    a remains 10.
    */

    static void change(int x) {

        System.out.println("Before change inside method: " + x);

        x = 100;

        System.out.println("After change inside method : " + x);

    }


    /*
    ========================================================
    10. REVERSE A NUMBER USING METHODS
    ========================================================

    Example:

    Input : 1234
    Output: 4321

    Logic:

    1234 % 10 = 4
    reverse = 0 * 10 + 4 = 4

    123 % 10 = 3
    reverse = 4 * 10 + 3 = 43

    12 % 10 = 2
    reverse = 43 * 10 + 2 = 432

    1 % 10 = 1
    reverse = 432 * 10 + 1 = 4321

    This example handles non-negative integers
    whose reversed value fits in int.
    */

    static int reverseNumber(int n) {

        int reverse = 0;

        while (n > 0) {

            int digit = n % 10;

            reverse = reverse * 10 + digit;

            n = n / 10;

        }

        return reverse;

    }


    /*
    ========================================================
    11. PRIME NUMBER USING METHODS
    ========================================================

    A prime number is a natural number greater than 1
    having exactly two positive factors:

    1 and itself.

    Examples:

    Prime    : 2, 3, 5, 7, 11, 13, 17
    Not Prime: 1, 4, 6, 8, 9, 10

    Logic:

    If n <= 1, return false.

    Check divisibility starting from 2.

    We only need to check divisors up to sqrt(n).

    If any divisor divides n exactly,
    the number is not prime.

    Otherwise, it is prime.
    */

    static boolean isPrime(int n) {

        if (n <= 1) {

            return false;

        }

        for (int i = 2; i <= n / i; i++) {

            if (n % i == 0) {

                return false;

            }

        }

        return true;

    }


    /*
    ========================================================
    12. PALINDROME NUMBER USING METHODS
    ========================================================

    A palindrome number reads the same
    from left to right and right to left.

    Examples:

    121   -> Palindrome
    1331  -> Palindrome
    123   -> Not Palindrome

    Logic:

    Step 1: Store the original number.
    Step 2: Reverse the number.
    Step 3: Compare original and reversed values.

    If both are equal, it is a palindrome.

    This method reuses reverseNumber().
    */

    static boolean isPalindrome(int n) {

        if (n < 0) {

            return false;

        }

        int reversed = reverseNumber(n);

        return n == reversed;

    }


    /*
    ========================================================
                        MAIN METHOD
    ========================================================

    Program execution starts from main().

    Each method is called separately below.

    The output is divided into numbered sections
    for easy understanding and GitHub documentation.
    */

    public static void main(String[] args) {

        System.out.println("==================================");
        System.out.println("        JAVA METHODS DEMO         ");
        System.out.println("==================================");


        // ------------------------------------------------
        // 01. SIMPLE METHOD WITHOUT PARAMETERS
        // ------------------------------------------------

        System.out.println("\n01. SIMPLE METHOD");

        greet();


        // ------------------------------------------------
        // 02. METHOD WITH PARAMETERS
        // ------------------------------------------------

        System.out.println("\n02. METHOD WITH PARAMETERS");

        add(10, 20);


        // ------------------------------------------------
        // 03. METHOD WITH RETURN VALUE
        // ------------------------------------------------

        System.out.println("\n03. METHOD WITH RETURN VALUE");

        int result = multiply(5, 4);

        System.out.println("Multiplication Result: " + result);


        // ------------------------------------------------
        // 04. VOID VS RETURN METHOD
        // ------------------------------------------------

        System.out.println("\n04. VOID VS RETURN METHOD");

        printSquare(5);

        int square = getSquare(5);

        System.out.println("Square using return: " + square);


        // ------------------------------------------------
        // 05. STATIC METHOD
        // ------------------------------------------------

        System.out.println("\n05. STATIC METHOD");

        staticDisplay();

        // Also valid:
        // MethodsDemo.staticDisplay();


        // ------------------------------------------------
        // 06. NON-STATIC METHOD
        // ------------------------------------------------

        System.out.println("\n06. NON-STATIC METHOD");

        MethodsDemo obj = new MethodsDemo();

        obj.nonStaticDisplay();


        // ------------------------------------------------
        // 07. METHOD OVERLOADING
        // ------------------------------------------------

        System.out.println("\n07. METHOD OVERLOADING");

        int sumTwo = calculate(10, 20);

        int sumThree = calculate(10, 20, 30);

        System.out.println("Sum of 2 numbers: " + sumTwo);

        System.out.println("Sum of 3 numbers: " + sumThree);


        // ------------------------------------------------
        // 08. OVERLOADING WITH DIFFERENT TYPES
        // ------------------------------------------------

        System.out.println("\n08. OVERLOADING WITH DIFFERENT TYPES");

        int intResult = show(10);

        double doubleResult = show(10.5);

        System.out.println("Integer Result: " + intResult);

        System.out.println("Double Result : " + doubleResult);


        // ------------------------------------------------
        // 09. PASS BY VALUE
        // ------------------------------------------------

        System.out.println("\n09. PASS BY VALUE");

        int a = 10;

        System.out.println("Before method call: " + a);

        change(a);

        System.out.println("After method call : " + a);


        // ------------------------------------------------
        // 10. REVERSE NUMBER
        // ------------------------------------------------

        System.out.println("\n10. REVERSE A NUMBER");

        int number = 1234;

        int reversed = reverseNumber(number);

        System.out.println("Original Number: " + number);

        System.out.println("Reversed Number: " + reversed);


        // ------------------------------------------------
        // 11. PRIME NUMBER
        // ------------------------------------------------

        System.out.println("\n11. PRIME NUMBER");

        int primeNumber = 17;

        boolean primeResult = isPrime(primeNumber);

        System.out.println("Number: " + primeNumber);

        System.out.println("Is Prime: " + primeResult);


        // ------------------------------------------------
        // 12. PALINDROME NUMBER
        // ------------------------------------------------

        System.out.println("\n12. PALINDROME NUMBER");

        int palindromeNumber = 121;

        boolean palindromeResult =
                isPalindrome(palindromeNumber);

        System.out.println("Number: " + palindromeNumber);

        System.out.println("Is Palindrome: " + palindromeResult);


        // ------------------------------------------------
        // END OF PROGRAM
        // ------------------------------------------------

        System.out.println("\n==================================");
        System.out.println("     ALL METHODS EXECUTED         ");
        System.out.println("==================================");

    }

}
==================================
        JAVA METHODS DEMO
==================================

01. SIMPLE METHOD
Hello, Welcome to Java Methods!

02. METHOD WITH PARAMETERS
First Number : 10
Second Number: 20
Sum          : 30

03. METHOD WITH RETURN VALUE
Multiplication Result: 20

04. VOID VS RETURN METHOD
Square using void: 25
Square using return: 25

05. STATIC METHOD
This is a static method.

06. NON-STATIC METHOD
This is a non-static method.

07. METHOD OVERLOADING
Sum of 2 numbers: 30
Sum of 3 numbers: 60

08. OVERLOADING WITH DIFFERENT TYPES
Integer Result: 10
Double Result : 10.5

09. PASS BY VALUE
Before method call: 10
Before change inside method: 10
After change inside method : 100
After method call : 10

10. REVERSE A NUMBER
Original Number: 1234
Reversed Number: 4321

11. PRIME NUMBER
Number: 17
Is Prime: true

12. PALINDROME NUMBER
Number: 121
Is Palindrome: true

==================================
     ALL METHODS EXECUTED
==================================
