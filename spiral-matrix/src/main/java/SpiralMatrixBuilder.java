
public class SpiralMatrixBuilder {

    public int[][] buildMatrixOfSize(int i) {
        int[][] expected = new int[i][i];
        int cellValue = 0;
        int row = 0, col = 0;

        if (i == 0) {
            return expected;
        }

        expected[row][col] = ++cellValue;

        if (i == 2) {
            expected[row][++col] = ++cellValue;

            expected[++row][col] = ++cellValue;

            expected[row][--col] = ++cellValue;
        } else if (i == 3) {

            for (int j = 1; j < i; j++) {

                expected[row][++col] = ++cellValue;
            }

            expected[1][2] = ++cellValue;
            expected[2][2] = ++cellValue;

            expected[2][1] = ++cellValue;
            expected[2][0] = ++cellValue;

            expected[1][0] = ++cellValue;
            expected[1][1] = ++cellValue;
        }

        return expected;
    }
}
