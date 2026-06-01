import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedWriter;
import java.nio.file.*;
import java.util.List;

public class ResultsManager {

  public static String fileName = "results.txt";

  public static void record(String name, String result) {
    System.out.println("Writing: Name=" + name + " Result=" + result);
    try {
      // Create a FileWriter in append mode (true as the second argument)
      FileWriter fileWriter = new FileWriter(fileName, true);

      // Optional: Wrap FileWriter in a BufferedWriter for better performance
      BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

      // Write the content to the file
      String textToAdd = name.trim() + "," + result;
      bufferedWriter.write(textToAdd + "\n");

      // Close the writer to ensure all data is written and resources are released
      bufferedWriter.close(); // Close BufferedWriter, which also closes FileWriter

      System.out.println("Content appended to " + fileName + " successfully.");

      } catch (IOException e) {
          System.err.println("An error occurred while appending to the file: " + e.getMessage());
          e.printStackTrace();
      }
  }

  public static void printResults() {
    //results header text
    Util.clearConsole();
    final String HEADER = "Past Stories";
    System.out.println(HEADER);
    Util.pauseConsole();
    //bar underneath header
    String underscore = "";
    for (int index=0; index< HEADER.length()+5; index++){
      underscore += "_";
    }
    System.out.println(underscore);

    //take in data, output it
    try {
      //formatting - trim the length of name
      List<String> lines = Files.readAllLines(Paths.get("results.txt"));
      for (String line : lines) {
        int separatorIndex = line.indexOf(",");
        String author = line.substring(0,separatorIndex);
        String story = line.substring(separatorIndex+1);
        Util.clearConsole();
        System.out.println("Author: " + author);
        System.out.println(story);
             
      }
    } catch (IOException e) {
          e.printStackTrace();
      }
  }
       
}