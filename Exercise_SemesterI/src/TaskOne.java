import java.math.BigDecimal;
import java.math.MathContext;
import java.util.Scanner;

public class TaskOne {
    public void exerciseOne(){
        Scanner input = new Scanner(System.in);
        System.out.println("Choose number 1 or 2 for conversion: ");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.print("Choose: ");
        int choice = input.nextInt();

        float inputTemperature, convertedTemperature;
        switch (choice){
            case 1:
                System.out.print("Enter temperature in Celsius: ");
                inputTemperature = input.nextFloat();
                convertedTemperature = (inputTemperature * 9.0f / 5.0f) + 32.0f;
                System.out.println("Temperature in Fahrenheit: " + convertedTemperature);
                break;
            case 2:
                System.out.print("Enter temperature in Fahrenheit: ");
                inputTemperature = input.nextFloat();
                convertedTemperature = (inputTemperature - 32.0f) * 5.0f / 9.0f;
                System.out.println("Temperature in Celsius: " + convertedTemperature);
                break;
            default:
                System.out.println("Invalid choice.");

        }
        input.close();
    }
    public void exerciseTwo(){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the your score in order to get your grade!!!!");
        System.out.print("Input your score: ");
        int score = input.nextInt();
        char grade;

        if (score >= 90 && score <= 100) {
            grade = 'A';
        } else if (score >= 80 && score < 90) {
            grade = 'B';
        } else if (score >= 70 && score < 80) {
            grade = 'C';
        } else if (score >= 60 && score < 70) {
            grade = 'D';
        } else if (score >= 50 && score < 60) {
            grade = 'E';
        } else if (score < 50) {
            grade = 'F';
        } else {
            grade = 'I';
        }

        if(grade=='I'){
            System.out.println("Score should be ranged from 0 to 100");
        }else{
            System.out.println("Letter grade: " + grade);
        }
        input.close();
    }
    public void exerciseThree(){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an number: ");
        int number = input.nextInt();

        if (number % 2 == 0) {
            System.out.println(number + " is an even number.");
        } else {
            System.out.println(number + " is an odd number.");
        }

        input.close();
    }
    public void exerciseFour(){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        BigDecimal num1 = input.nextBigDecimal();

        System.out.print("Enter second number: ");
        BigDecimal num2 = input.nextBigDecimal();

        System.out.print("Enter operator: ");
        String operator = input.next();

        BigDecimal result;
        switch (operator) {
            case "+":
                result = num1.add(num2);
                break;
            case "-":
                result = num1.subtract(num2);
                break;
            case "*":
                result = num1.multiply(num2);
                break;
            case "/":
                if (num2.compareTo(BigDecimal.ZERO) == 0) {
                    System.out.println("Cannot divide by zero.");
                    result=new BigDecimal("0");
                    break;
                }
                else
                {
                    result = num1.divide(num2, MathContext.DECIMAL64);
                    break;
                }

            default:
                System.out.println("Invalid operator.");
                result=new BigDecimal("0");
        }
        if(result.compareTo(BigDecimal.ZERO)!=0){
            System.out.println("Result: " + result);
        }

        input.close();
    }

}