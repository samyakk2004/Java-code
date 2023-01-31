//Lambda expression (Can be cast/used only to functional interfaces)

@FunctionalInterface
interface test {
   void meth1();
}

public class TestBin3 {
   public static void main(String[] args) {
      test ob = () -> {
         // overriding meth1() from test interface
         System.out.println("Hello world!");
      };
      ob.meth1();
   }
}