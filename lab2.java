public class lab2 {
    public static void main(String[] args){
        double x = 2.0;
        double b = 1.0;
        double a = 0.5;

        // Первая часть уравнений:

        double task1; // Пример №1
        if (x <= 3){
            task1 = b + 2 * Math.log(Math.abs(-x));
        }
        else {
            task1 = (x * x) / (x * x + a);
        }
        System.out.printf("Первая задача: " + "Для x = " + x + " , y = " + task1);
        
        double task2; // Пример №2
        if (x > 0){
            task2 = ((a+ 1) /2) * Math.exp(x);
        }
        else{
            task2 = Math.cos(b * x + 1);
        }
        System.out.printf("; Вторая задача: " + "Для x = " + x + ", y = " + task2);

        double task4; // Пример №4
        if (x <= -1){
            task4 = (a + x * x) / (b + Math.log(Math.abs(x) + 1));
        } else {
            task4 = Math.exp(x) + Math.log(Math.abs(x));
        }
        System.out.printf("; Четвёртая задача: " + "Для x = " + x + ", y = " + task4);

        // Вторая часть уровнений:

        double task10; // Пример №10
        if (x <= 0){
            task10 = Math.sqrt(Math.exp(x - b) - 1);
        }
        else {
            task10 = 1 / (x * x * a);
        }
        System.out.printf("; Десятая задача: " + "Для x = " + x + ", y = " + task10);

        double task11; //  Пример №11
        if (x > 4){
            task11 = Math.sqrt(a + Math.sin(x));
        }
        else{
            task11 = Math.tan(b * x);
        }
        System.out.printf("; Одиннадцатая задача: " + "Для x = " + x + ", y = " + task11);

        double task14;
        if (x <= -1){
            task14 = 0.2 * x * x + (b * x + Math.log(Math.abs(x+3)));
        }
        else{
            task14 = b * x * x + Math.log(x + 3);
        }
        System.out.printf("; Четырнадцатая задача: " + "Для x = " + x + ", y = " + task14);
    }
}
