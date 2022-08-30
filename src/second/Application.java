package second;

public class Application {
    public static void main(String[] args) {
        Vehicle car1 = new Vehicle(200);
        Vehicle car2 = new Vehicle();

        System.out.println(car1.toString() + " | " + car2.toString());
    }
}
