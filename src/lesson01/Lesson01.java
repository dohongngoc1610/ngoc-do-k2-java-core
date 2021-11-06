package lesson01;

import java.util.Scanner;

/**
 * Created by ngochongdo on 10/18/2021
 */
public class Lesson01 {
    public static void main(String[] args) {
        new Lesson01().showMainMenu();
    }

    int enterAndGetIntegerNumber(String meaningOfNumber, int minValue, int maxValue) {
        System.out.print("Please enter "+meaningOfNumber+": ");
        int status; // Status of entering number: 1 is OK, valid number and 0 is NOT OK, invalid number, need to enter again
        int number = minValue - 1; // System requires mandatory initialization for primitive variable. Assume initial value of number is invalid to require user enter number from keyboard.
        do {
            status = 1;
            try {
                Scanner scanner = new Scanner(System.in);
                number = scanner.nextInt();
                if (number < minValue || number > maxValue) {
                    status = 0;
                    System.out.print("Invalid number. Valid number is between from " + minValue + " to " + maxValue + ". Please enter again:");
                }
            } catch (Exception e) {
                status = 0;
                System.out.print("Invalid number. Valid number is a integer number. Please enter again:");
            }
        } while (status == 0);
        return number;
    }

    void showMainMenu() {
        System.out.println("------- K2 Lesson 01 Exercises Menu -------");
        System.out.println("--- Exercise 00: Enter n after that show n row with * characters corresponding. Please enter 0. --- ");
        System.out.println("--- Exercise 01: Calculate factorial n! . Please enter 1. --- ");
        System.out.println("--- Exercise 02: Calculate average of a non-negative integer array. Please enter 2. --- ");
        System.out.println("--- Exercise 03: Find max number of a integer array. Please enter 3. --- ");
        System.out.println("--- Exercise 04: Sort ascending a integer array. Please enter 4. --- ");
        System.out.println("--- Exercise 05: Check if input number is prime number, right ? Please enter 5. --- ");
        System.out.println("--- Exercise 06: Show all prime number <= input number. Please enter 6. --- ");
        System.out.println("--- To Exit. Please enter 7. --- ");
        System.out.println("-------------------------------------------------- ");

        // Enter number to choose exercise to run
        int mainMenuNumberChoice = enterAndGetIntegerNumber("a integer number", 0, 7);

        switch (mainMenuNumberChoice) {
            case 0:
                exercise00();
                break;
            case 1:
                exercise01();
                break;
            case 2:
                exercise02();
                break;
            case 3:
                exercise03();
                break;
            case 4:
                exercise04();
                break;
            case 5:
                exercise05();
                break;
            case 6:
                exercise06();
                break;
            case 7:
                System.exit(0);
                break;
        }
    }

    void showChildMenu(int currentExerciseNumber) {
        System.out.println("--- Do you want to continue ? ---");
        System.out.println("--- Enter 1 to continue current exercise. ");
        System.out.println("--- Enter 2 to go back lesson 01 Main Menu. ");
        System.out.println("--- Enter 3 to exit. ");

        // Enter number choose function in child menu
        int childMenuNumberChoice = enterAndGetIntegerNumber("a integer number", 1, 3);

        switch (childMenuNumberChoice) {
            case 1: {
                switch (currentExerciseNumber) {
                    case 0:
                        exercise00();
                        break;
                    case 1:
                        exercise01();
                        break;
                    case 2:
                        exercise02();
                        break;
                    case 3:
                        exercise03();
                        break;
                    case 4:
                        exercise04();
                        break;
                    case 5:
                        exercise05();
                        break;
                    case 6:
                        exercise06();
                        break;
                }
            }
            break;
            case 2:
                showMainMenu();
                break;
            case 3:
                System.exit(0);
                break;
        }
    }

