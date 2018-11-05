import Rooms.*;

public class School {

    Room[] theRooms = new Room[4];
   public School() {
       theRooms[0] = new Algebra();
       theRooms[1] = new History();
       theRooms[3] = new Science();
       theRooms[4] = new English();
   }
}
