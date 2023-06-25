import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

public class main {
    
    public static void main(String[] args) {

        List<Integer> intList = new ArrayList<>();

        IntStream.rangeClosed(0, 100).forEach(i -> intList.add(i, new Random().nextInt(1000)));
        //System.out.println(intList);

        List<Integer> oddIntList = intList;
        oddIntList.removeIf(i -> i % 2 == 0); //удалить четные числа
        System.out.println(oddIntList); 

        System.out.println("Максимальное число: "+intList.stream().mapToInt(Integer::intValue).max().orElse(0));

        System.out.println("Минимальное число: "+intList.stream().mapToInt(Integer::intValue).min().orElse(0));

        System.out.println("Среднее значение: "+intList.stream().mapToInt(Integer::intValue).average().orElse(0));

    }
}
