import java.util.Scanner;

public class StopWatch {
    public static void main(String[] args) {
        Scanner keybr = new Scanner (System.in);
        System.out.println("Enter a time in minutes : ");
        int time = keybr.nextInt();

        // our first loop should start at time -1
        for (int i = time-1; i >= 0; i--) {

            //our second for loop should start
            for (int j = 59; j >= 0; j=j-1) {
                System.out.println("Current time : " + i + ":" + j);
            }
        }
        System.out.println("Time Over!");

//        Enter a time in minutes.
//        3
//        2:59
//        2:58
//        2:57
//        2:56
//        ...
//
//        0: 3
//        0: 2
//        0: 1
//        0: 0
//        Time over!
    }
}
