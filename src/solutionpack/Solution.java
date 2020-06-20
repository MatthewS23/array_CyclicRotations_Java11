package solutionpack;

public class Solution {
    public static int[] solution(int[] A, int K) {

        int[] filler = new int[A.length];
        for (int i =0; i < A.length; i++){
            filler[i] = A[i];
            System.out.println("The filler array at i: " + filler[i]);
        }
        //Adding Rotations:
        for (int z = 1; z < K; z++){
            for (int y = A.length - 1; y >0; y--){
//            System.out.println("Y : " + filler[y]);
//            System.out.println("Y - 1: " + filler[y-1]);
                int temp = filler[y];
                filler[y] = filler[y-1];
                filler[y-1] = temp;
            }
        }

        System.out.println(filler);
        toooString(filler);
        //CHANGE
        return filler;
    }

    public static void toooString(int[] arrayR){
        for(int i = 0; i < arrayR.length; i++){
            System.out.println("The newly assorted ray is: " + arrayR[i]);
        }
    }

}
