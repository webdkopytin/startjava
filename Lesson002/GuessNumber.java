import java.util.Scanner;

public class GuessNumber {
    private Player playerOne;
    private Player playerTwo;
    private int compNumber;
    private boolean isWin;
    private Scanner scan = new Scanner(System.in);

    public GuessNumber(Player playerOne, Player playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
    }

    public void startGame() {
        isWin = false;
        compNumber = (int) (Math.random() * 100);
        System.out.println("\nКомпьютер загадал число: " 
        + compNumber);  
        do {
            inputUserNumber(playerOne);
            guessingNumber(playerOne);
            inputUserNumber(playerTwo);
            guessingNumber(playerTwo);
        } while (!isWin);
    } 

    public void inputUserNumber(Player player) {
        System.out.print(player.getName() + ", введите число: ");
        player.setNumber(scan.nextInt());
    }

    public void guessingNumber(Player player) {
        if (player.getNumber() == compNumber) {
            System.out.println(player.getName() + ", Вы угадали, это число: " + player.getNumber());
            isWin = true;
        } else if (player.getNumber() < compNumber) {
            System.out.println(player.getName() + ", введенное Вами число меньше того, что загадал компьютер");
        } else if (player.getNumber() > compNumber) {
            System.out.println(player.getName() + ", введенное Вами число больше того, что загадал компьютер");
        }
    }
}