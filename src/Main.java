import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //PSEUDO CODE
        //Create Scanner
        //int age
        //String trash
        //Output "Enter your age: "
        //Input age
        //if input is an int
        //  if age >= 21
        //      Output "You get a wrist band"
        //Else
        // Output "Invalid Input"
        //CODE

        Scanner in = new Scanner(System.in);
        int age = 0;
        String trash = "";

        System.out.print("Enter your age: ");

        if(in.hasNextInt()){
            age = in.nextInt();
            in.nextLine();

            if (age >= 21) {
                System.out.println("You get a wrist band.");
            }
        }
        else{
            trash = in.nextLine();
            System.out.println("Invalid input: " + trash);
            System.out.println("Enter your age");
        }

    }
}