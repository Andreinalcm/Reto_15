public class TurnOnDevices {

    public static void main(String[] args) {
        turnOnDevice(new Lamp());
        turnOnDevice(new Computer());
        turnOnDevice(new AdaptadorCM(new CoffeMaker())); // Usamos el adaptador
    }

    private static void turnOnDevice(Connectable device) {
        device.turnOn();
        System.out.println(device.isOn());
    }
}