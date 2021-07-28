public class Jaeger {

    private String modelName;
    private String mark;
    private String origin;
    private float height;
    private float weight;
    private int armour;

    public Jaeger(String modelName, String mark, String origin, float height, float weight, int armour) {
        this.modelName = modelName;
        this.mark = mark;
        this.origin = origin;
        this.height = height;
        this.weight = weight;
        this.armour = armour;
    }

    public String getModelName() {
        return modelName;
    }

    public String getMark() {
        return mark;
    }

    public String getOrigin() {
        return origin;
    }

    public float getHeight() {
        return height;
    }

    public float getWeight() {
        return weight;
    }

    public int getArmour() {
        return armour;
    }

    boolean drift() {
        System.out.println("Вы вошли в дрифт");
        return true;
    }

    void move() {
        System.out.println("Вы прошли 5 шагов");
    }

    String scanKaiju() {
        return "nothing";
    }

    void useVortexCannon() {

    }

    public String toString() {
        return "Информация о модели: " + System.lineSeparator() +
                "\tmodelName = " + modelName + System.lineSeparator() +
                "\tmark = " + mark + System.lineSeparator() +
                "\torigin = " + origin + System.lineSeparator() +
                "\theight = " + height + System.lineSeparator() +
                "\tweight = " + weight + System.lineSeparator() +
                "\tarmour = " + armour;
    }
}