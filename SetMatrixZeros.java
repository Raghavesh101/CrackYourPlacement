package DSA.ArshGoyalSheet;

public class SetMatrixZeros {

    public void markRows(int[][] matrix, int i, int cols){
        for(int k = 0; k < cols; k++){
            if(matrix[i][k] != 0){
                matrix[i][k] = -10;
            }
        }
    }

    public void markCols(int[][] matrix, int j, int rows){
        for(int k = 0; k< rows; k++){
            if(matrix[k][j] != 0){
                matrix[k][j] = -10;
            }
        }
    }

    public void setZeroes(int[][] matrix) {
        int cols = matrix[0].length;
        int rows = matrix.length;

        for(int i = 0; i<rows; i++){
            for(int j = 0; j<cols; j++){
                if(matrix[i][j] == 0){
                    markRows(matrix, i, cols);
                    markCols(matrix, j, rows);
                }
            }
        }

        for(int i = 0; i < rows; i++){
            for(int j= 0; j< cols; j++){
                if(matrix[i][j]== -10){
                    matrix[i][j] = 0;
                }
            }
        }

    }
}
