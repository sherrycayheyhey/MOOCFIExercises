import java.util.Scanner;

public class MoocfiExercises {
    public static void main(String[] args) {

        /*
         * PART 1
         */

        //****************PRINTING****************

        //****01-02. Ada Lovelace****
        System.out.println("Ada Lovelace");


        //****01-03. Once Upon a Time****
        System.out.println("Once upon a time");
        System.out.println("there was");
        System.out.println("a program");


        //****01-04. Dinosaur****
        System.out.println("Once upon a time");
        System.out.println("there was");
        System.out.println("a dinosaur");

        //****************READING INPUT****************

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
        System.out.println("Perhaps " + characterName + " will not be " + job + " forever.");



    }
}


