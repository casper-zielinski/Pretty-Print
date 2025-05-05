package at.fhj.msd;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        StringBox stringBox = new StringBox("MSD");
        stringBox.print();

        IntegerBox integerBox = new IntegerBox(1234);
        integerBox.print();

        Box<String> genericStringBox = new Box<>("YOLO");
        genericStringBox.print();

        Box<Integer> genericIntegerBox = new Box<>(42);
        genericIntegerBox.print();

        Box<Double> genericDoubleBox = new Box<>(3.14);
        genericDoubleBox.print(); 
    }
}
