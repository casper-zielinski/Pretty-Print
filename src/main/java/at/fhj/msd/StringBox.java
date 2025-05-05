package at.fhj.msd;

public class StringBox {
      private final String value;

      public StringBox(String value) {
          this.value = value;
      }

      public void print() {
            System.out.print("+");
            char[] chars = value.toCharArray();
            for (int i = 0; i < chars.length; i++) {
                System.out.print("-");
            }
            System.out.print("+\n");
      
          
          System.out.println("|" + value + "|");

          System.out.print("+");
            for (int i = 0; i < chars.length; i++) {
                System.out.print("-");
            }
            System.out.print("+\n");
      }

}
