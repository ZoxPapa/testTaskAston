import java.util.ArrayList;
import java.util.List;

/**
 * Задан массив целых чисел: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10].
 * Необходимо написать программу, которая выведет в консоль все чётные числа.
 */
public class Task3 {
    private final int [] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    public void start(){
        System.out.println(findEvenNumbers(array));
    }

    private List<Integer> findEvenNumbers(int[]array) {
        List<Integer> result = new ArrayList<>();
        for (int i: array) {
           if(i%2==0) result.add(i);
        }
        return result;
    }
}
