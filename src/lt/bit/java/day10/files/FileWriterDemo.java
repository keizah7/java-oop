package lt.bit.java.day10.files;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;

class FileWriterDemo {

  private static final String FILE_NAME1 = "resources/output1.txt";
  private static final String FILE_NAME2 = "resources/output2.txt";
  private static final String FILE_NAME3 = "resources/output3.txt";

  public static void main(String[] args) throws IOException {
//    createFile(FILE_NAME1);
//    createFile(Paths.get("resources/output1.txt"));
//    createFile(Paths.get("resources", "output1.txt"));
//    createFile(Paths.get(FILE_NAME1));

//    writeToFile(FILE_NAME2);
//    writeToFile(Paths.get(FILE_NAME1));
//    appendToFile(FILE_NAME2);
    printToFile(FILE_NAME3);
  }

  private static void createFile(String fileName) throws IOException {
    File file = new File(fileName);
    boolean status = file.createNewFile();
    System.out.println(status);
  }

  private static void createFile(Path filePath) throws IOException {
    if (!Files.exists(filePath)) {
      Files.createFile(filePath);
    }
  }

  private static void writeToFile(String fileName) throws IOException {
    FileWriter fileWriter = new FileWriter(fileName);
    fileWriter.write("hi");
    fileWriter.close();
  }

  private static void writeToFile(Path filePath) throws IOException {
//    BufferedWriter writer = Files.newBufferedWriter(filePath);
//    writer.write("HI");
    Files.write(filePath, "hi".getBytes());
  }

  private static void appendToFile(String fileName) throws IOException {
    //BufferedWriter writer = Files.newBufferedWriter(filePath);
    BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));
    writer.append(' ');
    writer.append("students");
    writer.close();
  }

  private static void printToFile(String fileName) throws FileNotFoundException {
    PrintWriter writer = new PrintWriter(fileName);
    writer.printf("Hello %s! Today we have lesson #%d%n", "students", 16);
    writer.println("new line");
    writer.close();
  }
}
