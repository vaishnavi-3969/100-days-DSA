public class Main {
    public static void main(String[] args) {
        pattern1(5);
        pattern2(4);
        pattern3(4);
        pattern4(5);
        pattern5(4);
        pattern28(5);
        pattern30(5);
        pattern31(5);
    }
    public static void pattern1(int n ){
        System.out.println("pattern1");
        for(int row=1; row<=n; row++){
            for(int col=1; col<=n; col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void pattern2(int n){
        System.out.println("pattern2");
        for(int row=1; row<=n; row++){
            for(int col=1; col<=row; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void pattern3(int n ){
        System.out.println("pattern 3");
        for(int row=n; row>0; row--){
            for(int col=row; col>0; col--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void pattern4(int n){
        System.out.println("pattern4");
        for(int row=1; row<=n; row++){
            for(int col=1; col<=row; col++){
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }
    public static void pattern5(int n){
        System.out.println("pattern5");

      for(int row=1; row<=2*n; row++){
         if(row<=n){
             for(int col=1; col<=row; col++){
                 System.out.print("*");
             }
         }else{
             for(int col=1; col<=2*n-row; col++){
                 System.out.print("*");
             }
         }
          System.out.println();
      }
    }
    public static void pattern28(int n){
        for(int row=1; row<=2*n; row++){
            int totalcolsInRow = row>n? 2*n-row: row;
            int noOfSpaces = n-totalcolsInRow;
            for(int s=0; s<noOfSpaces; s++){
                System.out.print(" ");
            }
            for(int col=0; col<totalcolsInRow; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void pattern30(int n){
        System.out.println("pattern30");
        for(int row=1; row<=n; row++){
            for(int col=n-row; col>0; col--){
                System.out.print("  ");
            }
            for(int col=row; col>0; col--){
                System.out.print(col+" ");
            }
            for(int col=2; col<=row; col++){
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }
    public static void pattern31(int n){
        n=2*n;
        for(int row=0; row<=n; row++){
            for(int col=0; col<=n; col++){
                int atEveryIndex=Math.min(Math.min(row,col),Math.min(n-row,n-col));
                System.out.print(atEveryIndex);
            }
            System.out.println();
        }
    }
}