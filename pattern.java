
public class pattern{
    public static void main(String[] args) {

        pattern12(5);
        
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



}   