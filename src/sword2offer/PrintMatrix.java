package sword2offer;

import java.util.ArrayList;

public class PrintMatrix {
    public ArrayList<Integer> printMatrix(int [][] matrix) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        int rows = matrix.length;
        int cols = matrix[0].length;
        int start = 0;

        while (rows>=1&&cols>=1){
            if(cols==1){
                for (int i = start; i < rows+start; i++) {
                    arrayList.add(matrix[i][start]);
                }
                return arrayList;
            }
            if(rows==1){
                for (int i = start; i < cols+start; i++) {
                    arrayList.add(matrix[start][i]);
                }
                return arrayList;
            }
            for (int i = start; i < cols+start; i++) {
                arrayList.add(matrix[start][i]);
            }
            for(int i = start+1;i < rows+start;i++){
                arrayList.add(matrix[i][cols+start-1]);
            }
            for (int i = cols+start-1-1; i >=start ; i--) {
                arrayList.add(matrix[rows+start-1][i]);
            }
            for(int i = start+rows-1-1;i >=start+1;i--){
                arrayList.add(matrix[i][start]);
            }
            rows=rows-2;
            cols=cols-2;
            System.out.println("rows:"+rows);
            System.out.println("cols:"+cols);
            System.out.println(arrayList);
            start++;
        }

        return arrayList;
    }
}
