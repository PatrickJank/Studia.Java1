public class Car {
    final String model;
    final String producer;
    double weight;
    boolean airConditioner;
    int yearOfProduction;

    public Car(String producer, String model) {
        this.producer = producer;
        this.model = model;
        this.airConditioner = true;

    }
}
