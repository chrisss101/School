package Rooms;
import People.Person;

public class History implements Rooms.Room {
    @Override
    public Boolean Question() {
        return null;
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

    }
}
