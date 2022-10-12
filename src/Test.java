/**
 * @author Drumstyle92
 * class that contains the core of the program.
 */
public class Test {
    /**
     *
     * @param args main parameter.
     * main method that contains booleans and prints.
     */
    public static void main(String[] args) {

        System.out.println("--------------booleanA------------");
        boolean out1 = (55 != 55) && (false ^ true);
        System.out.println("A: " + out1);

        System.out.println("--------------booleanB------------");
        boolean a = true;
        boolean b = false;
        int c = 2;
        char d = '2';
        boolean out2 =  (!a || !b || c == d);
        System.out.println("B: " + out2);

        System.out.println("--------------booleanC------------");
        boolean out3 = false && true || false && !false;
        System.out.println("C: " + out3);

        System.out.println("--------------booleanD------------");
        boolean out4 = (false && true) || (false || true);
        System.out.println("D: " + out4);
    }
}
