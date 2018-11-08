import People.Person;
import Rooms.History;
import Rooms.Algebra;
import Rooms.Science;
import Rooms.English;
import Rooms.Room;
import Base.School;

import java.util.Scanner;

public class Runner {
    public  static void main(String[] args) {
        School theSchool = new School();
        Person student = new Person(false,false,80);
        Algebra alg = new Algebra();
        History his = new History();
        Science sci = new Science();
        English ing = new English();
        startGame(student,theSchool,ing, sci,his, alg);

    }

     public static void detectRoom(Person theStudent,School theSchool,English ing,Science sci,History his,Algebra alg) {
        if (theStudent.room == theSchool.theRooms[0]) {
            alg.Question();
            alg.checkCalculator(theStudent);
            alg.checkPencil(theStudent);
        }
       else if (theStudent.room == theSchool.theRooms[1]) {
            his.Question();
            his.checkPencil(theStudent);
        }
        else if (theStudent.room == theSchool.theRooms[3]) {
            ing.Question();
            ing.checkPencil(theStudent);
        }
       else  if (theStudent.room == theSchool.theRooms[2]) {
            sci.Question();
            sci.checkCalculator(theStudent);
        }
    }
     public  static void turnLeft(Person student, School theSchool,English ing,Science sci,History his,Algebra alg) {
         int decision = (int)((Math.random() * 1 + 2));
         if (decision == 3) {

             student.changeRoom(theSchool.theRooms[0]);
             detectRoom(student,theSchool,ing,sci,his,alg);


         }
         else if (decision == 2) {
             student.changeRoom(theSchool.theRooms[1]);
             detectRoom(student,theSchool,ing,sci,his,alg);
         }
     }
    public  static void turnRight(Person student, School theSchool,English ing,Science sci,History his,Algebra alg) {
        int decision = (int)((Math.random() * 1 + 2));

        if (decision == 3) {
            student.changeRoom(theSchool.theRooms[3]);
            detectRoom(student,theSchool,ing,sci,his,alg);
        }
        else if (decision == 2) {
            student.changeRoom(theSchool.theRooms[4]);
            detectRoom(student,theSchool,ing,sci,his,alg);
        }
    }

    public  static void startGame(Person theStudent,School theSchool,English ing,Science sci,History his,Algebra alg){
        Scanner ask = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = ask.nextLine();
        System.out.println("Hello " + name);
        System.out.println("Do you want to go left or right?");
        String choice = ask.nextLine();
        if (choice == "left") {
            turnLeft(theStudent,theSchool, ing,sci,his, alg);
        }
        else {
            turnRight(theStudent,theSchool,ing, sci,his, alg);
        }
        System.out.println("Do you want to go left or right?");
        choice = ask.nextLine();
        if (choice == "left") {
            System.out.println("hey you found your pencil in the door to the room");
            Person.getPencil(true);
            turnLeft(theStudent,theSchool, ing,sci,his, alg);
        }
        else {
            turnRight(theStudent,theSchool,ing, sci,his, alg);
        }
        System.out.println("Do you want to go left or right?");
        choice = ask.nextLine();
        if (choice == "left") {
            turnLeft(theStudent,theSchool, ing,sci,his, alg);
        }
        else {
            turnRight(theStudent,theSchool,ing, sci,his, alg);
        }
    }



}
