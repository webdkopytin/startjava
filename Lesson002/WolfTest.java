public class WolfTest {
    public static void main(String[] args) {
        Wolf wolf = new Wolf();
        wolf.gender = "Male";
        wolf.nickname = "BlackPerson";
        wolf.weight = 5.3f;
        wolf.color = "Black";

        System.out.println(
                "Характеристики волка: " + System.lineSeparator() +
                "\tПол: " + wolf.gender + System.lineSeparator() +
                "\tНикнейм: " + wolf.nickname + System.lineSeparator() +
                "\tВес: " + wolf.weight + " кг." + System.lineSeparator() +
                "\tЦвет: " + wolf.color
        );

        wolf.go();
        wolf.sit();
        wolf.run();
        wolf.howl();
        wolf.hunt();
    }
}