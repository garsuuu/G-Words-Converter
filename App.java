
/*

    Author: Gary Daniel I. Erno
    Email: ernogarydaniel@gmail.com
    Linkedin: https://www.linkedin.com/in/gary-daniel-erno-4b317a1bb/
    Github: https://github.com/garsuuu

*/

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        String outputLine = " ";

        System.out.print("Welcome to G words converter!\nEnter the string you want to convert: ");
        Scanner sc = new Scanner(System.in);
        String inputLine = sc.nextLine();

        for (int i = 0; i < inputLine.length(); i++) {

            if ((inputLine.toLowerCase().charAt(i) == 'a') || (inputLine.toLowerCase().charAt(i) == 'e')
                    || (inputLine.toLowerCase().charAt(i) == 'i') || (inputLine.toLowerCase().charAt(i) == 'o')
                    || (inputLine.toLowerCase().charAt(i) == 'u')) {
                outputLine += inputLine.charAt(i) + "g" + inputLine.charAt(i);
            } else if (inputLine.charAt(i) == 'g') {
                outputLine += inputLine.charAt(i) + "d";
            } else {
                outputLine += inputLine.charAt(i);
            }
        }

        System.out.print("Your converted message is: " + outputLine.toLowerCase());

    }
}
