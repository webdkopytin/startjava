public class ConditionalStatement {
    public static void main(String[] args) {
        short age = 36;
        boolean maleGender = true;
        double height = 1.83;
        char theFirstLetterName = 'D';

        if (age > 20) {
            System.out.println("Cтарше 20 лет");
        }

        if (maleGender) {
            System.out.println("Мужчина");
        }

        if (!maleGender) {
            System.out.println("Женщина");
        }

        if (height < 1.80) {
            System.out.println("Рост менее 1 метр 80 сантиметров");
        } else {
            System.out.println("Рост более чем 1 метр 80 сантиметров");
        }

        if (theFirstLetterName == 'M') {
            System.out.println("Первая буква имени: М");
        } else if (theFirstLetterName == 'I') {
            System.out.println("Первая буква имени: I");
        } else {
            System.out.println("Не удалось определить первую букву имени");
        }
    }
}