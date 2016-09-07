
/**
 * Write a description of class BallRunner here.
 * 
 * @author Nicole Greenberg 
 * @version Sep. 6
 */
public class BallRunner
{
    public static void run () {
        BallWorld ballWorld = new BallWorld (200, 200);
        TGPoint startPoint = new TGPoint (0, 0);
        BallBot ballOne = new BallBot (ballWorld, startPoint, 0, 15);
        int testTrue = 3;
        while (testTrue > 0) {
            if (ballOne.canMoveForward(ballWorld)){
                ballOne.moveForward ();
    }
    else {
        ballOne.setHeading ((ballOne.getHeading()+125)%360);
    }
}
}
}
  