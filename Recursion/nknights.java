import java.util.*;

public class nknights {
    static int count = 0;

    private static boolean knightIsSafe(boolean[][] chess, int row, int col) {
        int[][] dir = { { 0, -1 }, // nrth
                { 2, -1 }, // north east
                { 2, 1 }, // east
                { 1, 2 }, // se
                { -1, 2 }, // south
                { -2, 1 }, // sw
                { -2, -1 }, // w
                { -1, -2 }, // nw
        };
        for (int di = 0; di < dir.length; di++) {

            int ekcol = col + dir[di][0];
            int ekrow = row + dir[di][1];
            if (ekcol < 0 || ekrow < 0 || ekcol >= chess[0].length || ekrow >= chess.length) {
                continue;
            }
            if (chess[ekrow][ekcol] == true) {
                return false;
            }

        }
        return true;
    }

    public static void nknights(boolean[][] chess, int qsf, String asf, int box) {
        if (qsf == chess.length) {
            count++;
            System.out.println(count + ". " + asf);
            return;
        }

        for (int b = box + 1; b < chess.length* chess[0].length; b++) {
            int row = b / chess.length;
            int col = b % chess.length;
            if (chess[row][col] == false) {
                if (knightIsSafe(chess, row, col) == true) {
                    chess[row][col] = true;
                    nknights(chess, qsf + 1, asf + "q" + (qsf + 1) + "b" + b + " ", b);
                    chess[row][col] = false;
                }

            }
        }
    }

    public static void main(String args[]) {
        boolean[][] chess = new boolean[4][4];
        nknights(chess, 0, "", -1);
    }

}