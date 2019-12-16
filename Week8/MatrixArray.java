public class MatrixArray {

    public static void main(String[] args) {

        int[][] array = new int[4][4];

        for(int i=0; i<array.length; i++){
            for(int j=0; j<array[i].length; j++){
                array[i][j]=(int)(Math.random()*2);
            }
        }

        System.out.println("The array is: ");
        displayArray(array);

        System.out.println("The largest row index: " + rowIndex(array) );
        System.out.println("The largest column index: " + columnIndex(array));

    }

    public static void displayArray(int [][] array){
        for(int i=0; i<array.length; i++){
            for(int j=0; j<array[i].length; j++){
                System.out.print(array[i][j]);
            }
            System.out.println();
        }

    }

    public static int rowIndex(int[][] a){

    }

    public static int columnIndex(int[][] a){

    }
}
