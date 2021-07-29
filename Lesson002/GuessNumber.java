import java.util.Scanner;

public class GuessNumber {
    private Player playerOne;
    private Player playerTwo;
    private int hiddenNumber;
    private boolean isWin;
    private Scanner scan = new Scanner(System.in);

    public GuessNumber(Player playerOne, Player playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
    }

    public void start() {
        isWin = false;
        hiddenNumber = (int) (Math.random() * 100 + 1);
        System.out.println("\nКомпьютер загадал число: " + hiddenNumber);
        do {
            if (!isWin) {
                inputNumber(playerOne);
                compareNumbers(playerOne);
            } 
            if (!isWin) {
                inputNumber(playerTwo);
                compareNumbers(playerTwo);
            }
        } while (!isWin);
    } 

    private void inputNumber(Player player) {
        System.out.print(player.getName() + ", введите число: ");
        player.setNumber(scan.nextInt());
    }

    private void compareNumbers(Player player) {
        if (player.getNumber() == hiddenNumber) {
            System.out.println(player.getName() + ", Вы угадали, это число: " + player.getNumber());
            isWin = true;
        } else if (player.getNumber() < hiddenNumber) {
            System.out.println(player.getName() + ", введенное Вами число меньше того, что загадал компьютер");
        } else if (player.getNumber() > hiddenNumber) {
            System.out.println(player.getName() + ", введенное Вами число больше того, что загадал компьютер");
        }
    }
}