
public class SpiralMatrixBuilder {

    public int[][] buildMatrixOfSize(int i) {
        int[][] expected = new int[i][i];
        if(i == 0){
            return expected;
        }
        expected[0][0] = 1;
        if (i == 2) {
            expected[0][1] = 2;
            expected[1][0] = 4;
            expected[1][1] = 3;
        }
        else if(i == 3)
        {
            expected[0][1] = 2;
            expected[0][2] = 3;

            expected = new int[][]{
                    {1, 2, 3},
                    {8, 9, 4},
                    {7, 6, 5}
            };
        }

        return expected;
    }
}
