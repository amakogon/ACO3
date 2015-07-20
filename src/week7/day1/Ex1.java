package week7.day1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ex1 {
  public static void main(String[] args) {
    BufferedReader reader = null;
    StringBuilder builder = new StringBuilder();
    try {
      reader = new BufferedReader(new FileReader("/home/amakogon/ACB7"));
      while (reader.ready()) {
        builder.append(reader.readLine()).append("\n");
      }
    } catch (IOException e) {
      System.out.println("Error happened");
    } finally {
      try {
        if (reader != null) {
          reader.close();
        }
      } catch (IOException ignored) {
      }
    }

    System.out.println(builder);

  }
}
