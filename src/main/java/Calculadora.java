import java.util.stream.DoubleStream;

public class Calculadora {

    static double add(double ... operands){
        return DoubleStream.of(operands)
                .sum();
    }

    static double multiply(double... operands) {
        return DoubleStream.of(operands)
                .reduce(1, (a, b) -> a * b);
    }

    static double sub(double a, double b){
        return a-b;
    }

}
