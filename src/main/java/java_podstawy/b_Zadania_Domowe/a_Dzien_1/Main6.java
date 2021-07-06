package java_podstawy.b_Zadania_Domowe.a_Dzien_1;


public class Main6 {

    public static void main(String[] args) {
        int [][] Arrays = {{1,2,3,4},{2,3,4,5,6},{3,4,5,5}};
        int result = oddSum(Arrays);
        System.out.println(result);
    }

    static int  oddSum(int[][] arr){
        int sum = 0;
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
               if (j%2==0){
                   sum=sum+arr[i][j];
               }
            }
        }
        return sum;
    }
}