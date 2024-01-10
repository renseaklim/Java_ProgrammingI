import java.util.Scanner;

public class TaskFour {
    public void Manipulate_String() {
        Scanner input = new Scanner(System.in);
        System.out.println("input your sentence:");
        String ch;
        ch = input.nextLine();
        System.out.println(" 1. Count the number of characters in the sentence.\n" +
                "2. Count the number of words in the sentence.\n" +
                "3. Convert the sentence to uppercase.\n" +
                "4. Convert the sentence to lowercase.\n" +
                "5. Exit.\n");
        char a;
        do {
            System.out.print("Enter your choice:");
            a = input.next().charAt(0);
            switch (a) {
                case '1':
                    System.out.println("Count the number of characters in the sentence.");
                    int length = ch.length();
                    System.out.println("There are " + length + " characters in your sentence.");
                    break;
                case '2':
                    System.out.println("Count the number of words in the sentence.");
                    String[] st = ch.split(" ");
                    byte j = 0;
                    for (String i : st) {
                        j += 1;
                    }
                    System.out.println("There are " + j + " words int your sentence.");
                    break;
                case '3':
                    System.out.println("Covert the sentence to uppercase.");
                    System.out.println(ch.toUpperCase());
                    break;
                case '4':
                    System.out.println("Convert sentence to lowercase.");
                    System.out.println(ch.toLowerCase());
                    break;
                case 'e':
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (a != 'e');
    }
   //Inventory System
    public void inventory_system(){
        Scanner input = new Scanner(System.in);
        System.out.println("View available products and their quantities.\n" +
                "Add a new product to the inventory with a specified quantity.\n" +
                "Update the quantity of an existing product in the inventory.\n" +
                "Remove a product from the inventory.\n" +
                "Exit");
        char a;
        do {
            System.out.print("Enter your choice:");
            a = input.next().charAt(0);
            switch (a) {
                case '1':
                    break;
                case '2':
                    break;
                case '3':
                    break;
                case '4':
                    break;
                case 'e':
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (a != 'e');

    }
}
