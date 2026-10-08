
/*
============================================================
                     10 - JAVA ARRAYS
============================================================

An ARRAY is a collection of elements of the same data type,
stored under a single variable name.

Arrays use zero-based indexing.

Example:

int[] numbers = {10, 20, 30, 40, 50};

Index:     0   1   2   3   4
Element:  10  20  30  40  50

IMPORTANT CONCEPTS:

1. Arrays have a fixed length after creation.
2. Indexing starts from 0.
3. Array elements are accessed using their index.
4. The length property gives the number of elements.
5. Accessing an invalid index causes an exception.
6. Arrays can store primitive values or object references.
7. Java arrays are objects.

TOPICS COVERED:

01. Array Declaration
02. Array Initialization
03. Accessing Array Elements
04. Updating Array Elements
05. Array Length
06. Traversing Using for Loop
07. Traversing Using for-each Loop
08. Taking Array Input Using Scanner
09. Printing an Array
10. Sum of Array Elements
11. Average of Array Elements
12. Maximum Element
13. Minimum Element
14. Linear Search
15. Reverse an Array
16. Count Even and Odd Numbers
17. Copy an Array
18. Sort an Array
19. Second Largest Distinct Element
20. Count Positive, Negative and Zero
21. Frequency of an Element
22. Check Whether Array is Sorted
23. Merge Two Arrays
24. Two-Dimensional Array
25. Sum of Two Matrices

FILE NAME : 10-Arrays.java
CLASS NAME: ArraysDemo

============================================================
*/

import java.util.Scanner;
import java.util.Arrays;

class ArraysDemo {

    /*
    ========================================================
    01. ARRAY DECLARATION
    ========================================================

    Declaration tells Java the type of array reference.

    Syntax:

    dataType[] arrayName;

    Example:

    int[] numbers;

    Creating an array:

    numbers = new int[5];

    This creates an array containing five integers.

    Default values for int array elements are 0.
    */

    static void arrayDeclaration() {

        int[] numbers;

        numbers = new int[5];

        System.out.println("Array declared and created.");

        System.out.println("Default first element: " + numbers[0]);

    }


    /*
    ========================================================
    02. ARRAY INITIALIZATION
    ========================================================

    Initialization means assigning values to an array.

    Method 1:

    int[] a = {10, 20, 30};

    Method 2:

    int[] a = new int[3];

    a[0] = 10;
    a[1] = 20;
    a[2] = 30;
    */

    static void arrayInitialization() {

        int[] numbers = {10, 20, 30, 40, 50};

        System.out.println("Initialized Array:");

        System.out.println(Arrays.toString(numbers));

    }


    /*
    ========================================================
    03. ACCESSING ARRAY ELEMENTS
    ========================================================

    Array elements are accessed using indexes.

    Index starts from 0.

    Example:

    numbers[0] gives the first element.
    numbers[2] gives the third element.
    */

    static void accessElements() {

        int[] numbers = {10, 20, 30, 40, 50};

        System.out.println("First Element: " + numbers[0]);

        System.out.println("Third Element: " + numbers[2]);

        System.out.println("Last Element: "
                + numbers[numbers.length - 1]);

    }


    /*
    ========================================================
    04. UPDATING ARRAY ELEMENTS
    ========================================================

    Array elements can be changed using their indexes.

    Example:

    numbers[1] = 100;

    This replaces the second element with 100.
    */

    static void updateElements() {

        int[] numbers = {10, 20, 30, 40, 50};

        System.out.println("Before Update: "
                + Arrays.toString(numbers));

        numbers[1] = 100;

        System.out.println("After Update : "
                + Arrays.toString(numbers));

    }


    /*
    ========================================================
    05. ARRAY LENGTH
    ========================================================

    The length property returns the total number
    of elements in an array.

    Syntax:

    arrayName.length

    IMPORTANT:

    length is a property, not a method.

    Correct : numbers.length
    Wrong   : numbers.length()
    */

    static void arrayLength() {

        int[] numbers = {10, 20, 30, 40, 50};

        System.out.println("Array Length: " + numbers.length);

    }


    /*
    ========================================================
    06. TRAVERSING USING FOR LOOP
    ========================================================

    Traversing means visiting every array element.

    A for loop is useful when indexes are required.

    Syntax:

    for (int i = 0; i < arr.length; i++) {
        System.out.println(arr[i]);
    }
    */

