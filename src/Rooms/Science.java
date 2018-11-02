package Rooms;

import People.Person;

public class Science implements Room {
    @Override
    public Boolean Question() {

        return null;
    }

    @Override
    public void checkPencil(Person P) {

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
