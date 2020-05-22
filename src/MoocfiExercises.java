public class MoocfiExercises {
    public static void main(String[] args) {

        /*
         * PART 1
         */

        /*//****************PRINTING****************

        //****01-02. Ada Lovelace****
        System.out.println("Ada Lovelace");


        //****01-03. Once Upon a Time****
        System.out.println("Once upon a time");
        System.out.println("there was");
        System.out.println("a program");


        //****01-04. Dinosaur****
        System.out.println("Once upon a time");
        System.out.println("there was");
        System.out.println("a dinosaur");*/


        /*//****************READING INPUT****************

        //****01-05 Message****
        //create the scanner for user input and prompt the user
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write a message:");

        //store the message in a string and then print it
        String message = scanner.nextLine();
        System.out.println(message);


        //****01-06 Hi Ada Lovelace****
        String name = "Ada Lovelace";
        System.out.println("Hi " + name + "!");


        //****01-07 Message Three Times****
        //create the scanner and prompt the user
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Write a message:");

        //save the user input to a variable then print it 3 times
        String message2 = scanner2.nextLine();
        System.out.println(message2);
        System.out.println(message2);
        System.out.println(message2);


        //****01-08 Greeting****
        //create the scanner and prompt the user
        Scanner scanner3 = new Scanner(System.in);
        System.out.println("What's your name?");

        //save the user input to a variable and print the message
        String inputName = scanner3.nextLine();
        System.out.println("Hi " + inputName);


        //****01-09 Conversation****
        //create the scanner, prompt the user twice
        Scanner scanner4 = new Scanner(System.in);
        System.out.println("Greetings! How are you doing?");
        scanner4.nextLine();
        System.out.println("Oh, how interesting. Tell me more!");
        scanner4.nextLine();
        System.out.println("Thanks for sharing!");


        //****01-10 Story****
        //create a scanner, prompt the user for name and job, save to variables
        Scanner scanner5 = new Scanner(System.in);
        System.out.println("I will tell you a story, "
                + "but I need some information first. \n"
                + "What is the main character called?");
        String characterName = scanner5.nextLine();
        System.out.println("What is their job?");
        String job = scanner5.nextLine();

        //print the story
        System.out.println("Here is the story:");
        System.out.println("Once upon a time there was " + characterName + ", who was " + job + ".");
        System.out.println("On the way to work, " + characterName + " reflected on life.");
        System.out.println("Perhaps " + characterName + " will not be " + job + " forever.");*/


        /*//****************Variables****************

        //****01-11 Various Variables****
        int numberOfChicken = 9000;
        double baconWeight = 0.1;
        String tractor = "Zetor";

        System.out.println("Chicken:");
        System.out.println(numberOfChicken);
        System.out.println("Bacon (kg):");
        System.out.println(baconWeight);
        System.out.println("Tractor:");
        System.out.println(tractor);
        System.out.println();
        System.out.println("And finally, a summary:");
        System.out.println(numberOfChicken);
        System.out.println(baconWeight);
        System.out.println(tractor);


        //****01-12 Integer Input****
        //create a scanner and prompt the user
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a number: ");

        //get the user's number then print it
        //         parseInt -vs- valueOf
        //I originally used Integer.valueOf but this IDE suggested parseInt instead
        //parseInt: only takes a string as a parameter, valueOf: String or integer
        //parseInt: returns a primitive int value, valueOf: returns an Integer object
        //parseInt: error when character passed, valueOf: returns unicode when character passed
        //parseInt: worse performance because parsing a string takes more time than generating one, valueOf: better time and space performance because of caching
        //parseInt: use when primitive datatype is needed, valueOf: use if wrapper object is needed

        int userNumber = Integer.parseInt(scanner.nextLine());
        System.out.println("You gave the number " + userNumber);


        //****01-13 Double Input****
        //create the scanner and prompt the user
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Give a number:");

        //get the user's input then print the result
        double userDouble = Double.parseDouble(scanner2.nextLine());
        System.out.println("You gave the number " + userDouble);


        //****01-14 Boolean Input****
        //create a scanner and prompt the user
        Scanner scanner3 = new Scanner(System.in);
        System.out.println("Write something: ");

        //get the user's input and print the result
        boolean userBool = Boolean.parseBoolean(scanner3.nextLine());
        System.out.println("True or false? " + userBool);


        //****01-15 Different Types Of Input****
        //create a scanner, repeatedly prompt the user, save the answers
        Scanner scanner4 = new Scanner(System.in);
        System.out.println("Give a string:");
        String userString = scanner4.nextLine();
        System.out.println("Give an integer:");
        int userInt = Integer.parseInt(scanner4.nextLine());
        System.out.println("Give a double:");
        double userDouble2 = Double.parseDouble(scanner4.nextLine());
        System.out.println("Give a boolean:");
        boolean userBool2 = Boolean.parseBoolean(scanner4.nextLine());

        //print it all out
        System.out.println("You gave the string " + userString);
        System.out.println("You gave the integer " + userInt);
        System.out.println("You gave the double " + userDouble2);
        System.out.println("You gave the boolean " + userBool2);*/


        /*//****************Variables****************

        //****01-16 Seconds in a Day****
        //create the scanner and prompt the user
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many days would you like to convert to seconds?");

        //calculate the seconds and print
        int days = Integer.parseInt(scanner.nextLine());
        System.out.println(days * 86400);


        //****01-17 Sum of Two Numbers****
        //create the scanner, prompt the user for two numbers
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Give the first number:");
        int first = Integer.parseInt(scanner2.nextLine());
        System.out.println("Give the second number:");
        int second = Integer.parseInt(scanner2.nextLine());

        // add the numbers and print the result
        System.out.println("The sum of the numbers is " + (first + second));


        //****01-18 Sum of Three Numbers****
        //create the scanner and prompt the user for 3 numbers
        Scanner scanner3 = new Scanner(System.in);
        System.out.println("Give the first number:");
        int first2 = Integer.parseInt(scanner3.nextLine());
        System.out.println("Give the second number:");
        int second2 = Integer.parseInt(scanner3.nextLine());
        System.out.println("Give the third number:");
        int third = Integer.parseInt(scanner3.nextLine());

        //add the numbers and print the result
        System.out.println("The sum of the numbers is " + (first2 + second2 + third));


        //****01-19 Addition Formula****
        //create the scanner and promp the user for 2 numbers
        Scanner scanner4 = new Scanner(System.in);
        System.out.println("Give the first number:");
        int firstNum = Integer.parseInt(scanner4.nextLine());
        System.out.println("Give the second number:");
        int secondNum = Integer.parseInt(scanner4.nextLine());

        //do the math and print out the equation with answer
        System.out.println(firstNum + " + " + secondNum + " = " + (firstNum + secondNum));


        //****01-20 Multiplication Formula****
        //create the scanner and prompt the user for 2 numbers
        Scanner scanner5 = new Scanner(System.in);
        System.out.println("Give the first number:");
        int firstNum2 = Integer.parseInt(scanner5.nextLine());
        System.out.println("Give the second number:");
        int secondNum2 = Integer.parseInt(scanner5.nextLine());

        //print the equation with the answer
        System.out.println(firstNum2 + " * " + secondNum2 + " = " + (firstNum2 * secondNum2));


        //****01-21 Average of Two Numbers****
        //this program should also check that 0 division never happens
        //create the scanner and prompt the user for 2 numbers
        Scanner scanner6 = new Scanner(System.in);
        System.out.println("Give the first number:");
        int firstNum3 = Integer.parseInt(scanner6.nextLine());
        System.out.println("Give the second number:");
        int secondNum3 = Integer.parseInt(scanner6.nextLine());

        //add the numbers and cast them to double so info isn't loss, do the math, print the result
        double result = (double) firstNum3 + secondNum3;
        System.out.println("The average is " + (result / 2));


        //****01-22 Average of Three Numbers****
        //create the scanner and prompt the user for 3 numbers
        Scanner scanner7 = new Scanner(System.in);
        System.out.println("Give the first number:");
        int firstNum4 = Integer.parseInt(scanner7.nextLine());
        System.out.println("Give the second number:");
        int secondNum4 = Integer.parseInt(scanner7.nextLine());
        System.out.println("Give the third number:");
        int thirdNum4 = Integer.parseInt(scanner7.nextLine());

        //cast the result to a double, do the math, print the result
        double result2 = (double) firstNum4 + secondNum4 + thirdNum4;
        System.out.println("The average is " + (result2 / 3));


        //****01-23 Simple Calculator****
        //create the scanner, prompt the user for 2 numbers
        Scanner scanner8 = new Scanner(System.in);
        System.out.println("Give the first number:");
        int firstNum5 = Integer.parseInt(scanner8.nextLine());
        System.out.println("Give the second number:");
        int secondNum5 = Integer.parseInt(scanner8.nextLine());

        //do the math and print
        System.out.println(firstNum5 + " + " + secondNum5 + " = " + (firstNum5 + secondNum5));
        System.out.println(firstNum5 + " - " + secondNum5 + " = " + (firstNum5 - secondNum5));
        System.out.println(firstNum5 + " * " + secondNum5 + " = " + (firstNum5 * secondNum5));
        //firstNum5 multiplied by 1.0 so it's cast to a double so the result isn't truncated
        System.out.println(firstNum5 + " / " + secondNum5 + " = " + (1.0 * firstNum5 / secondNum5));*/


        //****************Conditional Statements and Conditional Operation****************
        //****01-24 Speeding Ticket****
        
    }
}


