import java.util.Scanner;

/**
 *  Написать программу, которая принимает на вход две строки (a и b) и сравнивает их.
 *  В результате сравнения в консоль должно быть выведено одно из сообщений:
 *  "Строки неидентичны" или "Строки идентичны"
 */
public class Task2 {
    private String firstString;
    private String secondString;
    public void start(){
        inputStrings();
        System.out.println(compareTwoStrings());
    }

    private String compareTwoStrings() {
        return firstString.equals(secondString) ? "Строки идентичны" : "Строки неидентичны";
    }

    private void inputStrings() {
        System.out.println("Эта программа может сравнивать текст.");
        System.out.println("Пожалуйста, введите первое предложение или слово: ");
        Scanner sc = new Scanner(System.in);
        this.firstString = sc.nextLine();
        System.out.println("Пожалуйста, введите второе предложение или слово: ");
        this.secondString = sc.nextLine();
        System.out.println(firstString + " "+ secondString);
    }
}
