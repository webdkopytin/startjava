public class Cycle {
    public static void main(String[] args) {
        for (byte i = 0; i <= 20; i++) {
            System.out.println(i + " ");
        }

        int result = 6;
        while (result >= -6) {
            System.out.println(result + " ");
            result = result - 2;
        }

        int sumResult = 0;
        int oddNumbers = 10;
        do {
            if (oddNumbers % 2 == 1) {
                sumResult += oddNumbers;
            }
            oddNumbers++;
        } while (oddNumbers <= 20);
        System.out.println("Сумма нечетных чисел от [10, 20] = " + sumResult);
    }
}