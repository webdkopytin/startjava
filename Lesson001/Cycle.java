public class Cycle {
    public static void main(String[] args) {
        for (byte i = 0; i <= 20; i++) {
            System.out.println(i + " ");
        }

        int counter = 6;
        while (counter >= -6) {
            System.out.println(counter + " ");
            counter -= 2;
        }

        int sumOdd = 0;
        int counterNumbers = 10;
        do {
            if (counterNumbers % 2 == 1) {
                sumOdd += counterNumbers;
            }
            counterNumbers++;
        } while (counterNumbers <= 20);
        System.out.println("Сумма нечетных чисел от [10, 20] = " + sumOdd);
    }
}