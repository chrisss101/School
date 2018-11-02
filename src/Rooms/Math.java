package Rooms;


import People.Person;

public class Math implements Rooms.Room  {


    @Override
    public Boolean Question() {
        System.out.println("What is the square root of 100");
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
