import People.Person;

public class Runner {
    public Person Student = new Person(false,false,80,"hallway");
    public static void turnLeft() {
        int decision = booleanToInt((Math.random() * 1 + 2));
        if (decision == 1) {
             changeRoom("Math");
        }
         else if (decision == 2) {
             changeRoom("English");
        }
    }
     public static void turnRight() {
        int decision = (Math.random() * 1 + 2);
        if (decision == 1) {
            changeRoom("History");
        }
         else if (decision == 2) {
             changeRoom("Science");
        }
    }
    public static int booleanToInt(boolean value) {
        // Convert true to 1 and false to 0.
        return value ? 1 : 0;
    }
    Scanner ask = new Scanner(System.in); 
    System.out.println("What is your name?");
    String name = ask.nextLine();
    System.out.println("Heallo " + name);

}
