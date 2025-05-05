package at.fhj.msd;

public class Box<T> {
      private final T value;
      
      public Box(T value) {
            this.value = value;
      }
      
      public void print() {
            System.out.print("+");
            String valueString = value.toString();
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