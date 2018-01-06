/**
 * Created by alexandraqin on 4/14/15.
 */
public class Methods {


    public static void main(String args[]) {
        int roomNum = 113;
        double valueToE = 2.71828;
        String comp = "Computer Science";

        System.out.println("This is room " + roomNum);
        System.out.println("e is close to " + valueToE);
        System.out.println("I am learning a bit about " + comp);


    }


    public static boolean isOdd(int x) {

        return x % 2 != 0;

    }

    public static void printHelloWorld() {
        String helloWorld = "Hello World!";
        System.out.println(helloWorld);

    }

    public int greatestCommonFactor(int num, int num2) {
        while (num != 0 && num2 != 0) // until either one of them is 0
        {
            int c = num2;
            num2 = num % num2;
            num = c;
        }
        return num + num2; // either one is 0, so return the non-zero value
    }


}

