package school.mjc.stage0.loops.finalTask;

public class Pyramid {
    public void printHalfPyramid(int cathetusLength) {
        int len = cathetusLength * 2 - 1;
        int k = cathetusLength - 1;
        for (int i=0; i<cathetusLength; i++){
            System.out.print(" ");
            for (int j=0; j<len; j++){
                if (k <= j && j <= len - k - 1){
                    System.out.print(getN(cathetusLength, j));
                }else System.out.print(" ");
            }
            k--;
            System.out.println();
        }
    }

    public static int getN(int half, int curr){
        if (curr < half)
            return half - curr;
        else
            return curr - half + 2;
    }

    public static void main(String[] args) {
        new Pyramid().printHalfPyramid(7);
    }
}
