
/**
 * Write a description of class BallRunner here.
 * 
 * @author Nicole Greenberg 
 * @version Sep. 6
 */
public class BallRunner
{
    // 
    BallWorld ballWorld;
    TGPoint entrancePoint;
    static BallBot[] ballBotArray;

    public BallRunner (BallWorld ballWorld, TGPoint entrancePoint, int ballBotArrayLength){
        ballWorld = ballWorld;
        entrancePoint = entrancePoint;
        ballBotArray = new BallBot[ballBotArrayLength];
    } 

    public int findFreeBallBotIndex (){
        for (int i = 0; i<ballBotArray.length; i ++){
            if (ballBotArray[i] == null){
                return i;

            }
        }
        return ballBotArray.length;
    }

    public static void run() {
        BallWorld ballWorld = new BallWorld (400, 400);
        TGPoint entrancePoint = new TGPoint (0, 0);
        int ballBotArrayLength = 10;
        int ballBotRadius;
        BallRunner ballObject = new BallRunner(ballWorld, entrancePoint, ballBotArrayLength);
        for(int j = 0; j < ballBotArray.length; j++){
            int freeBallBotIndex = ballObject.findFreeBallBotIndex();
            if (freeBallBotIndex < ballBotArrayLength){
                BallBot ballBot = new BallBot(ballWorld, entrancePoint, (int)(Math.random()*360),10);
                ballBotArray[freeBallBotIndex] = ballBot;
            }
        }
        while (1 > 0) {
            for(int index = 0; index < ballBotArray.length; index++){
                if(ballBotArray[index]!= null){
                    if(ballBotArray[index].canMoveForward(ballWorld) == true){
                        ballBotArray[index].moveForward();
                    }else{
                        ballBotArray[index].setHeading((int)(Math.random()*360));
                        ballBotArray[index].moveForward();
                    }
                }
            }
            
        }
    }

    public static void activity1(){
        BallWorld ballWorld = new BallWorld(500, 500);
        TGPoint startPoint = new TGPoint (0,0);
        BallBot ballBot = new BallBot(ballWorld, startPoint, 0, 25);
        while(true){
            if(ballBot.canMoveForward(ballWorld)){
                ballBot.moveForward();
            }else{
                ballBot.setHeading((ballBot.getHeading()+120)%360);
            }
        }
    }

    public double distanceBetweenPoints (TGPoint point1, TGPoint point2){
        double xDiff = point1.x - point2.x;
        double yDiff = point1.y - point2.y;
        return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }

    public boolean entranceClear(){
        for (int i = 0; i<ballBotArray.length; i ++){
            if(ballBotArray[i] !=null){
                if(distanceBetweenPoints(entrancePoint, ballBotArray[i].getPoint()) < 2 * ballBotArray[i].getRadius()){
                    return false;
                }else{
                    return true;
                }
            }
        }
        return false;
    }
    public BallBot ballBotToBounceOff (BallBot ballBot){
        point = ballBot.getPoint();
    }
}
