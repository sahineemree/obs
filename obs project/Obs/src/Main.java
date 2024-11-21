public class Main {
    public static void main(String[] args) {
        Car audi = new Car();
        audi.model = "Audi A3";
        audi.speed = 20;
        audi.increaseSpeed(30);
        audi.decreaseSpeed(10);
        audi.printSpeed();

        Car merco = new Car();
        merco.model = "Merco";
        merco.speed = 50;
        merco.decreaseSpeed(30);
        merco.printSpeed();
    }
}