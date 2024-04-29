// 인터페이스에는 메소드와 변수를 정의 될 수 있는데 변수에는 값이 들어오고 메소드는 실제 구현이 들어가지 않는다.
interface Calculable{
    double PI = 3.14;
    int sum(int v1,int v2);
}
interface Printable{
    // 인터페이스에 메소드를 정의할 때는 내용이 들어가지 않는다.
    void print();
}
// 하나의 클래스는 여러개의 인터페이스를 구현 할 수 있다.
class RealCal implements Calculable, Printable{
    public int sum(int v1, int v2){
        return v1+v2;
    }

    public void print() {
        System.out.println("This is RealCal");
    }
}

public class InterfaceApp {
    public static void main(String[] args) {
        RealCal c = new RealCal();
        System.out.println(c.sum(2,1));
        c.print();
        System.out.println(c.PI);
    }
}
