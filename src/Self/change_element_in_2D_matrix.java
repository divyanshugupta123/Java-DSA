package Self;
import java.util.*;
public class change_element_in_2D_matrix {
    public static void main (String args[]) {

        Scanner cin = new Scanner(System.in);
        int m = cin.nextInt();
        int n = cin.nextInt();

        int[][] mat = new int[m][n];
        int count = 0;

        for(int i=0;i<m;i++){

            for(int j=0; j<n;j++){

                mat[i][j] = cin.nextInt();
                if(mat[i][j]==0)
                    count++;
            }
        }

        int[] r = new int[count];
        int[] c = new int[count];
        count = 0;

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(mat[i][j] == 0){
                    r[count] = i;
                    c[count] = j;
                    count++;
                }
            }
        }

        changeRowAndColumn(r ,c , mat);

        for(int i=0; i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
        cin.close();

    }

    private static void changeRowAndColumn(int[] r, int[] c , int[][] mat){

        for(int i=0;i<r.length;i++){

            for(int j=0;j<mat[0].length;j++){
                mat[r[i]][j] = 0;
            }

            for(int j=0;j<mat.length;j++){
                mat[j][c[i]] = 0;
            }
        }
    }
}