    static void traverseForLoop() {

        int[] numbers = {10, 20, 30, 40, 50};

        for (int i = 0; i < numbers.length; i++) {

            System.out.println("Index " + i
                    + " = " + numbers[i]);

        }

    }


    /*
    ========================================================
    07. TRAVERSING USING FOR-EACH LOOP
    ========================================================

    A for-each loop directly accesses each element.

    Syntax:

    for (int value : array) {
        System.out.println(value);
    }

    It is useful when indexes are not needed.
    */

    static void traverseForEach() {

        int[] numbers = {10, 20, 30, 40, 50};

        for (int number : numbers) {

            System.out.print(number + " ");

        }

        System.out.println();

    }


    /*
    ========================================================
    08. TAKING ARRAY INPUT USING SCANNER
    ========================================================

    Scanner reads values entered by the user.

    First read the number of elements.

    Then create an array of that size.

    Finally, use a loop to read each element.
    */

    static void arrayInput(Scanner sc) {

        System.out.print("Enter array size: ");

        int n = sc.nextInt();

        if (n < 0) {

            System.out.println("Array size cannot be negative.");
            return;

        }

        int[] numbers = new int[n];

        System.out.println("Enter " + n + " elements:");

        for (int i = 0; i < n; i++) {

            numbers[i] = sc.nextInt();

        }

        System.out.println("Entered Array: "
                + Arrays.toString(numbers));

    }


    /*
    ========================================================
    09. PRINTING AN ARRAY
    ========================================================

    Arrays can be printed using:

    1. for loop
    2. for-each loop
    3. Arrays.toString()

    Arrays.toString() provides a readable representation.
    */

    static void printArray() {

        int[] numbers = {10, 20, 30, 40, 50};

        System.out.println(Arrays.toString(numbers));

    }


    /*
    ========================================================
    10. SUM OF ARRAY ELEMENTS
    ========================================================

    Logic:

    Initialize sum = 0.

    Visit each element.

    Add each element to sum.

    Example:

    10 + 20 + 30 + 40 + 50 = 150
    */

    static int sumArray(int[] numbers) {

        int sum = 0;

        for (int number : numbers) {

            sum = sum + number;

        }

        return sum;

    }


    /*
    ========================================================
    11. AVERAGE OF ARRAY ELEMENTS
    ========================================================

    Formula:

    Average = Sum of Elements / Number of Elements

    Type casting converts the result into double.

    An empty array has no arithmetic average.
    */

    static double averageArray(int[] numbers) {

        if (numbers.length == 0) {

            throw new IllegalArgumentException(
                    "Cannot calculate average of an empty array.");

        }

        int sum = sumArray(numbers);

        return (double) sum / numbers.length;

    }


    /*
    ========================================================
    12. MAXIMUM ELEMENT
    ========================================================

    Logic:

    Assume the first element is maximum.

    Compare it with remaining elements.

    Update maximum when a larger element is found.
    */

    static int findMaximum(int[] numbers) {

        if (numbers.length == 0) {

            throw new IllegalArgumentException(
                    "Array must not be empty.");

        }

        int max = numbers[0];

        for (int i = 1; i < numbers.length; i++) {

            if (numbers[i] > max) {

                max = numbers[i];

            }

        }

        return max;

    }


    /*
    ========================================================
    13. MINIMUM ELEMENT
    ========================================================

    Logic:

    Assume the first element is minimum.

    Compare it with remaining elements.

    Update minimum when a smaller element is found.
    */

    static int findMinimum(int[] numbers) {

        if (numbers.length == 0) {

            throw new IllegalArgumentException(
                    "Array must not be empty.");

        }

        int min = numbers[0];

        for (int i = 1; i < numbers.length; i++) {

            if (numbers[i] < min) {

                min = numbers[i];

            }

        }

        return min;

    }


    /*
    ========================================================
    14. LINEAR SEARCH
    ========================================================

    Linear search checks elements one by one.

    If the target is found, return its index.

    If not found, return -1.

    Time Complexity: O(n)
    */

