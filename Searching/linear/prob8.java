import java.util.Arrays;
public class prob8{
    public static void main(String[] args) {
        int[][] a = {{1,2,3},
                   {4,5,6},
                   {7,8,9}
    };
        int[][] b = {{8,7,6},
                     {5,4,3},
                     {2,1,0}

        };
        int [][] c = new int[3][3];

        for(int row = 0; row < 3; row++){
            for(int col = 0; col < 3; col++){
                c[row][col] = a[row][col] + b[row][col];
                System.out.println(c[row][col]);
            }
        }

}
}
