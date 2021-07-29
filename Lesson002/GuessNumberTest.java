import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Первый игрок, введите свое имя: ");
        Player playerOne = new Player(scan.next());
        
        System.out.print("Второй игрок, введите свое имя: ");
        Player playerTwo = new Player(scan.next());

        GuessNumber game = new GuessNumber(playerOne, playerTwo);
        
        String response = "yes";
        do {
            game.start();

            do {
                System.out.print("Хотите продолжить? [yes/no]: ");
                response = scan.next();
            } while (!response.equals("yes") && !response.equals("no"));
        } while(response.equals("yes"));
        System.out.println("Удачи!");
    }
}