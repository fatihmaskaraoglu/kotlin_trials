package fatihmas.upperbound.javacode;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class JavaGenerics {

    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("hello");
        //strings.add(new BigDecimal(10.5));

        boolean b = strings instanceof List;
    }

}
