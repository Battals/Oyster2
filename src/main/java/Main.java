import org.apache.commons.lang3.math.NumberUtils;

public class Main {

    public static void main(String[] args) {
Main m = new Main();
        System.out.println(m.isNumeric("1e5"));
    }
//
    public String isNumeric(String input) {
        if (NumberUtils.isCreatable(input)){
            return input + " is numeric.";
        }

        return input + " can't be converted to a number.";
    }
}
