public class JaegerTest {
    public static void main(String[] args) {
        Jaeger jaegerOne = new Jaeger();
        Jaeger jaegerTwo = new Jaeger();

        System.lineSeparator();
        jaegerOne.setModelName("Scrapper");
        jaegerOne.setMark("Mark-5");
        jaegerOne.setOrigin("USA");
        jaegerOne.setHeight(70.7f);
        jaegerOne.setWeight(1282f);
        jaegerOne.setArmour(9);
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
        jaegerTwo.setModelName("Headhunter");
        jaegerTwo.setMark("Mark-5");
        jaegerTwo.setOrigin("Australia");
        jaegerTwo.setHeight(56.3f);
        jaegerTwo.setWeight(1132f);
        jaegerTwo.setArmour(8);
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