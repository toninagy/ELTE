// single-line comment
/* multi-line comment
*/

/**
 * @author author_name
 * @since 2.0
 * @version 2.0
 */
public class IntegerMatrix {
    private int rowNum;
    private int colNum;
    private int[][] data;

    /**
     * <p>Store the given 1D array as a matrix.</p>
     * @param rowNum number of rows
     * @param colNum number of coloumns
     * @param linearData integers stored in 1D array
     * @since 1.0
     */
    public IntegerMatrix(int rowNum, int colNum, int[] linearData){
        
    }

    /**
     * <p>Converts the matrix elements to string with proper formatting,
     * uses StringBuilder for better performance.</p>
     * @return the matrix items converted to String
     * @since 2.0
     */
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        String rowDelim = "";
        String colDelim = "";

        for(int[] row : data){
            sb.append(rowDelim);
            rowDelim = ";";
            for(int elem : row){
                sb.append(colDelim);
                colDelim = ",";
                sb.append(elem);
            }
            colDelim = "";
        }

        return sb.toString();
    }
}