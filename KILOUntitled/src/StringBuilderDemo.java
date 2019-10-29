//   StringBuilder是java 1.5中新提供的字符串类，效率非常高，与StringBuffer类的用法相同。StringBuffer是线程安全的，StringBuilder是非线程安全的。
public class StringBuilderDemo {
    public static void main(String[] args){
        StringBuilder sb = new StringBuilder();//构造方法 初始为空
        StringBuilder sb = new StringBuilder("world"); //构造方法 str ->sb
        String str = sb.toString(); //str 转sb 输出时 自动调用

        StringBuilder sb2 = sb.append("hello");//添加数据(任意类型)
        System.out.println(sb == sb2); //true 地址相同

        sb.delete(1,4); //删除 [1,4)字符
        sb.deleteCharAt(1); //删除字符
        sb.insert(2, "it");   //在指定位置插入
        sb.replace(1, 4, "java");//替换[1,4)的字符串为"java"
        sb.reverse();//反转
        sb.length();    //返回长度（字符数）
        sb.charAt(0);  //返回索引处的字符
        sb.indexOf("java",5); //查找第一次出现字符串的索引 从指定索引处
        String str = sb.substring(0,1); //截取 [0,1) 返回字符串
        String str = sb.substring(1); //截取[1,最后] 返回字符串
        sb.append("hello").append(true).append(100); //链式调用
    }
}
