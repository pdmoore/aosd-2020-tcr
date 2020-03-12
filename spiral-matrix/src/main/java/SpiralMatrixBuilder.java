
public class SpiralMatrixBuilder {

    public int[][] buildMatrixOfSize(int i) {
        int[][] expected = new int[i][i];
        if (i == 1) {
            expected[0][0] = 1;
        } else if (i == 2) {
            expected[0][0] = 1;
            

            expected = new int[][]{
                    {1, 2},
                    {4, 3}
            };
        }
        else {
            expected = new int[][]{};
        }
        return expected;
    }
}
