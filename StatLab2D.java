
/**
 * Write a description of class StatLab here.
 * 
 * Nicole Greenberg 
 * Sept. 28
 */

import java.util.Arrays;
public class StatLab2D
{
    private int[][] tums;
    private int[] nums;
    public static void main(String [] args){
        int gap[][] = new int[3][4];
        StatLab2D sl = new StatLab2D(gap);
        sl.loadRandom2D();
        sl.printArray2D();
        sl.sortArray2D();
        sl.printArray();
        System.out.println("\n" + "The mean is" + sl.getMean2D());
    }
    public StatLab2D(int[][] tum){
        tums = tum;
        nums = new int[tums.length * tums[0].length];
    }

    public void loadRandom2D(){

        for (int i = 0; i < tums.length; i++) {
            for(int j = 0; j < tums[i].length; j++){
                tums[i][j] = (int)((Math.random()* 10) + 1);
            }
        }
    }

    public void printArray2D(){
        for (int k = 0; k < tums.length; k++) {
            for(int l = 0; l < tums[k].length; l++){
                System.out.print(tums[k][l] + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }

    public void sortArray2D(){
        int m = 0;
        for(int o = 0; o < tums.length; o++){
            for(int p = 0; p < tums[0].length; p++){
                nums[m] = tums[o][p];
                m++;
            }
        }
        Arrays.sort(nums);
    }

    public void printArray(){
        for (int q = 0; q < nums.length; q++) {
            System.out.print(nums[q] + "\t");
            if((q + 1)% 5 == 0) {
                System.out.println();
            }
        }
    }

    public double getMean2D() {
        int add = 0;
        for(int s = 0; s < tums.length; s++){
            for(int t = 0; t < tums[s].length; t++){
                add += tums[s][t];
            }
        }
        return ((double)(add)) / ((double)(tums.length * tums[0].length));
    }
}
