import javax.crypto.spec.RC2ParameterSpec;

public class pattern{
    public static void main(String[] args) {

        pattern23(3);
        
    }
    public static void pattern1(int n){

        for(int row =1; row<=n; row++){
            for(int col=1; col<=n; col++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
    public static void pattern2(int n){

        for(int row =1; row<=n; row++){
            for(int col=1; col<=row; col++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
    public static void pattern3(int n){

        for(int row =1; row<=n; row++){
            for(int col=1; col<=n-row+1; col++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
    public static void pattern4(int n){

        for(int row =1; row<=n; row++){
            for(int col=1; col<=row; col++){
                System.out.print(col);
            }
            System.out.println();
        }

    }
    public static void pattern5(int n){

        for(int row =1; row<=2*n; row++){
            int logic = row > n ? 2*n-row : row; 
            for(int col=1; col<=logic; col++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
    public static void pattern6(int n){

        for(int row =1; row<=n; row++){
            int logic = n-row;
            if (0!=logic){System.out.printf("%" + logic + "s", " ");}
            for(int col=1; col<=row; col++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
    public static void pattern7(int n){

        for(int row =1; row<=n; row++){
            int logic = row-1;
            if (0<logic){System.out.printf("%" + logic + "s", " ");}
            for(int col=1; col<=n-row+1; col++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
    public static void pattern8(int n){

        for(int row =1; row<=n; row++){
            int logic = n-row;
            if (0!=logic){System.out.printf("%" + logic + "s", " ");}
            for(int col=1; col<row*2; col++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
    public static void pattern9(int n){

        for(int row =1; row<=n; row++){
            int logic =row-1;
            if (0!=logic){System.out.printf("%" + logic + "s", " ");}
            for(int col=1; col<=2*n-2*row+1; col++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
    public static void pattern10(int n){

        for(int row =1; row<=n; row++){
            int logic = n-row;
            if(0!=logic){
                System.out.printf("%"+logic+"s"," ");
            } 
            for(int col=1; col<=row; col++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
    public static void pattern11(int n){

        for(int row =1; row<=n; row++){
            int logic = row-1;
            if(0!=logic){
                System.out.printf("%"+logic+"s"," ");
            } 
            for(int col=1; col<=n-row+1; col++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
    public static void pattern12(int n){

        for(int row =1; row<=n*2; row++){
            int logic = row==n ||row == n+1 ? n-1 : row<n ? row -1 :  2*n-row ;
            if(0!=logic){
                System.out.printf("%"+logic+"s"," ");
            } 
            int ll=row == n || row == n+1 ? 1 : row<n ?n-row+1 : row-n;
            // System.out.println(ll);
            for(int col=1; col<=ll; col++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    public static void pattern13(int n){

        for(int row =1; row<=n; row++){
            int logic = n-row;
            if(0!=logic){
                System.out.printf("%"+logic+"s"," ");
            } 
            for(int col=1; col<=row*2-1; col++){
                
                if(col==1 || col==row*2-1 || row==n){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                } 
            }
            System.out.println();
        }

    }
    public static void pattern14(int n){
        
        for(int row =1; row<=n; row++){
            int logic = row-1;
            if(0!=logic){
                System.out.printf("%"+logic+"s"," ");
            }
            
            for(int col=1; col<=(n-row)*2+1; col++){
                if ( row==1 || col==1 || col==(n-row)*2+1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
    public static void pattern15(int n){

        for(int row =1; row<=n*2-1; row++){
            int logic = row>n ? n*2-row : row;
            int space = n-logic;
            if (0!=space){
                System.out.printf("%"+space+"s"," ");
            }
            for(int col=1; col<=logic*2-1; col++){
                if (col==1 || col == logic*2-1){
                    System.out.print("*");
                }else{
                System.out.print(" ");
            }
        }
            System.out.println();
        }

    }
    //https://www.geeksforgeeks.org/pascal-triangle/
    public static void pattern16(int n){

        for(int row =1; row<=n; row++){
            int space = n-row;
            if (0!=space){
                System.out.printf("%"+space+"s"," ");
            }
            int logic = 1;
            for (int col=1;col <=row;col++){
                System.out.print(logic+" ");
                logic = logic*(row-col)/col;
                // System.out.print(logic);
            }
            System.out.println();
        }

    }
    //      1
    //     212
    //    32123
    //   4321234
    //    32123
    //     212
    //      1

    public static void pattern17(int n){

        for(int row =1; row<=n*2-1; row++){
            int logic = row>n ? n*2-row : row;
            int space=n-logic;
            if(0!=space){
                System.out.printf("%"+space+"s"," ");
            }
            for(int col1=logic; col1>=1; col1--){
                System.out.print(col1);
            }
            for(int col2=2;col2<=logic;col2++){
                System.out.print(col2);
            }
            System.out.println();
        }

    }

    //   **********
    //   ****  ****
    //   ***    ***
    //   **      **
    //   *        *
    //   *        *
    //   **      **
    //   ***    ***
    //   ****  ****
    //   **********
    public static void pattern18(int n){

        for(int row =1; row<=n*2; row++){
            int logic = row<=5 ? n-row+1:row-n;
            for(int col=1; col<=n*2; col++){ 
                if (col<=logic || n*2-logic<col){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }            
            }
            System.out.println();
        }

    }
    //    *        *
    //    **      **
    //    ***    ***
    //    ****  ****
    //    **********
    //    ****  ****
    //    ***    ***
    //    **      **
    //    *        *

    public static void pattern19(int n){

        for(int row =1; row<=n*2-1; row++){
            int logic = row>5 ? n*2-row : row;
            for(int col=1; col<=n*2; col++){
                if(col<=logic || n*2-logic<col){

                System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }

            }
            System.out.println();
        }

    }
    public static void pattern20(int n){

        for(int row =1; row<=n; row++){
            for(int col=1; col<=n; col++){
                if(row==1 || row==n || col==1 || col ==n){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
    public static void pattern21(int n){
        int logic=1;
        for(int row =1; row<=n; row++){
            
            for(int col=1; col<=row; col++){
                System.out.print(logic+" ");
                logic++;
            }
            System.out.println();
        }

    }
//      *****
//     *   *
//    *   *
//   *   *
//  *****
    public static void pattern25(int n){

        for(int row =1; row<=n; row++){
            int space = n-row;
            if (0!=space){
                System.out.printf("%"+space+"s"," ");
            }
            for(int col=1; col<=n; col++){
                if (row==1 || row == n || col==1 || col == n){
                    System.out.print("*");    
                }
                else{
                    System.out.print(" "); 
                }
                
            }
            System.out.println();
        }
    }
    //    1
    //    0 1
    //    1 0 1
    //    0 1 0 1
    //    1 0 1 0 1
    public static void pattern22(int n){
        int num= 1;
        for(int row =1; row<=n; row++){
            for(int col=1; col<=row; col++){
                System.out.print(num+" ");
                num = num==1 ? 0 :1;
            }
            System.out.println();
        }

    }
//     *   *
//    * * * *
//   *   *   *
public static void pattern23(int n){
    
    for(int row =1; row<=n; row++){
        int space = n-row;
        if (0!=space){
            System.out.printf("%"+space+"s"," ");
        }
        for(int col=1; col<=n; col++){
            System.out.print("*");
            
        }
        System.out.println();
    }

}
}