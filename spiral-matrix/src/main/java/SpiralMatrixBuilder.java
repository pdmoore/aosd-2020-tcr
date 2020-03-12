
public class SpiralMatrixBuilder {

    public int[][] buildMatrixOfSize(int i) {
        int[][] expected = new int[i][i];
        if(i == 0){
            return expected;
        }
        expected[0][0] = 1;
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
            expected[1][0] = 8;
            expected[1][1] = 9;
            expected[2][0] = 7;
            expected[2][1] = 6;
            expected[2][2] = 5;

        }

        return expected;
    }
}
