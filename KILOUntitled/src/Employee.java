abstract class Employee {
    String name; //姓名
    String id;   //工号
    double pay;  //薪水

    Employee(String name, String id, double pay) {
        this.name = name;
        this.id = id;
        this.pay = pay;
    }

    void showInfo() {
        System.out.println(String.format("工号:%s,姓名:%s,薪水:%,.2f", id, name, pay));
    }

    public abstract void work();
}