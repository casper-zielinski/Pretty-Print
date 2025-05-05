package at.fhj.msd;

public class IntegerBox {
      private final int value;

      public IntegerBox(int value) {
          this.value = value;
      }

      public void print() {
            System.out.print("+");
            String valueString = Integer.toString(value);
            char[] chars = valueString.toCharArray();
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
