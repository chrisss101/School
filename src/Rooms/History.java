package Rooms;
import People.Person;

import java.util.Scanner;

public class History implements Rooms.Room {
    @Override
    public  void Question(Person P) {
        Scanner Mteacher = new Scanner(System.in);
        System.out.println("in what year was the war of 1812?");
        String answer = Mteacher.nextLine();
        if (answer.equals("1812")) {
            P.grade += 10;
            System.out.println("Correct, your grade increased by 10 points");
        }
        else {
            P.grade -= 10;
            System.out.println("Wrong, your grade decreased by 10 points");
        }
        System.out.println("hey you found your calculator");
        P.getCalc(true);

    }

    @Override
    public  void checkPencil(Person P) {
        if (P.pencil == true) {
            P.grade += 10;
            System.out.println("You have your pencil");
        }
        else {
            P.grade -= 10;
            System.out.println("You seem to have lost your pencil");
        }
    }

    @Override
    public void checkCalculator(Person P) {

    }

}
