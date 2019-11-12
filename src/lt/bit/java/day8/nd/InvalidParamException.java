package lt.bit.java.day8.nd;
//    ND 11.07
//    --------
//    1. Sukurti klasę InvalidParamException, kuri paveldi Exception. Klasė turi turėti laukus String error ir Object[] params.
//    Namie tiesiog pabandykite išmesti ir pagauti tokio tipo Exceptionus.
//
//    2. Panaudokite prieš tai sukurtą exception klasę ir parašykite metodą
//    kuris gražintų sveikų skaičių dalybą. Pvz metodas(Integer a , Integer
//    b). Jei metode paduodamos null reiksmes ismeskite exception.
//    Pabandykite iskviesti ta metoda su try with resources ir jeigu yra
//    klaida atspausdinti ja.
//
//    3. Susikurkite failą su kažkokiu turiniu iš interneto wikipedijos ) ir
//    parašykite programą , kuri išveda žodžius panaudotus tame tekste ir
//    kiek kartų tas žodis buvo panaudotas žodžių panaudojimo mažėjimo
//    tvarka. Pastaba: didžiosios mažosios raidės laikomos tokiomis pat,
//    t.y . žodžiai Wikipedia ir wikipedia yra tas pats žodis.

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class InvalidParamException extends Exception {
    String error;
    Object[] params;

    public Object[] getParams() {
        return params;
    }

    public InvalidParamException(String error, Object[] params) {
        super(error);
        this.params = params;
    }

    private static int intDivide(Integer a, Integer b) {
        System.out.print("2. ");
        try {
            if (a == null || b == null) {
                throw new InvalidParamException("Kazkuris is elementu yra null", new Integer[]{a, b});
            } else return a / b;
        } catch(InvalidParamException e) {
            System.out.println(e.getMessage() + " " + Arrays.toString(e.getParams()));
        } catch (ArithmeticException e) {
            System.out.println("Dalyba iš nulio negalima");
        }
        return 0;
    }

    public static void main(String[] args) // throws InvalidParamException
    {
//        throw new InvalidParamException("1. klaidos pranešimas", new Integer[]{1, 2, 3});
//        try {
//            throw new InvalidParamException("1. klaidos pranešimas", new Integer[]{1, 2, 3});
//        } catch (InvalidParamException e) {
//            System.out.println("1. 10balų");
//        }
        intDivide(null, null);
        intDivide(5, 0);

//        try {
//            Integer a = 5;
//        }

        printWordCount();
    }

    private static void printWordCount() {
        System.out.print("3. ");
        try {
            String path = "/home/keizah/java/java-oop/";
            File myObj = new File(path + "data.txt");
            Scanner myReader = new Scanner(myObj);

            Map<String, Wrapper> words = new TreeMap<>();

            while (myReader.hasNext()) {
                String word = myReader.next();
                String lowWord = word.toLowerCase();

                if(words.containsKey(lowWord)) {
                    Wrapper w = words.get(lowWord);
                    words.put(lowWord, new Wrapper(w.plusCount()));
                } else {
                    words.put(lowWord, new Wrapper(word));
                }
            }

            System.out.println(words);

            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}


class Wrapper {
    private String word;
    private int count;

    Wrapper(String word) {
        this.word = word;
        this.count = 0;
    }

    Wrapper(int count) {
        this.count = count;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    private int getCount() {
        return count;
    }

    private void setCount(int count) {
        this.count = count;
    }


    int plusCount(){
        int num = getCount();
        setCount(++num);

        return getCount();
    }

    @Override
    public String toString() {
        return "{" +
                "count=" + count +
                "}\n";
    }
}
