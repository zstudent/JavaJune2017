package exercises;

public class Remember {
   public static void think() throws Exception {  // k1
      try {
         throw new Exception();
      }
   }
   public static void main(String... ideas) throws Exception {
      think();
   }
}