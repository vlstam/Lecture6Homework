/**
 *  Напишете програма, която прочита число от конзолата и отпечатва
 * дали то е четно или нечетно. (Подсказка: използвайте оператора ?:)
 */
package mypack;

import java.util.Scanner;

public class Lecture6Homework2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num;
        System.out.println("Please enter a number: ");
        num = scan.nextInt();
        String isOddOrEven = num%2==0 ? "even" : "odd";
        System.out.printf("Is %d even or odd?\n", num);
        System.out.println("It is " + isOddOrEven);


    }
}
