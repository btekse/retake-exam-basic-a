import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MostCommonWord {
  static List<String> fileInput = new ArrayList<>();

  public static void main(String[] args) {
    // This should be a simple word counter which give us the most common string in a file
    // If ran from the command line without arguments it should print out the usage:
    // java MostCommonWord [source]
    // When no argument is provided print out
    // No source provided
    // When the argument provided and the source is a file
    // count all words in the given file and print the most common 
    // ("cat", "CAT", "cat," "cat." are different words )

    if (args.length == 0) {
      System.out.println("No source provided");
    } else if (args.length == 1) {
      readFile(args[0]);
    }
  }

  private static void readFile(String arg) {
    Path filePath = Paths.get(arg);
    try {
      fileInput = Files.readAllLines(filePath);
    } catch (IOException e) {
      System.out.println("Something wrong with source file!");
      e.printStackTrace();
    }
    String words = fileInput.toString();
    String[] eachWord = words.split("\\s+");

    for (int i = 0; i < eachWord.length; i++) {
      System.out.println(i + ". word" + eachWord[i]);
    }
  }
}


