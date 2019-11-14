package lt.bit.java.day21.nd;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/*
ND 11.12
--------
Parašyti programą, kuri sukuria tekstinius failus food.txt bei drinks.txt su tam tikra informacija ir nukopijuoja jų turinį į menu.txt failą.
Tarp gėrimų ir maisto įterpkite kokį nors skirtuką.
Po kopijavimo išvesti menu.txt turinį į konsolę.
Jei faile saugome tik pavadinimus, rezultatas turėtų būti maždaug toks:
menu.txt:
---------
Margarita
-=-=-=-=-
Beer
Cola
Visi failai turi būti kuriami ir pildomi programos vykdymo metu.
Jei koks nors failas jau egzistuoja, programa turi jį ištrinti pačioje pradžioje arba perrašyti iš naujo.
*/
public class FilesManipulation {
    private static final String FOOD_FILE   = "resources/food.txt";
    private static final String DRINKS_FILE = "resources/drinks.txt";
    private static final String MENU_FILE   = "resources/menu.txt";
    private static final String TAB         = "-=-=-=-=-";

    public static void main(String[] args) throws IOException {
        deleteFile();

        createFile(FOOD_FILE);
        createFile(DRINKS_FILE);
        createFile(MENU_FILE);

        writeToFile(FOOD_FILE,"Margarita");
        writeToFile(DRINKS_FILE,"Beer\nCola");

        readList(FOOD_FILE);
        appendMenuFile(TAB);
        readList(DRINKS_FILE);

        readAndPrintMenu();
    }

    private static void deleteFile() {
        boolean delete = new File(MENU_FILE).delete();
    }

    private static void readAndPrintMenu() throws IOException {
        Files.readAllLines(Paths.get(MENU_FILE)).forEach(System.out::println);
    }

    private static void createFile(String fileName) throws IOException {
        boolean newFile = new File(fileName).createNewFile();
    }

    private static void writeToFile(String fileName, String text) throws IOException {
        FileWriter fileWriter = new FileWriter(fileName);
        fileWriter.write(text);
        fileWriter.close();
    }

    private static void readList(String fileName) throws IOException {
        Files.readAllLines(Paths.get(fileName)).forEach(s -> {
            try {
                appendMenuFile(s);
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
    }

    private static void appendMenuFile(String tab) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(MENU_FILE, true));
        writer.append(tab).append("\n");
        writer.close();
    }
}
