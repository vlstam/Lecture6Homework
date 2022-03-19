/**
 * Нека имате ученици със следните оценки: Иванчо - 2, Ани – 5,
 * Марийка - 6, Пенчо - 4, Бориславчо - 5. Използвайте printf да
 * отпечатате оценките им в табличен вид, всеки ученик - на отделен
 * ред.
 */
package mypack;

public class Lecture6Homework3 {
    public static void main(String[] args) {
        String nameIv = "Ivancho";
        String nameAn = "Ani";
        String namePen = "Pencho";
        String nameMar = "Mariyka";
        String nameBor = "Borislavcho";
        int gradeIv = 2;
        int gradeAn = 5;
        int gradeMar = 6;
        int gradePen = 4;
        int gradeBor = 5;
        System.out.printf("|%-11s|%4d|%n", nameIv, gradeIv);
        System.out.printf("|%-11s|%4d|%n", nameAn, gradeAn);
        System.out.printf("|%-11s|%4d|%n", nameMar, gradeMar);
        System.out.printf("|%-11s|%4d|%n", namePen, gradePen);
        System.out.printf("|%s|%4d|%n", nameBor, gradeBor);

    }
}
