import org.apache.commons.lang3.math.NumberUtils;

public class Main {
//Oyster 2
    public static void main(String[] args) {
Main m = new Main();
        System.out.println(m.isNumeric("-"));
    }

    public String isNumeric(String input) {
        //Appache common library
        if (NumberUtils.isCreatable(input)){
            return input + " is numeric.";
        }

        return input + " can't be converted to a number.";
    }
}
