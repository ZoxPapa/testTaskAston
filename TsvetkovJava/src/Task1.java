import java.util.Scanner;

/**
 Написать программу, которая принимает на вход два целых числа (a и b)
 и совершает с ними следующие действия:
 - сравнивает эти два числа и возвращает результат сравнения
 путем вывода в консоль одного из вариантов: "a > b", "a < b" или "a = b";
 - совершает с этими числами операции сложения, вычитания,
 деления и умножения и результат выводит в консоль.
 **/
public class Task1 {
    int firstNumber;
    int secondNumber;

    private void inputNumbers(){
        System.out.println("Эта программа может сравнивать целые числа, " +
                "а также совершать с ними арифметические действия");
        boolean flag = true;
        Scanner sc = new Scanner(System.in);
        while(flag){
            try {
                System.out.println("Пожалуйста введите первое целое число: ");
                int firstNumber = sc.nextInt();
                System.out.println("Пожалуйста введите второе целое число: ");
                int secondNumber = sc.nextInt();
                flag = false;
                this.firstNumber = firstNumber;
                this.secondNumber = secondNumber;
            }catch (RuntimeException e){
                System.out.println("Ошибка при вводе данных, попробуйте ввести оба числа снова");
                sc.next();
            }
        }
        System.out.printf("Ваши числа: %s и %s\n", firstNumber, secondNumber);
    }
    public void start(){
        inputNumbers();
        System.out.println(compareTwoInts());
        System.out.println(sumOfNumbers());
        System.out.println(subOfNumber());
        System.out.println(divOfNumbers());
        System.out.println(multOfNumbers());
    }
    private String compareTwoInts(){
    if(firstNumber>secondNumber) return (firstNumber+" > "+secondNumber);
    else if (firstNumber<secondNumber) return (firstNumber+" < "+secondNumber);
    else return (firstNumber+" = "+ secondNumber);
    }
    private String sumOfNumbers(){
        return firstNumber+" + "+ secondNumber + " = " + (firstNumber+secondNumber);
    }
    private String subOfNumber(){
        return firstNumber+" - "+ secondNumber + " = " + (firstNumber-secondNumber);
    }
    private String divOfNumbers(){
        String result;
        double a = firstNumber;
        double b = secondNumber;
        if (secondNumber==0) result = "Error";
        else{
            double resultNumber = (double) Math.round((a / b) * 100) /100;
            result = String.valueOf(resultNumber);
        }
        return firstNumber+" / "+ secondNumber + " = " + result;
    }

    private String multOfNumbers(){
        return firstNumber+" * "+ secondNumber + " = " + (firstNumber*secondNumber);
    }
}
