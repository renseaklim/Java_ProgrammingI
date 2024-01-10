import com.sun.source.tree.WhileLoopTree;

import java.util.Scanner;
import java.math.BigDecimal;
import java.util.Random;
import java.math.MathContext;

import static java.lang.System.exit;

public class TaskTwo {
    public void NumberGuessingGame(){
        Scanner input = new Scanner(System.in);
        int min = 1;
        int max = 100;
        byte attempt = 0;
        Random random = new Random();
        int RandomNumber = random.nextInt(max - min + 1) + min;
        System.out.println("-----------Number Guessing Game-----------");

        while(true){
            System.out.print("Enter the number:");
            int userInput = input.nextInt();
            if(userInput > RandomNumber) {
                System.out.println("Your guessed number is too high!");
                attempt ++;
            }
            else if (userInput < RandomNumber) {
                System.out.println("Your Guessed number id too low! ");
                attempt ++;
            }
            else {
                System.out.print("Congratulation! You guessed the right number.\n");
                attempt ++;
                System.out.println("Your had attempted " + attempt + " times");
                break;
            }
        }
    input.close();
    }
    // Exercise 2 : Vending Machine
    public void VendingMachine(){
        Scanner input = new Scanner(System.in);
        String[] menu = {
                        "--------Menu of the drink---------",
                        "1.Coke for 1.25$.",
                        "2.Pepsi for 1.50$.",
                        "3.Milk for 0.75$.",
                        "4.Water for 0.25$.",
                        "e.Exit"
                        };
        byte coke = 10;
        byte pepsi = 10;
        byte milk = 10;
        byte water = 10;
        System.out.println("Please insert money before buying:");
        float userBalance = input.nextFloat();
        System.out.println("You have " + userBalance + "$ in your balance.");
        do{
            for (String a:menu){
                System.out.println(a);
            }
            System.out.println("Input number of drink:");
            char choice = input.next().charAt(0);
            switch(choice){
                case '1':
                    if (userBalance >= 1.25 && coke > 0){
                        coke --;
                        userBalance -= 1.25;
                        System.out.println("You had obtianed Coke for 1.25$.");
                        System.out.println("Your remained balance:" + userBalance);
                        System.out.println("remained Coke:" + coke);
                        break;
                    }
                    else{
                        System.out.println("Your remained balance are insufficient!");
                        System.out.println("Your remained balance:" + userBalance);
                        break;
                    }

                case '2':
                    if (userBalance >= 1.50 && pepsi > 0){
                        pepsi --;
                        userBalance -= 1.50;
                        System.out.println("You had obtianed Pepsi for 1.50$.");
                        System.out.println("Your remained balance:" + userBalance);
                        System.out.println("remained Pepsi:" + pepsi);
                        break;
                    }
                    else{
                        System.out.println("Your remained balance are insufficient!");
                        System.out.println("Your remained balance:" + userBalance);
                        break;
                    }

                case '3':
                    if (userBalance >= 0.75 && milk > 0){
                        milk --;
                        userBalance -= 0.75;
                        System.out.println("You had obtianed Milk for 0.75$.");
                        System.out.println("Your remained balance:" + userBalance);
                        System.out.println("remained Milk:" + milk);
                        break;
                    }
                    else{
                        System.out.println("Your remained balance are insufficient!");
                        System.out.println("Your remained balance:" + userBalance);
                        break;
                    }

                case '4':
                    if (userBalance >= 0.25 && water > 0){
                        water --;
                        userBalance -= 0.25;
                        System.out.println("You had obtianed Water for 0.25.");
                        System.out.println("Your remained balance:" + userBalance);
                        System.out.println("remained Water:" + water);
                        break;
                    }
                    else{
                        System.out.println("Your remained balance are insufficient!");
                        System.out.println("Your remained balance:" + userBalance);
                        break;
                    }

                case 'e': exit(0);
                default:
                    System.out.println("Your choice is wrong! Please try again!");
            }

        }while(true);
    //    input.close();
    }
}
