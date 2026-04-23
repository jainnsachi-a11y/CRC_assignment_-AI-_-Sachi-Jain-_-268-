class Test {
    int x;
}
public class CallByDemo {
    static void changeValue(int a) {
        a = 100;
    }
    static void changeRef(Test t) {
        t.x = 100;
    }
    public static void main(String[] args) {
        int a = 10;
        changeValue(a);
        System.out.println("Call by Value: " + a);
        Test obj = new Test();
        obj.x = 10;
        changeRef(obj);
        System.out.println("Call by Reference (object): " + obj.x);
    }
}