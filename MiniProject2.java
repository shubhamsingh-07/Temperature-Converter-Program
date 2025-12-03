import java.util.Scanner;
public class MiniProject2 {
    public static void main(String[] args){

        //WEIGHT CONVERSION PROGRAM

        Scanner scanner = new Scanner(System.in);
        double weight;
        double newWeight;
        int choice;


        System.out.print("Weight Conversion Program");
        System.out.print("\n1 : Convert lbs to kgs");
        System.out.print("\n2 : Convert kgs to lbs");
        System.out.print("\nChoose an Option: ");
        choice = scanner.nextInt();

        if(choice == 1){
            System.out.print("What is your weight (in lbs): ");
            weight = scanner.nextDouble();
            newWeight = weight/2.20462;
            System.out.printf("Your weight (in kgs): %.2f" , newWeight);
        }
        else if (choice == 2){
            System.out.print("What is your weight (in kgs): ");
            weight = scanner.nextDouble();
            newWeight = weight * 2.20462;
            System.out.printf("Your weight (in lbs): %.2f" , newWeight);
        }
        else{
            System.out.print("Entered a Invalid Choice");
        }

        scanner.close();
    }
}
