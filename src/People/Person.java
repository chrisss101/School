package People;

import Rooms.Room;

public class Person {
    public  int grade;
    public  boolean pencil;
    public  boolean calculator;
    public  Room room;

    public void changeRoom(Room room) {
        this.room = room;
    }
    public  void getCalc(boolean calc) {
        calculator = calc;
    }
    public  void getPencil(boolean pencil) {
        pencil = pencil;
    }
    public void changeGrade(int improv) {
        this.grade += improv;
    }
    public Person(boolean calculator,boolean pencil,int grade) {
        this.calculator = calculator;
        this.pencil = pencil;
        this.grade = grade;

    }
}
