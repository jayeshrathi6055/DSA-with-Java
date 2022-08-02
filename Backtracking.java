import java.util.ArrayList;
import java.util.List;

public class Backtracking {
    public static void queenPlaces(int n, int i, int j, int[] arr){
        // List<List><String> allBoards = new ArrayList<>();
        if(i==n &&j==n){
            return;
        }else if(i==0 && j==0){
            System.out.println(i+" "+j);
            arr.length-1 = [i,j];
            queenPlaces(n,i,j+1,arr);
        }else if(){}

    }
    public static void main(String[] args) {
        
    }
}
