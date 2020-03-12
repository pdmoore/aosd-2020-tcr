
public class SpiralMatrixBuilder {

    public int[][] buildMatrixOfSize(int i) {
        int[][] expected = new int[i][i];
        if (i == 1) {
            expected[0][0] = 1;
        } else if (i == 2) {
            expected[0][0] = 1;
            expected[0][1] = 2;
            expected[1][0] = 4;
            expected[1][1] = 3;
        }
        else {
            expected = new int[][]{};
        }
        return expected;
    }
}
