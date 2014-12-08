/**
 * An Athlete is a robot that can also turn right and turn around.
 * By default, athletes are constructed at location 1,1 
 * facing North and holding an infinite supply of beepers.
 * 
 * @author <Your Name here>  // replace <...> with your name
 * @version <date/of/completion> // replace <...> with the date
 *
 */

import edu.fcps.karel2.Robot;
import edu.fcps.karel2.Display;

public class Athlete extends Robot {
	

   public Athlete()
  {
     super(1, 1, Display.NORTH, Display.INFINITY);
  }
   public Athlete(int x, int y, int dir, int beep)
  {
     super(x, y, dir, beep);
  }
   public void turnAround()
  {
   turnLeft();
   turnLeft();
  }
   public void turnRight()
  {
   turnLeft();
   turnLeft();
   turnLeft();
  
   }
}
