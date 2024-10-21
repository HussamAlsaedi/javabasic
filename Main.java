import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        String  full_name = "Hussam" ;
//        System.out.println(full_name.length()); // length of word
//        System.out.println(full_name.toUpperCase()); // H
//        System.out.println(full_name.toLowerCase()); // h
//        System.out.println(full_name.trim()); // trim
//        System.out.println(full_name.equals("hussam")); // equals
//        System.out.println(full_name.replace("H","m")); // replace
//
//        String text = "apple,banana,orange";
//        String[] fruits = text.split(",");  // النتيجة: ["apple", "banana", "orange"]
//// dataType  varName=value;
        /*
        *  x =  */
//        int age =  28;
//        double GPA = 4.26;
//        byte $age = 127;
//        String full_Nmae= "Hussam";
//
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter Your Full Name: ");
//        full_Nmae = input.nextLine();
//        System.out.println("Your Full Name is: "+full_Nmae);
//        System.out.println("Enter Your Age: ");
//        age = input.nextInt();
//        System.out.println("Your Age is: "+age);
//
//        //

        ;
        Scanner input = new Scanner(System.in);

        System.out.printf("Enter First number: ");
        int firstNumber = input.nextInt();
        System.out.printf("Enter second number: ");
        int secondNumber = input.nextInt();

        System.out.println(" total operation  is : "+(firstNumber  + secondNumber));
        System.out.println(" total operation  is : "+(firstNumber  - secondNumber));
        System.out.println(" total operation  is : "+(firstNumber  / secondNumber));
        System.out.println(" total operation  is : "+(firstNumber  % secondNumber));
        System.out.println(" total operation  is : "+(firstNumber  * secondNumber));

        System.out.println("this number is same \t  "+(firstNumber == secondNumber  || firstNumber <= secondNumber));





    }
}