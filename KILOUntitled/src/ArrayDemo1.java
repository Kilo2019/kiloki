
public class ArrayDemo1 {
    public static void main(String[] args){
        int[] a;
        a=new int[5];//分配空间
        //以上两句可以携程：int[] a = new int[5]
        a[0] = 1;//赋值
        a[1] = 4;
        a[2] = 4;
        a[3] = 6;
        a[4] = 8;
    for(int i=0;i<a.length;i++){
           System.out.println("a["+i+"]="+a[i]);
        }
    System.out.println("*********************************************");
    int[] b={1,2,3,4,5}; //分配空间并且赋值
        for(int i=0;i<a.length;i++){
            System.out.println("b["+i+"]="+b[i]);
        }
    }
}
