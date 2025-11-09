import java.util.*;

public class lab4 {
    public static void main(String[] args){
        int[] FirstMassive = new int[4], SecondMassive = new int[4], ThirdMassive = new int[4];
        
        Random random = new Random();
        for (int i = 0; i < 4; i++){
            FirstMassive[i] = random.nextInt(20);
            SecondMassive[i] = random.nextInt(20);
            ThirdMassive[i] = random.nextInt(20);
        }
        
        processArray("Первый массив", FirstMassive);
        processArray("Второй массив", SecondMassive);
        processArray("Третий массив", ThirdMassive);
    }
    
    public static void processArray(String name, int[] array) {
        System.out.println(name + ": " + Arrays.toString(array));
        
        List<int[]> pairs = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            pairs.add(new int[]{array[i], i});
        }
        
        System.out.print("Пары [значение, индекс]: ");
        for (int[] pair : pairs) {
            System.out.print(Arrays.toString(pair) + " ");
        }
        System.out.println();
        
        Collections.sort(pairs, (a, b) -> Integer.compare(a[0], b[0]));
        
        int[] sortedIndices = new int[array.length];
        for (int i = 0; i < pairs.size(); i++) {
            sortedIndices[i] = pairs.get(i)[1];
        }
        
        System.out.println("Индексы по возрастанию: " + Arrays.toString(sortedIndices));
        System.out.println();
    }
}
// если первый массив равен [1, 15, 12, 0] тогда результат будет иметь значения [3, 0, 2, 1]. То есть, программа добавляет слева направо номер ячейки самого малого числа.