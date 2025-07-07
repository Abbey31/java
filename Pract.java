


public class Pract{
    public static void main(String[] args) {
        int[][] dataUse = {{2,4,6,8},{3,5,7,9}};
               
        for (int row = 0; row < dataUse.length; row++){ 
            System.out.printf("Row%d: ", row);  
        
            for (int col = 0; col < dataUse[row].length; col++ ) {
                System.out.printf("%d", dataUse[row][col]);            
    }
    System.out.println();
        }
    }
 }

