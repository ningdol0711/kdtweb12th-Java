package _05_class._EX._Ex02;

public class VehiclesEx {
    public static void main(String[] args) {
        Car car = new Car();

        car.Info();
        car.Start();
        car.Middle();
        car.End();

        Motorcycle Moto = new Motorcycle();

        Moto.Info();
        Moto.Start();
        Moto.Middle();
        Moto.End();

        Bus bus = new Bus();

        bus.Info();
        bus.Start();
        bus.Middle();
        bus.End();
    }
}
