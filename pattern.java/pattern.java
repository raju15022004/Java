public class pattern {
    public static void hollow_rectange(int totRows,int totCols){
        for(int i=1; i<=totRows; i++){

            for(int j=1; j<=totCols; j++){

                if(i==1 || i==totRows || j==1 || j==totCols){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
       public static void inverted_rotated_half_pyramid_withNumbers(int n){
        for(int i=1; i<=n; i++){

            for(int j=1; j<=n-i+1; j++){
                System.out.print(j+" ");

            }
            System.out.println();
        }
        } 

    public static void main(String args[]) {
        // hollow_rectange(4, 5);

        // inverted_rotated_half_pyramid(7);

        inverted_rotated_half_pyramid_withNumbers(5);
    }

}