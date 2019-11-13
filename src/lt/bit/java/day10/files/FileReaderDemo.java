package lt.bit.java.day10.files;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.Stream;

class FileReaderDemo {

  private static final String FILE_NAME = "resources/file.txt";

  public static void main(String[] args) throws IOException {
//    readLineByLine();
//    readLineByLineInOldWay();
        readList();
//        readFromStream();
//        readFromStream2();
  }

  private static void readLineByLine() {
    try (InputStreamReader reader = new InputStreamReader(new FileInputStream(FILE_NAME));
        BufferedReader whileReader = new BufferedReader(reader)) {
      String line;
      System.out.println("BufferedReader - line by line (try-with-resources):");
      while ((line = whileReader.readLine()) != null) {
        System.out.println(line);
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  private static void readLineByLineInOldWay() {
    InputStreamReader reader = null;
    BufferedReader bufferedReader = null;
    try {
      reader = new InputStreamReader(new FileInputStream(FILE_NAME));
      bufferedReader = new BufferedReader(reader);

      String line;
      System.out.println("\nBufferedReader - line by line (old way):");
      while ((line = bufferedReader.readLine()) != null) {
        System.out.println(line);
      }
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      try {
        if (bufferedReader != null) {
          bufferedReader.close();
        }
        if (reader != null) {
          reader.close();
        }
      } catch (IOException ioe) {
        throw new RuntimeException("Cannot close reader", ioe);
      }
    }
  }

  private static void readList() throws IOException {
    System.out.println("\nFiles.readAllLines - List:");
    Files.readAllLines(Paths.get(FILE_NAME)).forEach(System.out::println);
  }

  private static void readFromStream() {
    try (InputStreamReader reader = new FileReader(FILE_NAME);
        BufferedReader lambdaReader = new BufferedReader(new BufferedReader(reader))) {
      System.out.println("\nBufferedReader - Stream:");
      lambdaReader.lines()
          .map(l -> l.split("="))
          .map(arr -> new MenuItem(arr[0], Double.parseDouble(arr[1].trim())))
          .forEach(System.out::println);
    } catch (IOException e) {
      System.out.println(e.getMessage());
    }
  }

  private static void readFromStream2() {
    System.out.println("\nFiles.lines - Stream:");
    try (Stream<String> stream = Files.lines(Paths.get(FILE_NAME))) {
      stream.map(l -> l.split("=")).forEach(arr -> System.out.println(Arrays.toString(arr)));
    } catch (IOException e) {
      System.out.println(e.getLocalizedMessage());
    }
  }

  private static class MenuItem {

    private final String name;
    private final double price;

    MenuItem(String name, double price) {
      this.name = name;
      this.price = price;
    }

    public String getName() {
      return name;
    }

    public double getPrice() {
      return price;
    }

    @Override
    public String toString() {
      return "MenuItem{" +
          "name='" + name + '\'' +
          ", price=" + price +
          '}';
    }
  }
}
