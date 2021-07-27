public class JaegerTest {
    public static void main(String[] args) {
        Jaeger jaegerOne = new Jaeger("Scrapper", "Mark-5", "USA", 70.7f, 1282f, 9);
        Jaeger jaegerTwo = new Jaeger("Headhunter", "Mark-5", "Australia", 56.3f, 1132f, 8);

        System.lineSeparator();
        System.out.println("jaegerOne");
        System.out.println("modelName = " + jaegerOne.getModelName());
        System.out.println("mark = " + jaegerOne.getMark());
        System.out.println("origin = " + jaegerOne.getOrigin());
        System.out.println("height = " + jaegerOne.getHeight());
        System.out.println("weight = " + jaegerOne.getWeight());
        System.out.println("armour = " + jaegerOne.getArmour());
        System.out.println("jaegerOne, " + jaegerOne.drift());
        jaegerOne.move();
        System.out.println("jaegerOne, " + jaegerOne.scanKaiju());

        System.lineSeparator();
        System.out.println("jaegerTwo");
        System.out.println("modelName = " + jaegerTwo.getModelName());
        System.out.println("mark = " + jaegerTwo.getMark());
        System.out.println("origin = " + jaegerTwo.getOrigin());
        System.out.println("height = " + jaegerTwo.getHeight());
        System.out.println("weight = " + jaegerTwo.getWeight());
        System.out.println("armour = " + jaegerTwo.getArmour());
        System.out.println("jaegerTwo, " + jaegerTwo.drift());
        jaegerTwo.move();
        System.out.println("jaegerTwo, " + jaegerTwo.scanKaiju());

        System.out.println(jaegerOne);
        System.out.println(jaegerTwo);
    }
}