    static int linearSearch(int[] numbers, int target) {

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] == target) {

                return i;

            }

        }

        return -1;

    }


    /*
    ========================================================
    15. REVERSE AN ARRAY
    ========================================================

    Two-pointer approach:

    One pointer starts at the beginning.

    Another pointer starts at the end.

    Swap elements until the pointers meet.

    This method modifies the original array.
    */

    static void reverseArray(int[] numbers) {

        int left = 0;

        int right = numbers.length - 1;

        while (left < right) {

            int temp = numbers[left];

            numbers[left] = numbers[right];

            numbers[right] = temp;

            left++;

            right--;

        }

    }


    /*
    ========================================================
    16. COUNT EVEN AND ODD NUMBERS
    ========================================================

    Even numbers are divisible by 2.

    Odd numbers are not divisible by 2.

    Use the modulus operator (%).
    */

    static void countEvenOdd(int[] numbers) {

        int even = 0;

        int odd = 0;

        for (int number : numbers) {

            if (number % 2 == 0) {

                even++;

            } else {

                odd++;

            }

        }

        System.out.println("Even Count: " + even);

        System.out.println("Odd Count : " + odd);

    }


    /*
    ========================================================
    17. COPY AN ARRAY
    ========================================================

    An array can be copied using a loop.

    A new array is created to store copied values.

    The original and copied arrays are separate objects.
    */

    static int[] copyArray(int[] numbers) {

        int[] copy = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++) {

            copy[i] = numbers[i];

        }

        return copy;

    }


    /*
    ========================================================
    18. SORT AN ARRAY
    ========================================================

    Sorting means arranging elements in order.

    Arrays.sort() sorts an int array in ascending order.

    It modifies the given array.
    */

    static void sortArray(int[] numbers) {

        Arrays.sort(numbers);

    }


    /*
    ========================================================
    19. SECOND LARGEST DISTINCT ELEMENT
    ========================================================

    Example:

    Input : 10, 40, 20, 50, 30

    Largest        : 50
    Second Largest : 40

    Duplicate maximum values are not counted
    as the second largest distinct value.

    If no second distinct value exists,
    an exception is thrown.
    */

    static int secondLargest(int[] numbers) {

        Integer largest = null;

        Integer second = null;

        for (int number : numbers) {

            if (largest == null || number > largest) {

                second = largest;

                largest = number;

            } else if (number < largest
                    && (second == null || number > second)) {

                second = number;

            }

        }

        if (second == null) {

            throw new IllegalArgumentException(
                    "At least two distinct values are required.");

        }

        return second;

    }


    /*
    ========================================================
    20. COUNT POSITIVE, NEGATIVE AND ZERO
    ========================================================

    Positive: Number > 0

    Negative: Number < 0

    Zero    : Number == 0
    */

    static void countNumbers(int[] numbers) {

        int positive = 0;

        int negative = 0;

        int zero = 0;

        for (int number : numbers) {

            if (number > 0) {

                positive++;

            } else if (number < 0) {

                negative++;

            } else {

                zero++;

            }

        }

        System.out.println("Positive: " + positive);

        System.out.println("Negative: " + negative);

        System.out.println("Zero    : " + zero);

    }


    /*
    ========================================================
    21. FREQUENCY OF AN ELEMENT
    ========================================================

    Frequency means how many times an element appears.

    Example:

    Array : 10, 20, 10, 30, 10

    Target: 10

    Frequency = 3
    */

    static int frequency(int[] numbers, int target) {

        int count = 0;

        for (int number : numbers) {

            if (number == target) {

                count++;

            }

        }

        return count;

    }


    /*
    ========================================================
    22. CHECK WHETHER ARRAY IS SORTED
    ========================================================

    Check whether elements are in non-decreasing order.

    Example:

    10, 20, 30, 40 -> Sorted

    10, 30, 20, 40 -> Not Sorted

    Equal adjacent elements are allowed.
    */

    static boolean isSorted(int[] numbers) {

        for (int i = 0; i < numbers.length - 1; i++) {

            if (numbers[i] > numbers[i + 1]) {

                return false;

            }

        }

        return true;

    }


    /*
    ========================================================
    23. MERGE TWO ARRAYS
    ========================================================

    Merging combines two arrays into a new array.

    Example:

    First : 10, 20

    Second: 30, 40

    Merged: 10, 20, 30, 40

    This is concatenation, not sorted merging.
    */

    static int[] mergeArrays(int[] a, int[] b) {

        int[] merged = new int[a.length + b.length];

        for (int i = 0; i < a.length; i++) {

            merged[i] = a[i];

        }

        for (int i = 0; i < b.length; i++) {

            merged[a.length + i] = b[i];

        }

        return merged;

    }


    /*
    ========================================================
    24. TWO-DIMENSIONAL ARRAY
    ========================================================

    A two-dimensional array can represent a matrix.

    Example:

    int[][] matrix = {
        {1, 2, 3},
        {4, 5, 6}
    };

    matrix[0][0] = 1

    matrix[1][2] = 6

    Nested loops can traverse rows and columns.
    */

    static void printMatrix(int[][] matrix) {

        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[i].length; j++) {

                System.out.print(matrix[i][j] + " ");

            }

            System.out.println();

        }

    }


    /*
    ========================================================
    25. SUM OF TWO MATRICES
    ========================================================

    Matrix addition adds corresponding elements.

    Both matrices must have the same dimensions.

    Example:

    A = 1 2       B = 5 6
        3 4           7 8

    A + B = 6  8
            10 12
    */

    static int[][] addMatrices(int[][] a, int[][] b) {

        if (a.length != b.length) {

            throw new IllegalArgumentException(
                    "Matrices must have the same dimensions.");

        }

        int[][] result = new int[a.length][];

        for (int i = 0; i < a.length; i++) {

            if (a[i].length != b[i].length) {

                throw new IllegalArgumentException(
                        "Matrix row lengths must match.");

            }

            result[i] = new int[a[i].length];

            for (int j = 0; j < a[i].length; j++) {

                result[i][j] = a[i][j] + b[i][j];

            }

        }

        return result;

    }


    /*
    ========================================================
                        MAIN METHOD
    ========================================================

    Execution begins from main().

    Each array program is demonstrated separately.

    Most examples use predefined values.

    The Scanner example takes user input.
    */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] numbers = {10, 20, 30, 40, 50};

        System.out.println("==================================");
        System.out.println("         JAVA ARRAYS DEMO         ");
        System.out.println("==================================");


        // 01. ARRAY DECLARATION

        System.out.println("\n01. ARRAY DECLARATION");

        arrayDeclaration();


        // 02. ARRAY INITIALIZATION

        System.out.println("\n02. ARRAY INITIALIZATION");

        arrayInitialization();


        // 03. ACCESSING ELEMENTS

        System.out.println("\n03. ACCESSING ELEMENTS");

        accessElements();


        // 04. UPDATING ELEMENTS

        System.out.println("\n04. UPDATING ELEMENTS");

        updateElements();


        // 05. ARRAY LENGTH

        System.out.println("\n05. ARRAY LENGTH");

        arrayLength();


        // 06. FOR LOOP

        System.out.println("\n06. TRAVERSING USING FOR LOOP");

        traverseForLoop();


        // 07. FOR-EACH LOOP

        System.out.println("\n07. TRAVERSING USING FOR-EACH");

        traverseForEach();


        // 08. SCANNER INPUT

        System.out.println("\n08. ARRAY INPUT USING SCANNER");

        arrayInput(sc);


        // 09. PRINT ARRAY

        System.out.println("\n09. PRINTING ARRAY");

        printArray();


        // 10. SUM

        System.out.println("\n10. SUM OF ARRAY ELEMENTS");

        System.out.println("Sum: " + sumArray(numbers));


        // 11. AVERAGE

        System.out.println("\n11. AVERAGE OF ARRAY ELEMENTS");

        System.out.println("Average: " + averageArray(numbers));


        // 12. MAXIMUM

        System.out.println("\n12. MAXIMUM ELEMENT");

        System.out.println("Maximum: " + findMaximum(numbers));


        // 13. MINIMUM

        System.out.println("\n13. MINIMUM ELEMENT");

        System.out.println("Minimum: " + findMinimum(numbers));


        // 14. LINEAR SEARCH

        System.out.println("\n14. LINEAR SEARCH");

        int target = 30;

        int index = linearSearch(numbers, target);

        System.out.println("Target: " + target);

        System.out.println("Found at index: " + index);


        // 15. REVERSE ARRAY

        System.out.println("\n15. REVERSE ARRAY");

        int[] reversed = copyArray(numbers);

        reverseArray(reversed);

        System.out.println("Original: "
                + Arrays.toString(numbers));

        System.out.println("Reversed: "
                + Arrays.toString(reversed));


        // 16. EVEN AND ODD

        System.out.println("\n16. COUNT EVEN AND ODD");

        int[] mixed = {1, 2, 3, 4, 5, 6};

        countEvenOdd(mixed);


        // 17. COPY ARRAY

        System.out.println("\n17. COPY ARRAY");

        int[] copied = copyArray(numbers);

        System.out.println("Original: "
                + Arrays.toString(numbers));

        System.out.println("Copied  : "
                + Arrays.toString(copied));


        // 18. SORT ARRAY

        System.out.println("\n18. SORT ARRAY");

        int[] unsorted = {50, 10, 40, 20, 30};

        System.out.println("Before: "
                + Arrays.toString(unsorted));

        sortArray(unsorted);

        System.out.println("After : "
                + Arrays.toString(unsorted));


        // 19. SECOND LARGEST

        System.out.println("\n19. SECOND LARGEST");

        int[] values = {10, 40, 20, 50, 30};

        System.out.println("Second Largest: "
                + secondLargest(values));


        // 20. POSITIVE, NEGATIVE AND ZERO

        System.out.println("\n20. COUNT POSITIVE, NEGATIVE AND ZERO");

        int[] signed = {-5, 10, 0, -2, 20, 0};

        countNumbers(signed);


        // 21. FREQUENCY

        System.out.println("\n21. FREQUENCY OF ELEMENT");

        int[] repeated = {10, 20, 10, 30, 10};

        System.out.println("Frequency of 10: "
                + frequency(repeated, 10));


        // 22. CHECK SORTED ARRAY

        System.out.println("\n22. CHECK SORTED ARRAY");

        int[] sorted = {10, 20, 30, 40};

        System.out.println("Is Sorted: " + isSorted(sorted));


        // 23. MERGE ARRAYS

        System.out.println("\n23. MERGE TWO ARRAYS");

        int[] first = {10, 20};

        int[] second = {30, 40};

        int[] merged = mergeArrays(first, second);

        System.out.println("Merged Array: "
                + Arrays.toString(merged));


        // 24. TWO-DIMENSIONAL ARRAY

        System.out.println("\n24. TWO-DIMENSIONAL ARRAY");

        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6}
        };

        printMatrix(matrix);


        // 25. MATRIX ADDITION

        System.out.println("\n25. MATRIX ADDITION");

        int[][] a = {
            {1, 2},
            {3, 4}
        };

        int[][] b = {
            {5, 6},
            {7, 8}
        };

        int[][] result = addMatrices(a, b);

        printMatrix(result);


        System.out.println("\n==================================");
        System.out.println("      ALL ARRAY PROGRAMS DONE     ");
        System.out.println("==================================");

        sc.close();

    }

}
/*
==================================================
                SAMPLE OUTPUT
==================================================

01. ARRAY DECLARATION
Array declared and created.
Default first element: 0

02. ARRAY INITIALIZATION
Initialized Array:
[10, 20, 30, 40, 50]

03. ACCESSING ELEMENTS
First Element: 10
Third Element: 30
Last Element: 50

04. UPDATING ELEMENTS
Before Update: [10, 20, 30, 40, 50]
After Update : [10, 100, 30, 40, 50]

05. ARRAY LENGTH
Array Length: 5

06. TRAVERSING USING FOR LOOP
Index 0 = 10
Index 1 = 20
Index 2 = 30
Index 3 = 40
Index 4 = 50

07. TRAVERSING USING FOR-EACH
10 20 30 40 50

08. ARRAY INPUT USING SCANNER
Enter array size: 5
Enter 5 elements:
10 20 30 40 50
Entered Array: [10, 20, 30, 40, 50]

09. PRINTING ARRAY
[10, 20, 30, 40, 50]

10. SUM OF ARRAY ELEMENTS
Sum: 150

11. AVERAGE OF ARRAY ELEMENTS
Average: 30.0

12. MAXIMUM ELEMENT
Maximum: 50

13. MINIMUM ELEMENT
Minimum: 10

14. LINEAR SEARCH
Target: 30
Found at index: 2

15. REVERSE ARRAY
Original: [10, 20, 30, 40, 50]
Reversed: [50, 40, 30, 20, 10]

16. COUNT EVEN AND ODD
Even Count: 3
Odd Count : 3

17. COPY ARRAY
Original: [10, 20, 30, 40, 50]
Copied  : [10, 20, 30, 40, 50]

18. SORT ARRAY
Before: [50, 10, 40, 20, 30]
After : [10, 20, 30, 40, 50]

19. SECOND LARGEST
Second Largest: 40

20. COUNT POSITIVE, NEGATIVE AND ZERO
Positive: 2
Negative: 2
Zero    : 2

21. FREQUENCY OF ELEMENT
Frequency of 10: 3

22. CHECK SORTED ARRAY
Is Sorted: true

23. MERGE TWO ARRAYS
Merged Array: [10, 20, 30, 40]

24. TWO-DIMENSIONAL ARRAY
1 2 3
4 5 6

25. MATRIX ADDITION
6 8
10 12

==================================
      ALL ARRAY PROGRAMS DONE
==================================

==================================================
*/
