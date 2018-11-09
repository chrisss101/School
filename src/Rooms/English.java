package Rooms;

import People.Person;

import java.util.Scanner;

public class English implements Room{
    @Override
    public  void Question(Person P) {
        Scanner Mteacher = new Scanner(System.in);
        System.out.println("You walked into the English room");
        System.out.println("How many syllables does Valentine have?");
        String answer = Mteacher.nextLine();
        if (answer.equals("3")) {
            P.grade += 10;
            System.out.println("Correct, your grade increased by 10 points");
        }
        else {
            P.grade -= 10;
            System.out.println("Wrong, your grade decreased by 10 points");
        }
    }

    @Override
    public  void checkPencil(Person P) {
        if (P.pencil == true) {
            P.grade += 10;
            System.out.println("You have your pencil");
        }
        else {
            P.grade -= 10;
            System.out.println("You seem to have lost your pencil, this decreased your grade by 10 points");
        }
    }

    @Override
    public void checkCalculator(Person P) {

    }
}
