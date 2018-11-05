package Rooms;


import People.Person;

import java.util.Scanner;

public class Algebra implements Rooms.Room  {


    @Override
    public  void Question() {
        Scanner Mteacher = new Scanner(System.in);
        System.out.println("What is the square root of 100?");
        String answer = Mteacher.nextLine();
        if (answer == "10") {
            Person.grade += 10;
        }
        else {
            Person.grade -= 10;
        }

    }

    @Override
    public void checkPencil(Person P) {
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
        if (P.calculator == true) {
            P.grade += 10;
            System.out.println("You have your calculator");
        }
        else {
            P.grade -= 10;
            System.out.println("You seem to have lost your calculator");
        }
    }
}
