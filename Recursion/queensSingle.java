import java.util.*;

public class queensSingle {
    static int count = 0;

    public static void permutQueens(boolean[] box, int tq, int qpsf, String asf) {
        if (qpsf == tq) {
            count++;
            System.out.println(count + ". " + asf);
            return;
        }
        for (int b = 0; b < box.length; b++) {
            if (box[b] == false) {
                box[b] = true;
                permutQueens(box, tq, qpsf + 1, asf + "q" + (qpsf + 1) + "b" + b);
                box[b] = false;
            }
        }
    }

    public static void combQueens(boolean[] box, int tq, int qpsf, String asf, int lqb) {
        if (qpsf == tq) {
            count++;
            System.out.println(count + ". " + asf);
            return;
        }
        for (int b = lqb + 1; b < box.length; b++) {
            if (box[b] == false) {
                box[b] = true;
                combQueens(box, tq, qpsf + 1, asf + "q" + (qpsf + 1) + "b" + b, b);
                box[b] = false;
            }
        }
    }

    public static void main(String args[]) {
        boolean box[] = new boolean[4];
        int tq = 2;
        combQueens(box, tq, 0, "",-1);
    }

}