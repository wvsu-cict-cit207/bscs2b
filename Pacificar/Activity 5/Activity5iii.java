public class Activity5iii {
    public static void main(String[] args) {
        int i, j, rows = 5;

        for (i=0; i<rows; i++){
            for (j=2*(rows-i); j>=0; j--){
                System.out.print(" ");
            }
            for (j=0; j<=i; j++ ){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}
