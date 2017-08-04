package exercises;

import java.io.*;
public class Printer {
   public void print() {
      try {
         throw new FileNotFoundException();
      } catch (IOException exception) {
         System.out.print("Z");
      } catch (FileNotFoundException enfe) {
         System.out.print("X");
      } finally {
         System.out.print("Y");
      }
   }
   public static void main(String... ink) {
      new Printer().print();
   }
}