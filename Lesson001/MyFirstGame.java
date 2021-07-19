public class MyFirstGame {
    public static void main(String[] args) {
        int hiddenNumber = 15;
        int startNumber = 25;

        if (startNumber < hiddenNumber) {
            for (int i = startNumber; i <= hiddenNumber; i++) {
                if (i == hiddenNumber) {
                    System.out.println("Поздравляю, число (" + i + ") угадано!");
                } else {
                    System.out.println("Данное число (" + i + ") меньше того, что загадал компьютер");
                }
            }
        } else if (startNumber > hiddenNumber) {
            for (int i = startNumber; i >= hiddenNumber; i--) {
                if (i == hiddenNumber) {
                    System.out.println("Поздравляю, число (" + i + ") угадано!");
                } else {
                    System.out.println("Данное число (" + i + ") больше того, что загадал компьютер");
                }
            }
        } else {
            System.out.println("Поздравляю, число (" + hiddenNumber + ") угадано!");
        }
    }
}