public class lab3 {
    public static void main(String[] args){ 
        double x = 33.0;
        int a = 20;

        // Первый столбец уравнений
        // Пример №1
        double summ = 0;
        for (int n = 1; n <= a; n++) {
            double term = Math.pow(-1, n) * Math.pow(x, 2 * n + 1) / (2 * n + 1);
            summ += term;
        }
        System.out.println("Результатом первой задачи равняется: = " + summ);

        // Пример №2
        double summ2 = 0;
        for (int n = 0; n <= a; n++) {
            double term = Math.pow(x, 2 * n + 1) / (2 * n + 1);
            summ2 += term;
        }
        System.out.println("Результатом второй задачи равняется: = " + summ2);

        // Пример №3
        double summ3 = 0;
        for (int n = 0; n <= a; n++) {
            double term = Math.pow(x, 4 * n + 1) / (4.0 * n + 1);
            summ3 += term;
        }
        System.out.println("Результом третьей задачи равняется: = " + summ3);

        // Второй столбец уравнений
        // Пример № 14
        double x14 = 3.4;
        double sum14 = 0;
        for (int n = 0; n < 10; n++) {
            double slagaemoe = Math.pow(-1, n) * Math.pow(x14, 2 * n + 1) * (1 + x14 * x14) / (2 * n + 1);
            sum14 += slagaemoe;
        }
        System.out.println("Результатом четырнадцатой задачи является: " + sum14);

        // Пример №15
        double x15 = 1.2;
        double sum15 = 0;
        for (int n = 1; n <= 10; n++) {
            double slagaemoe = Math.pow(-1, n - 1) * Math.pow(x15, n) * (1 + x15) / n;
            sum15 += slagaemoe;
        }
        System.out.println("Результатом пятнцадцатой задачи является: " + sum15);

        // Пример №16
        double x16 = 2.2;
        double sum16 = x16;
        for (int n = 1; n <= 10; n++) {
            double slagaemoe = Math.pow(-1, n + 1) * Math.pow(x16, 2 * n + 1) / (4 * n * n - 1);
            sum16 += 2 * slagaemoe;
        }
        System.out.println("Результатом шестнадцатой задачи является: " + sum16);
    }
}
