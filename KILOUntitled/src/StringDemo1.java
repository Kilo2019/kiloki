public class StringDemo1 {
    public static void main(String[] args){
            String s1 = "Hello,world!";
            String s2 = "Hello,world!";//与s1指向同一地址，“Hello,world!”储存在堆得常量池中
            String s3 = new String("Hello,world!");//创建了一个新对象

            System.out.println(s1==s2);//true 地址相等
            System.out.println(s1==s3);//false
            System.out.println(s1.equals(s3));//true 内容相等 重写了Object的

            byte[] bytes={65,66,67,68};
            String str=new String(bytes); //byte数组 转 字符串
            String str=new String(bytes,1,2); //数组，初始值，个数；
            byte[] bytes = str.getBytes();//字符串 转byte数组
            char[] ch={'中','a','2'};

            String str=new String(ch);// 字符数组 转 字符串
            String str=new String (ch,0,1);// 字符数组 转 字符串
            char[] chs = str.toCharArray(); //字符串 转 字符数组
    }

}
/*str.toString() 获取字符串对象的内容  输出时 自动调用

str.isEmpty() 判断字符串是不是空串

str.length() 返回字符串长度

str.charAt(0) 返回索引处字符

str.equals(str2); 判断字符串 与 指定字符串 内容是否相同

str.equalsIgnoreCase(str3); 判断字符串内容是否相同  忽略大小写

str.substring(1) 截取开始索引 到最后 的字符串

str.substring(2, 4) 截取开始索引 到终止索引(不包括) 的字符串

str.indexOf("bcd") 返回第一次出现该字符串的索引，没有返回-1

str.contains("bcd") 判断是否包含指定字符串true/false

str.startsWith("Demo") 判断是否以给定字符串开头

str.endsWith("java") 判断是否以给定字符串结尾

str.toLowerCase() 把字符串转换为小写字符串

str.toUpperCase() 把字符串转换为大写字符串

str.trim()     去掉字符串两端空格

str.replace(oldChar, newChar)   将替换字符串中的老字符,为新字符

str.replace(oldstr, newstr) 将字符串中的老字符串,替换为新字符串

String[] strArray = str.split(",")   按照指定符号分割字符串
*/
