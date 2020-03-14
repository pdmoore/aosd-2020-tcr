
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

//            [0][1]
//            [0][2]
            for (int j = col + 1; j < i; j++) {
                expected[row][++col] = ++cellValue;
            }

//            [1][2]
//            [2][2]
            for (int j = row + 1; j < i; j++) {
                expected[++row][col] = ++cellValue;
            }

//            [2][1]
//            [2][0]
            for (int j = col; j > 0; j--) {
                expected[row][--col] = ++cellValue;
            }

//            [1][0]
            for (int j = row; j > 1; j--) {
                expected[--row][col] = ++cellValue;
            }


            // TODO this starts to duplicate the sequence from line 25.
            // but move in the for loop boundary by one (-1) from the right
//            [1][1]
            for (int j = col + 1; j < i - 1; j++) {
                expected[row][++col] = ++cellValue;
            }
        }

        return expected;
    }
}
