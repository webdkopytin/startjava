public class MyFirstGame {
    public static void main(String[] args) {
        int hiddenNumber = 10;

        for (int i = 0; i <= 100; i++) {
            if (i < hiddenNumber) {
                System.out.println("Данное число меньше того, что загадал компьютер");
            } else if (i > hiddenNumber) {
                System.out.println("Данное число больше того, что загадал компьютер");
            } else {
                System.out.println("Поздравляю, число " + i + " угадано!");
                break;
            }
        }
    }
}