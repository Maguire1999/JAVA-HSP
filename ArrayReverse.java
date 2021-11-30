public class ArrayReverse {
    public static void main(String[] args){
        // 数组反转

        int[] arr1 = new int[10];
        for( int i = 0 ; i < arr1.length ; i++){
            arr1[i] = i * 10;
        }
        // 思路1
        // 交换次数 = 长度/2
        // 每次交换是 对应的下标是arr1[i] 和 arr1[arr1.length - 1 - i]
        int temp = 0;
        int len = arr1.length;
        for (int i = 0; i < arr1.length/2 ; i++ ){
            temp = arr1[i];
            arr1[i] = arr1[arr1.length - i -1];
            arr1[arr1.length - i -1] = temp;
        }
        // 思路2
        // 新开一个arr2
        int[] arr2  = new int[len];
        for ( int i = len - 1 ; i>=0 ; i--){
            arr2[len-i-1] = arr1[i];
        }
        System.out.println("arr2:"+ arr2[0]);

    }
}
