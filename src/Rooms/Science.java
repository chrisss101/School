package Rooms;

import People.Person;

import java.util.Scanner;



public class Science implements Room  {
    @Override
    public  void Question(Person P) {

        Scanner Nteacher = new Scanner(System.in);
        System.out.println("You walked into the Science room");
        System.out.println("what is the average human lifespan?");
        String answer = Nteacher.nextLine();
        if (answer.equals("72")) {
            P.grade += 10;
            System.out.println("Correct, your grade increased by 10 points");
        }
        else {
            P.grade -= 10;
            System.out.println("Wrong, your grade decreased by 10 points");
        }
    }

    @Override
    public void checkPencil(Person P) {

    }


    //@Override
        public  void checkCalculator(Person P) {
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
