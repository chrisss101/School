import People.Person;

public class Runner {
    public Person Student = new Person(false,false,80,"hallway");
    public static void turnLeft() {
        int decision = booleanToInt((Math.random() * 1 + 2));
        if (decision == 1) {
             
        }
         else if (decision == 2) {
             
        }
    }
     public static void turnRight() {
        int decision = (Math.random() * 1 + 2).toInteger;
        if (decision == 1) {
            
        }
         else if (decision == 2) {
             
        }
    }
    public static int booleanToInt(boolean value) {
        // Convert true to 1 and false to 0.
        return value ? 1 : 0;
    }

}
