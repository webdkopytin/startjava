public class Jaeger {

    private String modelName;
    private String mark;
    private String origin;
    private float height;
    private float weight;
    private int armour;

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public int getArmour() {
        return armour;
    }

    public void setArmour(int armour) {
        this.armour = armour;
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