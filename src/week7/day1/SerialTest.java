package week7.day1;

import week2.day2.IceDragon;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerialTest {
  public static void main(String[] args) throws IOException {
    String text = "Hello";
    ObjectOutputStream outputStream = null;
    String filePath = "/home/amakogon/TempFile";
    Cat cat = new Cat("Vasia");
    cat.setBestFriend(new IceDragon("Sub Zero", "White"));
    try {
      outputStream = new ObjectOutputStream(new FileOutputStream(filePath));
//      outputStream.writeObject(text);
      outputStream.writeObject(cat);
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      try {
        if (outputStream != null) {
          outputStream.close();
        }
      } catch (IOException e) {
        e.printStackTrace();
      }
    }


    ObjectInputStream inputStream
      = new ObjectInputStream(new FileInputStream(filePath));
    String input = "";
    Cat restoredCat = null;
    try {
//      input = (String) inputStream.readObject();
      restoredCat = (Cat) inputStream.readObject();
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    }

    System.out.println(input);
    System.out.println(restoredCat);


  }
}
