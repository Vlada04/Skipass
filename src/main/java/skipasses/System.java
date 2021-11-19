package skipasses;

import java.io.PrintStream;
import java.util.Scanner;

public class System {

    public static PrintStream out;
    private static String in;

    public void blockSkiPass(SkiPass pass) {
        pass.setBlocked();
    }

    public void menu() {
        System.out.println("Choose ski pass:\n Ski-pass for workday: 1) Ski pass for days\n 2) Ski pass for lifts\n"
                +"Ski-pass for weekday: 3) Ski pass for days\n 4) Ski pass for lifts");
    }

    public SkiPass createSkiPass() {
        menu();

        while (true) {
            Scanner s = new Scanner(System.in);
                int choice = s.nextInt();

        if (choice == 1){
            SkiPass pass = SkiPassForDays.getSkiPassForDays();
            pass.setID(1);
            pass.setType(Type.WORKDAY);
            pass.setTerm(30);
            pass.setBlocked(true);
            return pass;}

        if (choice == 2){
            SkiPass pass2 = SkiPassForLifts.getSkiPassForLifts();
            pass2.setID(1);
            pass2.setType(Type.WORKDAY);
            pass2.setTerm(30);
            pass2.setBlocked(true);
            return pass2;}

        if (choice == 3){
            SkiPass pass3 = SkiPassForDays.getSkiPassForDays();
            pass3.setID(1);
            pass3.setType(Type.WEEKEND);
            pass3.setTerm(30);
            pass3.setBlocked(true);
            return pass3;}

        if (choice == 4){
            SkiPass pass4 = SkiPassForLifts.getSkiPassForLifts();
            pass4.setID(1);
            pass4.setType(Type.WEEKEND);
            pass4.setTerm(30);
            pass4.setBlocked(true);
            return pass4;}
        }
    }
}