    void exercise00() {
        System.out.println("-------------------------------------------------- ");
        System.out.println("--- Exercise 00: Enter n after that show n row with * characters corresponding ---");

        // Enter a integer number
        int number=enterAndGetIntegerNumber("a integer number",1, Integer.MAX_VALUE);

        for(int i=1; i<=number; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        // Call child menu to user can continue
        showChildMenu(0);
    }
    
    void exercise01() {
        System.out.println("-------------------------------------------------- ");
        System.out.println("--- Exercise 01: Calculate factorial n! ---");
        
        // Enter number n to calculate n! 
        int number = enterAndGetIntegerNumber("a integer number", 0, Integer.MAX_VALUE);
        // Declare result variable of n! . Assign initial value and calculate n!
        double result = number;
        for (int i = number - 1; i > 1; i--) {
            result = result * i;
        }

        // Show result n!
        System.out.println("==> "+number + "! = " + result);
        // Call child menu to user can continue
        showChildMenu(1);
    }

    int[] enterAndGetIntegerArray() {
        // Enter array length
        int arrayLength= enterAndGetIntegerNumber("array length", 1, Integer.MAX_VALUE);
        // Declare integer array
        int[] array=new int[arrayLength];
        // Enter element of array
        for(int i=0; i<arrayLength; i++)
        {
            array[i]= enterAndGetIntegerNumber("element "+i, 0, Integer.MAX_VALUE);
        }
        return array;
    }

    void showIntegerArray(int[] array) {
        System.out.print("==> Integer Array:");
        for(int i=0; i<array.length; i++)
        {
            System.out.print("\t"+array[i]);
        }
        System.out.println();
    }

    double getIntegerArrayAverage(int[] array) {
        // Calculate total of array
        double arrayTotal=0;
        for(int i=0; i<array.length; i++)
        {
            arrayTotal=arrayTotal+array[i];
        }
        double arrayAverage=arrayTotal/array.length;

        return arrayAverage;
    }

    void exercise02() {
        System.out.println("-------------------------------------------------- ");
        System.out.println("--- Exercise 02: Calculate average of a non-negative integer array ---");

        // Enter array
        int[] array= enterAndGetIntegerArray();
        // Show array
        showIntegerArray(array);
        // Calculate array average
        double arrayAverage= getIntegerArrayAverage(array);
        System.out.println("==> Integer Array Average is: "+arrayAverage);

        // Call child menu to user can continue
        showChildMenu(2);
    }

    void showMaxNumberInIntegerArray(int[] array) {
        int firstMaxNumberIndex=0;
        int maxNumberValue=array[0];
        for(int i=1; i<array.length; i++)
        {
            if(maxNumberValue<array[i])
            {
                maxNumberValue=array[i];
                firstMaxNumberIndex=i;
            }
        }

        System.out.println("==> Max Number of Integer Array is: "+maxNumberValue);
        System.out.println("==> Fist Max Number Index of Integer Array is: "+firstMaxNumberIndex);
    }

    void exercise03() {
        System.out.println("-------------------------------------------------- ");
        System.out.println("--- Exercise 03: Find max number of a integer array ---");

        // Enter integer array
        int[] array= enterAndGetIntegerArray();
        // Show array
        showIntegerArray(array);
        // Show max number of array
        showMaxNumberInIntegerArray(array);
        // Call child menu to user can continue
        showChildMenu(3);
    }

    int getFirstMaxNumberIndexInIntegerArray(int[] array) {
        int firstMaxNumberIndex=0;
        int maxNumberValue=array[0];
        for(int i=1; i<array.length; i++)
        {
            if(maxNumberValue<array[i])
            {
                maxNumberValue=array[i];
                firstMaxNumberIndex=i;
            }
        }
        return firstMaxNumberIndex;
    }

    int[] getIntegerArrayAfterRemoveFirstMaxNumber(int[] initialArray, int firstMaxNumberIndex) {
        // Remove first max number from initial array
        for(int i=firstMaxNumberIndex; i<initialArray.length-1; i++)
        {
            initialArray[i]=initialArray[i+1];
        }
        // Declare new array = initial array - first max number
        int[] newArray=new int[initialArray.length-1];

        for(int i=0; i<newArray.length; i++)
        {
            newArray[i]=initialArray[i];
        }

        return newArray;
    }

    int[] getSortAscendingIntegerArray(int[] initialArray) {
        // Declare a new array have length equal initial array
        int[] ascendingArray=new int[initialArray.length];
        // Set element for new array, from end element to first element
        for(int i=ascendingArray.length-1; i>=0; i--)
        {
            // Find first max number index of initial array
            int firstMaxNumberIndex= getFirstMaxNumberIndexInIntegerArray(initialArray);
            // Assign element from initial array for new array element
            ascendingArray[i]=initialArray[firstMaxNumberIndex];
            // Reset initial array to continue
            initialArray= getIntegerArrayAfterRemoveFirstMaxNumber(initialArray,firstMaxNumberIndex);
        }
        return ascendingArray;
    }

    void exercise04() {
        System.out.println("-------------------------------------------------- ");
        System.out.println("--- Exercise 04: Sort ascending a integer array ---");

        // Enter initial array
        int[] initialArray= enterAndGetIntegerArray();
        // Show initial array
        System.out.println("- Initial Array below:");
        showIntegerArray(initialArray);
        // Sort initial array ascending
        int[] ascendingArray= getSortAscendingIntegerArray(initialArray);
        // Show array after sort ascending
        System.out.println("- Ascending Array after sort below:");
        showIntegerArray(ascendingArray);

        // Call child menu to user can continue
        showChildMenu(4);
    }

    boolean checkPrimeNumber(int number) {
        boolean isPrimeNumber=true;

        if (number<1) {
            isPrimeNumber=false;
        }else {    // Check if number is divisible a other number than 1 and itself. If yes, it is not prime number
            for (int i = number - 1; i > 1; i--) {
                if ((number % i) == 0) {
                    isPrimeNumber = false;
                    break;
                }
            }
        }
        return isPrimeNumber;
    }

    void exercise05() {
        System.out.println("-------------------------------------------------- ");
        System.out.println("--- Exercise 05: Check if input number is prime number, right ? ---");

        // Enter a integer number
        int number=enterAndGetIntegerNumber("a integer number", Integer.MIN_VALUE, Integer.MAX_VALUE);
        // Call method to check prime number
        boolean isPrimeNumber=checkPrimeNumber(number);
        // Show result check prime number
        if(isPrimeNumber)
            System.out.println("==> "+number+" is prime number.");
        else
            System.out.println("==> "+number+" is NOT prime number.");

        // Call child menu to user can continue
        showChildMenu(5);
    }

    void exercise06() {
        System.out.println("-------------------------------------------------- ");
        System.out.println("--- Exercise 06: Show all prime number <= input number ---");

        // Enter a integer number
        int number=enterAndGetIntegerNumber("a integer number", Integer.MIN_VALUE, Integer.MAX_VALUE);
        // Get rid of the case of negative integer and zero
        if(number<1){
            System.out.println("==> "+number+" is NOT prime number and is NOT any prime number smaller than it!");
        } else {
            // Count prime number total <= enter number
            int primeNumberTotal=0;
            for(int i=number; i>=1; i--){
                boolean isPrimeNumber=checkPrimeNumber(i);
                if(isPrimeNumber){
                    primeNumberTotal++;
                }
            }

            // Save all prime number <= enter number
            int[] primeArray=new int[primeNumberTotal];
            int elementIndex=primeNumberTotal-1;
            for(int i=number; i>=1; i--){
                boolean isPrimeNumber=checkPrimeNumber(i);
                if(isPrimeNumber){
                    primeArray[elementIndex]=i;
                    elementIndex--;
                }
            }

            // Show list prime number
            System.out.println("==> All prime number <= "+number+" are below:");
            showIntegerArray(primeArray);
        }

        // Call child menu to user can continue
        showChildMenu(6);
    }

}
