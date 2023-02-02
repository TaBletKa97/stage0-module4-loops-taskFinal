package school.mjc.stage0.loops.finalTask;

public class HalfPyramid {
    public void printHalfPyramid(int cathetusLength) {
        for (int i = 1; i <= cathetusLength; i++) {
            int spaces = 0;
            for (int j = i; j <= cathetusLength - 1; j++) {
                System.out.print(" ");
                spaces++;
            }
            for (int j = 0; j < cathetusLength - spaces; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        new HalfPyramid().printHalfPyramid(8);
    }
}
