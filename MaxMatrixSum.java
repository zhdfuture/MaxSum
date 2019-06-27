public class MaxMatrixSum {
    public int maxSum(int[][] array){
        if(array==null||array.length==0||array[0].length==0){
            return 0;
        }
        int count=0;
        int max=Integer.MIN_VALUE;
        int[] sum=null;   //初始化累加数组
        for(int i=0;i!=array.length;i++){
            sum=new int[array[0].length];
            for(int j=i;j!=array.length;j++){
                count=0;
                for(int k=0;k!=sum.length;k++){
                    sum[k]+=array[j][k];   //列求和
                    count+=sum[k];
                    max=Math.max(count,max);
                    count=count<0?0:count;
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[][] array={{-1,-1,-1},{-1,2,2},{-1,-1,-1}};
        MaxMatrixSum matrixSum=new MaxMatrixSum();
        System.out.println(matrixSum.maxSum(array));
    }
}
