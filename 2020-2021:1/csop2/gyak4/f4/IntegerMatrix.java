public class IntegerMatrix {
    private Integer[][] data;

    public IntegerMatrix(int rowNum, int colNum, Integer[] linearData) {
        data = new Integer[rowNum][colNum];
        for(int i=0 ; i<linearData.length; i++) {
            int row = (int) Math.floor(i/colNum);
            int col = i%colNum;
            data[row][col] = linearData[i];
        }
    }
    
    //clean and efficient way to achieve desired String result
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        String rowDel = "";
        String colDel = "";
        for (Integer[] integers : data) { //foreach or enhanced for loop
            sb.append(rowDel);
            rowDel = ";";
            for (Integer integer : integers) {
                sb.append(colDel);
                colDel = ",";
                sb.append(integer);
            }
            colDel = "";
        }
        return sb.toString();
    }

    //not memory efficient (in loops there is no implicit conversion from String concatenation to a StringBuilder) 
    //and not too readable code
    public String toString1(){
        
        String s = "";

        // első sor
        if(data.length < 1) return s;

        // első sor első elem
        s += data[0].length < 1 ? "" : data[0][0]; 

        // első sor többi elem
        for(int j=1; j<data[0].length; j++){
            s += "," + data[0][j]; 
        }

        // többi sor
        for(int i=1; i<data.length; i++){
            s += ";";

            // i-edik sor első elem
            s += data[i].length < 1 ? "" : data[i][0]; 
            // i-edik sor többi elem
            for(int j=1; j<data[i].length; j++){
                s += "," + data[i][j]; 
            }
        }

        return s;
    }

    //not memory efficient either
    public String toString2(){
        String s = "";
        String rowDelim = "";
        String colDelim = "";

        for(Integer[] row : data){
            s += rowDelim;
            rowDelim = ";";
            for(Integer elem :row){
                s += colDelim;
                colDelim = ",";
                s += elem;
            }
            colDelim = "";
        }
        return s;
    }
}