package People;

public class Person {
    public static int grade;
    public static boolean pencil;
    public static boolean calculator;
    public static String room;

    public void changeRoom(String room) {
        this.room = room;
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
