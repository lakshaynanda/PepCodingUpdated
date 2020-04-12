import java.util.*;

public class nqueenss {
    static int count = 0;

    private static boolean queenIssafe(int row, int col, boolean[][] chess) {
        int[][] dir = { { 0, -1 }, // nrth
                { 1, -1 }, // north east
                { 1, 0 }, // east
                { 1, 1 }, // se
                { 0, 1 }, // south
                { -1, 1 }, // sw
                { -1, 0 }, // w
                { -1, -1 }, // nw
        };
        for (int di = 0; di < dir.length; di++) {
            for (int dis = 1; true; dis++) {
                int eqcol = col + dis * dir[di][0];
                int eqrow = row + dis * dir[di][1];
                if (eqcol < 0 || eqrow < 0 || eqcol >= chess[0].length || eqrow >= chess.length) {
                    break;
                }
                if (chess[eqrow][eqcol] == true) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void nqueensubs(boolean[][] chess, int box, int qpsf, String asf) {
        if (qpsf == chess.length) {
            count++;
            System.out.println(count + ". " + asf);
            return;
        }
        if (box >= chess.length * chess.length) {
            return;
        }
        nqueensubs(chess, box + 1, qpsf, asf);
        int row = box / chess.length;
        int col = box % chess.length;
        if (chess[row][col] == false) {
            if (queenIssafe(row, col, chess) == true) {
                chess[row][col]=true;
                nqueensubs(chess, box + 1, qpsf, asf + "q" + (qpsf + 1) + "b" + box + " ");
                chess[row][col]=false;
            }
        }
    }

    public static void main(String args[]) {
        boolean[][] chess = new boolean[2][2];
        nqueensubs(chess, 0, 0, "");
    }

}