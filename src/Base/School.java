package Base;

import Rooms.*;

public class School {

    public Room[] theRooms = new Room[4];
   public  School() {
       theRooms[0] = new Algebra();
       theRooms[1] = new History();
       theRooms[2] = new Science();
       theRooms[3] = new English();
   }
    /*/Algebra alg = new Algebra();
    History his = new History();
    Science sci = new Science();
    English ing = new English();/*/
}
