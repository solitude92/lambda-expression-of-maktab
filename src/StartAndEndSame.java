import java.util.function.Predicate;

public class StartAndEndSame {
    public static void main(String[] args) {
        Predicate<String> same = str->str.charAt(0)==str.charAt(str.length()-1);
        System.out.println(same.test("salas"));
        System.out.println(same.test("salam"));
    }
}
