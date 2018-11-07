package Rooms;

import People.Person;

import java.util.Scanner;

public class English implements Room{
    @Override
    public  void Question() {
        Scanner Mteacher = new Scanner(System.in);
        System.out.println("How many syllables does Valentine have?");
        String answer = Mteacher.nextLine();
        if (answer == "3") {
            Person.grade += 10;
            System.out.println("Correct, your grade increased by 10 points");
        }
        else {
            Person.grade -= 10;
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
            System.out.println("You seem to have lost your pencil");
        }
    }

    @Override
    public void checkCalculator(Person P) {

    }
}
