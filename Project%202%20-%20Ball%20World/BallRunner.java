
/**
 * Write a description of class BallRunner here.
 * 
 * Nicole Greenberg
 * @version Sept. 6
 */
public class BallRunner
{
     BallWorld ballWorld;
     TGPoint entrancePoint;
     BallBot[] ballBotArray;
     
     public BallRunner (BallWorld ballWorld, TGPoint entrancePoint, int ballBotArrayLength) {
         BallBot[] ballBotArray = new BallBot [ballBotArrayLength - 1];
         
        }
    public int findFreeBallBotIndex (){
        for (int i = 0; i < ballBotArray.length; i++){
            if( ballBotArray [i] == null) {
                return i;
    }
    return ballBotArray.length;
}
}

    public static void activity1 () {
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