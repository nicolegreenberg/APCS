
/**
 * Write a description of class MazeWalker here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MazeWalker
{
   
    public static void run()
    {
        Maze maze = new Maze();
        MazeWalker mazeWalker = new MazeWalker();
        mazeWalker.walkMaze(maze.getMazeBot());
    }


    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class MazeWalker
     */
    public MazeWalker()
    {
        // initialise instance variables
        x = 0;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }
    public void walkMaze(MazeBot mazeBot) {
        // Your instructions go here
        while (mazeBot.canMoveForward()){
            mazeBot.moveForward();
            if (mazeBot.canMoveForward() == false){
                mazeBot.turnRight();
                if (mazeBot.canMoveForward() == false){
                    mazeBot.turnLeft();
                    mazeBot.turnLeft();
        }
    }
}
       
        if (mazeBot.didReachGoal()) {
            mazeBot.signalSuccess();
        }
        else if (mazeBot.didNotReachGoal()){
            mazeBot.signalError();
        }
    }
}
