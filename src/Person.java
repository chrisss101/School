public class Person {
    public int grade;
    public boolean pencil;
    public boolean calculator;
    public String room;

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
    public Person(boolean calculator,boolean pencil,int grade,String room) {
        this.calculator = calculator;
        this.pencil = pencil;
        this.grade = grade;
        this.room = room;
    }
}
