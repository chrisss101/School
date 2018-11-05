package People;

public class Person {
    public static int grade;
    public boolean pencil;
    public boolean calculator;
    public static String room;

    public void changeRoom(String room) {
        this.room = room;
    }
    public void getCalc(boolean calc) {
        this.calculator = calc;
    }
    public void getPencil(boolean pencil) {
        this.pencil = pencil;
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
