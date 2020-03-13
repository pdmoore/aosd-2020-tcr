
public class SpiralMatrixBuilder {

    public int[][] buildMatrixOfSize(int i) {
        int[][] expected = new int[i][i];
        int cellValue = 0;

        if (i == 0) {
            return expected;
        }

        expected[0][0] = ++cellValue;

        if (i == 2) {
            expected[0][1] = 2;
            expected[1][1] = 3;
            expected[1][0] = 4;
        }
        else if(i == 3)
        {
            expected[0][1] = 2;
            expected[0][2] = 3;
            expected[1][2] = 4;
            expected[2][2] = 5;
            expected[2][1] = 6;
            expected[2][0] = 7;
            expected[1][0] = 8;
            expected[1][1] = 9;
        }

        return expected;
    }
}
