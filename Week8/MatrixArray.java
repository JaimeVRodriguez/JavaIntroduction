public class MatrixArray {

    public static void main(String[] args) {

        int[][] array = getArray();

        System.out.println("The array is: ");
        displayArray(array);

        System.out.println("The largest row index: " + maxRow(array));
        System.out.println("The largest column index: " + maxColumn(array));

    }
    
    public static int [][] getArray(){
        int [][] array = new int[4][4];
        for (int row = 0; row < array.length; row++) {
            for (int column = 0; column < array[row].length; column++) {
                array[row][column] = (int) (Math.random() * 2);
            }
        }
        return array;
    }

    public static void displayArray(int [][] array){
        for(int i=0; i<array.length; i++){
            for(int j=0; j<array[i].length; j++){
                System.out.print(array[i][j]);
            }
            System.out.println();
        }

    }

    public static int maxRow(int[][] array){
        int maxRow = 0;
        int max = 0;
        for (int row = 0; row < array.length; row++) {
            int count = 0;
            for (int column = 0; column < array[row].length; column++) {
                if (array[row][column] == 1)
                    count++;
            }
            if (count > max) {
                max = count;
                maxRow = row;
            }
        }
        return maxRow;
    }

    public static int maxColumn(int[][] array){
        int maxColumn = 0;
        int max = 0;
        for (int column = 0; column <array[0].length; column++) {
            int count = 0;
            for (int row = 0; row < array.length; row++) {
                if (array[row][column] == 1)
                    count++;
            }
            if (count > max) {
                max = count;
                maxColumn = column;
            }
        }
        return maxColumn;
    }
}
