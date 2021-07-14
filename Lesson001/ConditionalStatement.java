public class ConditionalStatement {
    public static void main(String[] args) {
        short age = 36;
        if (age > 20) {
            System.out.println("Cтарше 20 лет");
        }

        boolean maleGender = true;
        if (maleGender) {
            System.out.println("Мужчина");
        }

        if (!maleGender) {
            System.out.println("Женщина");
        }

        double height = 1.83;
        if (height < 1.80) {
            System.out.println("Рост менее 1 метр 80 сантиметров");
        } else {
            System.out.println("Рост более чем 1 метр 80 сантиметров");
        }

        char firstLetterName = 'D';
        if (firstLetterName == 'M') {
            System.out.println("Первая буква имени: М");
        } else if (firstLetterName == 'I') {
            System.out.println("Первая буква имени: I");
        } else {
            System.out.println("Не удалось определить первую букву имени");
        }
    }
}