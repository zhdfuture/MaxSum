public class MaxArraySum {
    public int maxSum(int[] array){
       if(array==null||array.length==0){
           return 0;
       }
       int count=0;
       int max=Integer.MIN_VALUE;   //初始化变量
        for(int i=0;i<array.length;i++){
            count+=array[i];
            max=Math.max(count,max);
            count=count<0?0:count;  //若count<0,将count置为0，从下一个开始遍历
        }
        return max;
    }

    public static void main(String[] args) {
        int[] array={1,-2,3,5,-2,6,-1};
        MaxArraySum maxArraySum=new MaxArraySum();
        System.out.println(maxArraySum.maxSum(array));

    }
}
