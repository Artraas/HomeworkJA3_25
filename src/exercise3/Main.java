package exercise3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String sentence = "George Gordon Byron was born on January 22, 1788. He grew in London, England.";


//        Кожне речення з нового рядка:
        String[] sncs = sentence.split(".");

        System.out.println(Arrays.toString(sncs));

        for (int i = 0; i < sncs.length; i++){
            System.out.println(Arrays.toString(new String[]{sncs[i]}));
        }

//        Поділ на 2 рівні частини:
        String s1 = sentence.substring(0, sentence.length() / 2);
        String s2 = sentence.substring(sentence.length() / 2, sentence.length());
        System.out.println(s1);
        System.out.println(s2);

    }
}
