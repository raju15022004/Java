public class butterly {
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
        public static void butterly(int n){
            for(int i=1;i<=n;i++){

                for( int j=1;j<=i;j++){
                    System.out.print("*");
                }
                for(int j=1;j<=2*(n-i);j++){
                    System.out.print(" ");
                }
                for(int j=1;j<=i;j++){
                    System.out.print("*");
                }
            }

            for(int i=n;i>=1;i--){
                for( int j=1;j<=i;j++){
                    System.out.print("*");
                }
                for(int j=1;j<=2*(n-i);j++){
                    System.out.print(" ");
                }
                for(int j=1;j<=i;j++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }

    //     public static void solid_rhombus(int n){
    //         for(int i=1;i<=n;i++){
    //             for(int j=1;j<=(n-i);j++){
    //                 System.out.print(" ");
    //             }
    //             for(int j=1;j<=n;j++){
    //                 System.out.print("*");
    //             }
    //             System.out.println();
    //         }
    //     }

    //    public static void hollow_rhombus(int n){
    //     for(int i=1;i<=n;i++){
    //         for(int j=1;j<=(n-i);j++){
    //             System.out.print(" ");
    //         }
    //         for(int j=1;j<=n;j++){
    //             if(i==1 || i==n || j==1 || j==n){
    //                 System.out.print("*");
    //             }
    //             else{
    //                 System.out.print(" ");
    //             }
    //         }
    //         System.out.println();
    //     }
    //    }

    public static void diamond(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=(2*i)-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=n;i>=1;i--){
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=(2*i)-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        // hollow_rectange(4, 5);

        // inverted_rotated_half_pyramid(7);

        // inverted_rotated_half_pyramid_withNumbers(5);
        // butterly(4);
        // solid_rhombus(4);
        // hollow_rhombus(5 );
        diamond(9);
    }


}
