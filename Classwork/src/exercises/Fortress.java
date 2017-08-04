package exercises;

import java.io.IOException;

public class Fortress {
	   public void openDrawbridge() throws IOException {  // p1
//	      try {
//	         throw new IOException("Circle");
//	      } catch (Exception e) {
//	         System.out.print("Opening!");
//	      } finally {
//	         System.out.print("Walls");  // p2
//	      }
	   }
	   public static void main(String[] moat) {
	      try {
			new Fortress().openDrawbridge();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  // p3
	   }
	}