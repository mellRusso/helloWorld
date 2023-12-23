public class LessonString {
    public static void main(String[] args) {
        //Задача 1. Проверить, находится ли слово из переменной word в строке из переменной text
        /*String text = "application hello template";
        String word = "hello";

        if (text.contains(word)) { //используя contains
            System.out.println("Данное слово находится в строке");
        } else {
            System.out.println("Данного слова нету");
        }

        int indexWord = text.indexOf(word);
        if (indexWord != -1) { //используя indexOf
            System.out.println("Данное слово находится в строке");
        } else {
            System.out.println("Данного слова нету");
        }

        //Задача 2. Из массива names вывести только те имена которые начинаются на символ `A`

        String[] names = {"Alex", "Drake", "Anya", "Leon", "Adam"};  //реализация с startsWith
        for (String name : names) {
            if (name.startsWith("A")) {
                System.out.println(name);
            }
        }

        for (int i = 0; i < names.length; i++) { //реализация с indexOf
            int num = names[i].indexOf("A");
            if (num != -1) {
                System.out.println(names[i]);
            }
        }

        for (int i = 0; i < names.length; i++) { //реализация с charAt
            char t = names[i].charAt(0);
            if (t == 'A') {
                System.out.println(names[i]);
            }
        }

        //Задача 3. Вывести первое и последнее слово из строки
        String str = "application hello transaction template";
        int index = str.indexOf(" "); //находим под каким индексом пробел
        String newStr = str.substring(0, index); //записывваем конец индекса в метод substing
        System.out.println(newStr);

        int indexLast = str.lastIndexOf(" "); //делаем тоже самое что и выше, но только с конца
        String strNewTwo = str.substring(indexLast + 1);
        System.out.println(strNewTwo);
        System.out.println("///");

        String t = "";
        for (int i = 0; i < str.length(); i++) { //первое слово
            char ch = str.charAt(i);
            if (ch == ' ') {
                break;
            } else {
                t += ch;
            }
        }
        System.out.println(t);

        int num = 0;
        for (int i = str.length() - 1; i < str.length(); i--) { //последнее слово
            char ch = str.charAt(i);
            if (ch == ' ') {
                num = i;
                break;
            }
        }
        String l = "";
        for (int i = num + 1; i < str.length(); i++) {
            char ch = str.charAt(i);
            l += ch;
        }
        System.out.println(l);

        //Задача 4. Определите сколько раз слово из word встречается в text
        String text = "application hello transaction template hellohello";
        String word = "hello";

        int num = 0;
        for (int i = 0; i < text.length(); i++) {
            int index = text.indexOf(word, i);
            if (index != -1) {
                i = index;
                num++;
            }
        }
        System.out.println(num);

        //Задача 5. Замените буквы из переменной word в строке текст на звездочки
        String text = "application hello transaction template hellohello";
        String word = "hello";

        String maskedText = text.replace(word, "*".repeat(word.length()));
        System.out.println(maskedText);*/

        //Задачи с урока
        //1. Напишите программу, которая принимает строку и выводит каждое второе слово в этой строке.
        /*
        String[] text = "Java is a widely used programming language".split(" "); //разделяем по пробелам
        for(int i = 0; i < text.length; i++) {
            if(i % 2 != 0) {
                System.out.println(text[i]);
            }
        } */
        //2. Напишите программу, которая принимает строку и слово, а затем определяет, сколько раз слово встречается в строке, игнорируя регистр букв.
        /*
        String text = "Java and JavaScript are not the same, but both are programming languages".toLowerCase(); //меняем регистр всех букв на мелкий
        String word = "java".toLowerCase(); //здесь также меняем, т.к регистр нам не важен
        int n = 0;
        for (int i = 0; i < text.length(); i++) {
            int index = text.indexOf(word, i);
            if (index != -1) {
                i = index;
                n++;
            }
        }
        System.out.println(n);


        //3. Напишите программу, которая инвертирует порядок слов в предложении.
        String[] text = "Java is fun to learn".split(" ");
        for (int i = text.length - 1; i >= 0; i--) {
            System.out.print(text[i] + " ");
        }*/
    }
}