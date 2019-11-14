package lt.bit.java.day10.nd;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
/*
ND 11.11
--------
Sukurti tekstinį failą (rankiniu būdu), kuriame būtų žodžai surašyti per kablelį. Tarp žodžio ir kablelio gali būti tarpai.
Parašyti programą, kuri nuskaito šio failo turinį ir išveda žodžius viename stulpelyje (be tarpų, įrodymui žodžius spausdinkite tarp kokių nors simbolių).
Pvz., jei faile turime "vienas,du, trys, nulis" ir naudojame simbolį "|", tai rezultatas turėtų būti toks:
|vienas|
|du|
|trys|
|nulis|
*/
public class Words {
    private static final String FILE_NAME = "resources/nd1111.txt";
    private static char symbol = '|';

    public static void main(String[] args) throws IOException {
        List<String> fileContent = Files.readAllLines(Paths.get(FILE_NAME));

        String value = fileContent.stream()
                .map(String::valueOf)
                .collect(Collectors.joining());

        Arrays.stream(value.split(Pattern.quote(", ")))
                .map(s -> symbol + s + symbol)
                .forEach(System.out::println);
    }
}
