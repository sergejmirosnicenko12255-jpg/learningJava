import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
public class lab5 {
    public static void main(String[] args) {
        String[] productNames = {"Bread", "Milk", "Sausage", "Chocolate"};
        String[] manufacturers = {"Bakery Factory LLC", "Milk factory", "Meat processing factory", "Chocolate factory"};
        int[] quantities = {50, 30, 25, 70};
        double[] prices = {45.99, 109.99, 279.99, 89.99};
        
        System.out.println("\n\n\nИнформация о товарах:");
        for (int i = 0; i < productNames.length; i++) {
            System.out.printf("%s , %s , %d шт. , %.2f руб.\n", 
                productNames[i], manufacturers[i], quantities[i], prices[i]);
        }
        
        // часть кода отвечающая за поиск товара с самым большим его количеством
        int maxKolvo = 0;
        int maxQuanity = quantities[0];
        for (int i = 1; i < quantities.length; i++){ // i = 1 потому как сравнивать приходится как минимум 2 элемента
           if (quantities[i] > maxQuanity) { // сравинивает нулевой элемент с первым по списку
                maxQuanity = quantities[i];
                maxKolvo = i;
            }
        }
        System.out.println("\nТовар с максимальным количеством:");
        System.out.printf("%s , %s , %d шт. , %.2f руб.%n", 
            productNames[maxKolvo], manufacturers[maxKolvo], quantities[maxKolvo], prices[maxKolvo]); 
        
        // часть кода расчитывающая среднюю цену товаров
        int midPrice = 0;
        int quantitiesMidPrice = 0;
        for (int i = 0; i < productNames.length; i ++){
            midPrice += prices[i];
        }
        for (int i =0; i < productNames.length; i ++){
            if (prices[i]<= midPrice/productNames.length){
                quantitiesMidPrice += quantities[i];
            }
        }
        System.out.println("\nСредняя стоимость товаров составляет: "+midPrice / productNames.length+" рублей, а кол-во товаров с ценой меньше средней равняется: "+ quantitiesMidPrice+" шт.");

        // часть кода демонстрирующая список цен товаров по убыванию
         Double[] pricesWrapper = new Double[prices.length];
        for (int i = 0; i < prices.length; i++) {
            pricesWrapper[i] = prices[i];
        }
        
        // часть кода сортирующая значения по убыванию
        Arrays.sort(pricesWrapper, Collections.reverseOrder());
        System.out.print("\nЦены по убыванию: ");
        System.out.println(Arrays.toString(pricesWrapper));

        // поиск и изменение одного из полей карточки товара
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("\nВведите наименование продукта для поиска: ");
        String searchName = scanner.nextLine();
        
        int proverka = 0;
        int foundIndex = -1;
        for (int i = 0; i < productNames.length; i++) {
            if (productNames[i].equalsIgnoreCase(searchName)) {
                foundIndex = i;
                break;
            }
        }
        
        if (foundIndex == -1) {
            System.out.println("Товар с наименованием '" + searchName + "' не найден.");
            proverka += 1;
        } else {
            System.out.println("\nТовар найден:");
            System.out.printf("%s , %s , %d шт. , %.2f руб.\n", 
                productNames[foundIndex], manufacturers[foundIndex], quantities[foundIndex], prices[foundIndex]);
            
            System.out.println("\nКакое поле вы хотите изменить?");
            System.out.println("1 - Наименование");
            System.out.println("2 - Производитель");
            System.out.println("3 - Количество");
            System.out.println("4 - Цена");
            System.out.print("Выберите номер поля: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine(); 
            
            switch (choice) {
                case 1:
                    System.out.print("Введите новое наименование: ");
                    productNames[foundIndex] = scanner.nextLine();
                    break;
                case 2:
                    System.out.print("Введите нового производителя: ");
                    manufacturers[foundIndex] = scanner.nextLine();
                    break;
                case 3:
                    System.out.print("Введите новое количество: ");
                    quantities[foundIndex] = scanner.nextInt();
                    break;
                case 4:
                    System.out.print("Введите новую цену: ");
                    prices[foundIndex] = scanner.nextDouble();
                    break;
                default:
                    System.out.println("Неверный выбор. Изменения не произведены.");
            }
            
            System.out.println("\nДанные успешно обновлены!");
        }
        
        // Вывод обновленной информации о всех товарах
        if (proverka != 1){
        System.out.println("Обновленная информация о товарах:");
        for (int i = 0; i < productNames.length; i++) {
            System.out.printf("%s , %s , %d шт. , %.2f руб.\n", 
                productNames[i], manufacturers[i], quantities[i], prices[i]);
        }
    }
        
        scanner.close();
    }
}
