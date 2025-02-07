
interface Connectable {
    void turnOn();
    void turnOff();
    boolean isOn();
}

class Lamp implements Connectable {
    @Override
    public void turnOn() {
        System.out.println("Lámpara encendida");
    }

    @Override
    public void turnOff() {
        System.out.println("Lámpara apagada");
    }

    @Override
    public boolean isOn() {
        return true;
    }
}

class Computer implements Connectable {
    @Override
    public void turnOn() {
        System.out.println("Computadora encendida");
    }

    @Override
    public void turnOff() {
        System.out.println("Computadora apagada");
    }

    @Override
    public boolean isOn() {
        return true;
    }
}

class CoffeMaker {
    public void on() {
        System.out.println("Cafetera encendida");
    }

    public void off() {
        System.out.println("Cafetera apagada");
    }

    public boolean isOff() {
        return false;
    }
}

class AdaptadorCM implements Connectable {
    private CoffeMaker coffeMaker;

    public AdaptadorCM(CoffeMaker coffeMaker) {
        this.coffeMaker = coffeMaker;
    }

    @Override
    public void turnOn() {
        coffeMaker.on();
    }

    @Override
    public void turnOff() {
        coffeMaker.off();
    }

    @Override
    public boolean isOn() {
        return !coffeMaker.isOff();
    }
}