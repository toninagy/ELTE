public class IntegerMatrix {
    private int rowNum;
    private int colNum;
    private int[][] data;

    public IntegerMatrix(int rowNum, int colNum, int[] linearData) {
        if(rowNum * colNum != linearData.length) {
            throw new IllegalArgumentException("rowNum * colNum != linearData.length");
        }
        this.rowNum = rowNum;
        this.colNum = colNum;
        data = new int[rowNum][colNum];
        // int c = 0;
        for(int i=0;i<rowNum; i++) {
            for(int j=0; j<colNum; j++) {
                System.out.println(data[i][j]);
                // data[i][j] = linearData[c++];
            }
        }
        for(int i=0; i<linearData.length; i++) {
            int row = (int) Math.floor(i / colNum);
            int col = i % colNum;
            data[row][col] = linearData[i];
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        String rowDelim = "";
        String colDelim = "";

        for(int[] row : data) {
            sb.append(rowDelim);
            rowDelim = ";";
            for(int elem : row) {
                sb.append(colDelim);
                colDelim = ",";
                sb.append(elem);
            }
            colDelim = "";
        }

        return sb.toString();
    }
}