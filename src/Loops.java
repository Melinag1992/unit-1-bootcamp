/**
 * Created by alexandraqin on 4/14/15.
 */
public class Loops {

    public static void main(String args[]) {

        //loopOneHundred();
        //loopOneHundredWhile();
       // loopEven(10);
//        loopSum();
//        loopTillSumNum(1000);

        duplicateWord(2,"hello");

    }

    public static void loopOneHundred() {

        for (int i = 1; i <= 100; i++) {
            System.out.println(i);

        }
    }

    public static void loopOneHundredWhile(){
        int counter = 1;
        while (counter <= 100) {
            System.out.println(counter);
            counter++;

        }


    } public static void loopEven(int num){
        for (int i = 2; i <=num ; i+=2) {
            System.out.println(i);

        }

    } public static void loopSum(){
        int sum = 0;
        for (int i = 1; i <=10 ; i++) {
            sum += i;
        }
        System.out.println(sum);

    } public static void loopTillSumNum(int num){
        for (int i = 1; i <=num ; i++) {
            System.out.println(i);

        }

    }public static void duplicateWord(int num , String s){
        String word = "";

        for (int i = 0; i <num; i++) {
            word += s + "" ;
        }
        System.out.println(word);
    }

}

