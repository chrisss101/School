import People.Person;
import Rooms.History;
import Rooms.Algebra;
import Rooms.Science;
import Rooms.English;
import Rooms.Room;
import Base.School;

import java.util.Scanner;

public class Runner {
    public  void main(String[] args) {
        School theSchool = new School();
        Person student = new Person(false,false,80);

    }

     public void detectRoom() {
        if (Person.room == "Algebra") {
            Algebra.Question();
            Algebra.checkCalculator();
            Algebra.checkPencil();
        }
       else if (Person.room == "History") {
            History.Question();
            History.checkPencil();
        }
        else if (Person.room == "English") {
            English.Question();
            English.checkPencil();
        }
       else  if (Person.room == "Science") {
            Science.Question();
            Science.checkCalculator();
        }
    }
     public  void turnLeft() {
         int decision = (int)((Math.random() * 1 + 2));
         if (decision == 3) {
             Person.room = "Algebra";
             detectRoom();


         }
         else if (decision == 2) {
             Person.room = "History";
             detectRoom();
         }
     }
    public  void turnRight() {
        int decision = (int)((Math.random() * 1 + 2));

        if (decision == 3) {
            Person.room = "English";
            detectRoom();
        }
        else if (decision == 2) {
            Person.room = "Science";
            detectRoom();
        }
    }

    public  void startGame(){
        Scanner ask = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = ask.nextLine();
        System.out.println("Hello " + name);
        System.out.println("Do you want to go left or right?");
        String choice = ask.nextLine();
        if (choice == "left") {
            turnLeft();
        }
        else {
            turnRight();
        }
        System.out.println("Do you want to go left or right?");
        choice = ask.nextLine();
        if (choice == "left") {
            System.out.println("hey you found your pencil in the door to the room");
            Person.getPencil(true);
            turnLeft();
        }
        else {
            turnRight();
        }
        System.out.println("Do you want to go left or right?");
        choice = ask.nextLine();
        if (choice == "left") {
            turnLeft();
        }
        else {
            turnRight();
        }
    }



}
