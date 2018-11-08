package People;

import Rooms.Room;

public class Person {
    public static int grade;
    public static boolean pencil;
    public static boolean calculator;
    public static Room room;

    public static void changeRoom(Room room) {
        room = room;
    }
    public static void getCalc(boolean calc) {
        calculator = calc;
    }
    public static void getPencil(boolean pencil) {
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
