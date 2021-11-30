public class ArrayCopy{
    public static void main(String[] args){
        // 数据空间独立的拷贝
        int[] arr1 = {1,2,3};
        int[] arr2 = new int[arr1.length];
        // 开一个大小相同的数组
        for(int i = 0 ; i < arr1.length; i++){
            arr2[i] = arr1[i];
        }
        System.out.println("***************");
        arr2[0] *= 100;
        System.out.print("arr2:" + arr2[0]);
    }


}


