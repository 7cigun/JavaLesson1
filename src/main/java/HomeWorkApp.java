public class HomeWorkApp {
    //Главный метод
    public static void main(String[] args) {
        System.out.println("Запуск метода printThreeWords:");
        printThreeWords();

        System.out.println("Запуск метода checkSumSign:");
        checkSumSign(100, 10);
        checkSumSign(-3, 2);

        System.out.println("Запуск метода printColor:");
        printColor(-10);
        printColor(100);
        printColor(101);

        System.out.println("Запуск метода compareNumbers:");
        compareNumbers();
    }

    //Метод, печатающий 3 слова с новой строки
    static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
        System.out.println();
    }

    //Метод сложения чисел
    static void checkSumSign(int a, int b) {
        int sum;
        sum = a + b;
        System.out.println("При a = " + a + " и при b = " + b);
        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
        System.out.println("");
    }

    static void printColor(int value) {
        System.out.printf("При value = " + value + " получаем цвет: ");
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 0 && value <= 100) {
            System.out.println("Желтый");
        } else if (value > 100) {
            System.out.println("Зеленый");
        }
    }

    static void compareNumbers(){
        int a = 10;
        int b = 15;
        if (a >= b) {
            System.out.printf("a >= b");
        } else {
            System.out.printf("a < b");
        }
    }
}

