public class AbstractTest {
    public static void main(String[] args) {
        Manager m = new Manager("张三丰子", "1001", 12000.00, 6000.00);
        m.work();

        Programmer p = new Programmer("小宇飞刀", "2001", 9500.00, "Java");
        p.work();
    }
}