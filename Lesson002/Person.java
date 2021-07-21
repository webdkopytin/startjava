public class Person {
    char gender = 'F';
    String name = "Marina";
    float height = 1.83f;
    float weight = 63f;
    int age = 37;

    void walk() {
        System.out.println("Пройдено 1км");
    }

    boolean sit() {
        System.out.println("Вы сели на скамейку");
        return true;
    }

    void run() {
        System.out.println("Совершена пробежка на 5км");
    }

    void talk() {
        System.out.println("Вы что-то сказали");
    }

    void teachJava() {
        System.out.println("Пройдена очередная глава Java");ß
    }
}