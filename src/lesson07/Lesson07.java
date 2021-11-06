package lesson07;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by ngochongdo on 10/22/2021
 */
public class Lesson07 {
    public static void main(String[] args) {
        new Lesson07().showMainMenu();

    }

    int enterAndGetIntegerNumber(String meaningOfNumber, int minValue, int maxValue) {
        System.out.print("Please enter " + meaningOfNumber + ": ");
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
        System.out.println("------- K2 Lesson 07 Exercises Menu -------");
        System.out.println("--- Exercise 01: Animal Racing by Abstraction. Please enter 1. --- ");
        System.out.println("--- Exercise 02: Book. Please enter 2. --- ");
        System.out.println("--- To Exit: Please enter 3. --- ");

        // Enter number to choose exercise to run
        int mainMenuNumberChoice = enterAndGetIntegerNumber("a integer number", 1, 3);

        switch (mainMenuNumberChoice) {
            case 1:
                exercise01();
                break;
            case 2:
                exercise02();
                break;
            case 3:
                System.exit(0);
                break;
        }
    }

    void showChildMenu(int currentExerciseNumber) {
        System.out.println("--- Do you want to continue Lesson 07 ? ---");
        System.out.println("--- Enter 1 to continue current exercise. ");
        System.out.println("--- Enter 2 to go back lesson 07 Main Menu. ");
        System.out.println("--- Enter 3 to exit. ");

        // Enter number choose function in child menu
        int childMenuNumberChoice = enterAndGetIntegerNumber("a integer number", 1, 3);

        switch (childMenuNumberChoice) {
            case 1: {
                switch (currentExerciseNumber) {
                    case 1:
                        exercise01();
                        break;
                    case 2:
                        exercise02();
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

    void exercise01() {
        System.out.println("-------------------------------------------------- ");
        System.out.println("--- Exercise 01: Animal Racing by Abstraction ---");

        List<Animal> animalList=new ArrayList<>();
         Animal horse=new Horse(); animalList.add(horse);
         Animal tiger=new Tiger(); animalList.add(tiger);
         Animal dog=new Dog(); animalList.add(dog);
         Animal eagle=new Eagle(); animalList.add(eagle);
         Animal falcon=new Falcon(); animalList.add(falcon);

        // Find max speed value
        int maxSpeedValue = -1;

        for (int i = 0; i < animalList.size(); i++) {
            if(!animalList.get(i).isFlyAble()) {
                if (maxSpeedValue < animalList.get(i).getSpeed()) {
                    maxSpeedValue = animalList.get(i).getSpeed();
                }
            }
        }

        // Find all index of animal has a same max speed
        List<Integer> animalWinIndexList = new ArrayList<>();

        for (int i = 0; i < animalList.size(); i++) {
            if (maxSpeedValue == animalList.get(i).getSpeed() && !animalList.get(i).isFlyAble()) {
                animalWinIndexList.add(animalList.indexOf(animalList.get(i)));
                int index=animalList.indexOf(animalList.get(i));
            }
        }

        // Show all result
        System.out.println("--------- Out put Exercise01 below ---------");

        // Show all animals and speeds corresponding
        System.out.println("==> Show all animals and speeds corresponding");
        for (int i = 0; i < animalList.size(); i++) {
            System.out.print("- " + animalList.get(i).getName() + ": ");
            System.out.print(animalList.get(i).getSpeed() + " km/h ");
            System.out.print("and flyAble is "+animalList.get(i).isFlyAble());
            System.out.println();
        }

        // Show win animal
        for (Integer i: animalWinIndexList) {
            System.out.println("==> Winner is "+animalList.get(i).getName()+" , with speed: "+animalList.get(i).getSpeed()+" km/h and flyAble is "+animalList.get(i).isFlyAble());
        }

        // Call child menu to user can continue
        showChildMenu(1);

    }



    String enterAndGetString(String stringMean) {
        System.out.print("Please input " + stringMean + ":");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        return s;
    }

    List<Book> addAndGetBookList() {
        List<Book> bookList = new ArrayList<>();
        int bookTotal = enterAndGetIntegerNumber("total of books", 1, Integer.MAX_VALUE);
        for (int i = 0; i < bookTotal; i++) {
            // Input ISBN of book
            String ISBN = enterAndGetString("ISBN of book");
            // Input title of book
            String title = enterAndGetString("title of book");
            // Input author of book
            String author = enterAndGetString("author of book");

            Book book = new Book(ISBN, title, author);
            bookList.add(book);
        }
        return bookList;
    }

    void showBookList(List<Book> bookList) {
        if(bookList.size()<=0){
            System.out.println("==> System haven't book yet. Please enter book first!");
        }else{
            System.out.println("==> Book list will display by format: Book number: ISBN || Title || Author ");
            for(int i=0; i<bookList.size(); i++) {
                int j=i+1;
                System.out.println("Book "+j+": "+bookList.get(i).getISBN()+" || "+bookList.get(i).getTitle()+" || "+bookList.get(i).getAuthor());
            }
        }

    }

    List<Book> showExercise02MainMenu(List<Book> initialBookList) {
        System.out.println("--- 1. To Add Book. Please enter 1. --- ");
        System.out.println("--- 2. To Retrieve Book Info. Please enter 2. --- ");
        System.out.println("--- 3. To Exit. Please enter 3. --- ");

        // Enter number to choose exercise to run
        int mainMenuNumberChoice = enterAndGetIntegerNumber("a integer number", 1, 3);

        switch (mainMenuNumberChoice) {
            case 1:
                List<Book> newBookList = new ArrayList<>();
                newBookList = addAndGetBookList();
                for (int i = 0; i < newBookList.size(); i++) {
                    initialBookList.add(newBookList.get(i));
                }
                showExercise02ChildMenu(initialBookList);
                break;
            case 2:
                showBookList(initialBookList);
                showExercise02ChildMenu(initialBookList);
                break;
            case 3:
                System.exit(0);
                break;
        }

        return initialBookList;
    }

    void showExercise02ChildMenu(List<Book> initialBookList) {
        System.out.println("--- Do you want to continue Exercise 02 ? ---");
        System.out.println("--- Enter 1 to continue current exercise 02 ");
        System.out.println("--- Enter 2 to go back Lesson07 Main Menu. ");
        System.out.println("--- Enter 3 to exit. ");

        // Enter number to choose exercise to run
        int exercise02ChildMenuChoice = enterAndGetIntegerNumber("a integer number", 1, 3);

        switch (exercise02ChildMenuChoice) {
            case 1:
                showExercise02MainMenu(initialBookList);
                break;
            case 2:
                showMainMenu();
                break;
            case 3:
                System.exit(0);
                break;

        }
    }

    void exercise02() {
        System.out.println("-------------------------------------------------- ");
        System.out.println("--- Exercise 02: Book  ---");

        List<Book> currentInstantBookList = new ArrayList<>();

        // Show Exercise 02 menu
        showExercise02MainMenu(currentInstantBookList);

    }
}


