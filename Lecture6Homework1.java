/**
 * Напишете програма, която чете 1 число от конзолата, изчислява му
 * корен квадратен и отпечатва резултата на екрана, с точност до 5-тия
 * знак след запетаята.
 */
package mypack;

import java.util.Scanner;

public class Lecture6Homework1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        double num;
        num = scanner.nextDouble();
        double result = Math.sqrt(num);
        System.out.printf("The square root of %f is %.5f",num, result);

    }
}
