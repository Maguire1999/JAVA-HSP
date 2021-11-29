

public class array {
    public static void main(String[] args) {
    
        // System.out.println("Hello World\n");
        // 1\基本数据类型赋值 数拷贝
        int n1 = 10;
        int n2 = n1;
        n2  = 80;
        System.out.println("n1 = " + n1);
        System.out.println("n2 = " + n2);
        // 2\数组默认是引用传递，赋值的是地址，赋值方式位引用传递
        int[] arr1 = {1,2,3};
        int[] arr2 = arr1;

        arr2[0] = 100;
        System.out.println("******arr1的元素*******");
        for(int i = 0 ; i<arr1.length ; i++ ){
            System.out.println(arr1[i]);
        }
        System.out.println(" arr1[0] : " + arr1[0]);
        System.out.println(" arr2[0] : " + arr2[0]);

    }
}
