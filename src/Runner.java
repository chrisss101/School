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
        Algebra alg = new Algebra();
        History his = new History();
        Science sci = new Science();
        English ing = new English();
        startGame(student,theSchool,ing, sci,his, alg);

    }

     public void detectRoom(School theSchool,Person theStudent,English ing,Science sci,History his,Algebra alg) {
        if (theStudent.room == theSchool.theRooms[0]) {
            alg.Question();
            alg.checkCalculator(theStudent);
            alg.checkPencil(theStudent);
        }
       else if (theStudent.room == theSchool.theRooms[1]) {
            his.Question();
            his.checkPencil(theStudent);
        }
        else if (theStudent.room == theSchool.theRooms[4]) {
            ing.Question();
            ing.checkPencil(theStudent);
        }
       else  if (theStudent.room == theSchool.theRooms[3]) {
            sci.Question();
            sci.checkCalculator(theStudent);
        }
    }
     public  void turnLeft(School theSchool,Person student,English ing,Science sci,History his,Algebra alg) {
         int decision = (int)((Math.random() * 1 + 2));
         if (decision == 3) {

             student.changeRoom(theSchool.theRooms[0]);
             detectRoom(theSchool,student,ing,sci,his,alg);


         }
         else if (decision == 2) {
             student.changeRoom(theSchool.theRooms[1]);
             detectRoom(theSchool,student,ing,sci,his,alg);
         }
     }
    public  void turnRight(School theSchool,Person student,English ing,Science sci,History his,Algebra alg) {
        int decision = (int)((Math.random() * 1 + 2));

        if (decision == 3) {
            student.changeRoom(theSchool.theRooms[3]);
            detectRoom(theSchool,student,ing,sci,his,alg);
        }
        else if (decision == 2) {
            student.changeRoom(theSchool.theRooms[4]);
            detectRoom(theSchool,student,ing,sci,his,alg);
        }
    }

    public  void startGame(Person theStudent,School theSchool,English ing,Science sci,History his,Algebra alg){
        Scanner ask = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = ask.nextLine();
        System.out.println("Hello " + name);
        System.out.println("Do you want to go left or right?");
        String choice = ask.nextLine();
        if (choice == "left") {
            turnLeft(theSchool,theStudent, ing,sci,his, alg);
        }
        else {
            turnRight(theSchool,theStudent,ing, sci,his, alg);
        }
        System.out.println("Do you want to go left or right?");
        choice = ask.nextLine();
        if (choice == "left") {
            System.out.println("hey you found your pencil in the door to the room");
            Person.getPencil(true);
            turnLeft(theSchool,theStudent,ing, sci,his, alg);
        }
        else {
            turnRight(theSchool,theStudent,ing, sci,his, alg);
        }
        System.out.println("Do you want to go left or right?");
        choice = ask.nextLine();
        if (choice == "left") {
            turnLeft(theSchool,theStudent,ing, sci,his, alg);
        }
        else {
            turnRight(theSchool,theStudent,ing, sci,his, alg);
        }
    }



}
