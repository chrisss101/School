import People.Person;
import Rooms.History;
import Rooms.Algebra;
import Rooms.Science;
import Rooms.English;

import java.util.Scanner;

public class Runner {

    public static void turnLeft() {
        int decision = (int)((Math.random() * 1 + 2));
        if (decision == 3) {
            History.Question();

        }
         else if (decision == 2) {
            Algebra.Question();
        }
    }
     public static void turnRight() {
        int decision = (int)((Math.random() * 1 + 2));

         if (decision == 3) {
             Science.Question();
        }
         else if (decision == 2) {
             English.Question();
        }
    }
     /*/public  void detectRoom() {
        if (Person.room == "Algebra") {
            Algebra.Question();
        }
        if (Person.room == "History") {
            History.Question();
        }
        if (Person.room == "English") {
            English.Question();
        }
        if (Person.room == "Science") {
            Science.Question();
        }
    }/*/
    public static void main(String[] args) {
        School theSchool = new School();
        Person student = new Person(false,false,80);
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
            Person.getPencil();
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
