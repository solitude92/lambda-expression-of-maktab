import java.util.function.BinaryOperator;
import java.util.function.Function;

public class Average {
    public static void main(String[] args) {
        BinaryOperator<Double> average = (a, b)->(a+b)/2;
        System.out.println(average.apply(5.0,8.0));
    }
}
