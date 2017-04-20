import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class MostCommonWord {
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
      System.out.println("java MostCommonWord [source]");
    } else if (args.length == 2) {
      readFile(args[0]);
    }

  }

  private static void readFile(String arg) {


    try {
      Path filepath = Paths.get("countas/afile.txt");
      fileInput = Files.readAllLines(filepath);
      System.out.println("File reading OK.");
    } catch (IOException e) {
      System.out.println("Something wrong:" + e.getClass());
    }
    String a = fileInput.toString();
    char ch = a.charAt(a.indexOf('a'));
    int count = 0;
    for (int i = 0; i < a.length(); i++) {
      if (a.charAt(i) == 'a') {
        count++;
      } else if (a.charAt(i) == 'A') {
        count++;
      }
    }
    System.out.println("Total count of letter a: " + count);
  }
  }
}