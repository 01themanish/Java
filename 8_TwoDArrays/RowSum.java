public class RowSum {
    public static void main(String[] args) {
        int a[][] = {{1,2,3},{4,5,6}};

        for(int i=0;i<2;i++){
            int sum = 0;
            for(int j=0;j<3;j++){
                sum += a[i][j];
            }
            System.out.println("Row " + i + " Sum = " + sum);
        }
    }
}