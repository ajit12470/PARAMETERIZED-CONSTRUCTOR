public class ParameterizedConstructor {
    int empid;
    String empname;
    String empcourse;

    ParameterizedConstructor(int empid, String empname, String empcourse) {
        this.empid = empid;
        this.empname = empname;
        this.empcourse = empcourse;
    }

    void show() {
        System.out.println("Employee id is: " + empid);
        System.out.println("Employee name is: " + empname);
        System.out.println("Employee course is: " + empcourse);
        System.out.println();
    }

    public static void main(String[] args) {
        ParameterizedConstructor p = new ParameterizedConstructor(101, "AJIT KUMAR", "JAVA FULL STACK ");
        p.show();
        ParameterizedConstructor p1 = new ParameterizedConstructor(102, "ROHAN KUMAR", "JAVA FULL STACK ");
        p1.show();
        ParameterizedConstructor p2 = new ParameterizedConstructor(103, "SACHIN KUMAR", "JAVA FULL STACK ");
        p2.show();
        ParameterizedConstructor p3 = new ParameterizedConstructor(104, "RAHUL KUMAR", "JAVA FULL STACK ");
        p3.show();
        ParameterizedConstructor p4 = new ParameterizedConstructor(105, "GULSHAN KUMAR", "JAVA FULL STACK ");
        p4.show();
    }
}
