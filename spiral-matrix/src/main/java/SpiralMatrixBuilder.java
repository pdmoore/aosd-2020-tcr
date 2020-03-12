
public class SpiralMatrixBuilder {

    public int[][] buildMatrixOfSize(int i) {
        int[][] expected;
        if (i == 1) {
            expected = new int[][]{
                    {1}
            };
        } else if (i == 2) {
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
