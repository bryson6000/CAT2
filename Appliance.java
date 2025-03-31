abstract class Appliance {
    abstract void turnOn();
}


class Fan extends Appliance {
    @Override
    void turnOn() {
        System.out.println("Fan is now ON.");
    }
}


class TV extends Appliance {
    @Override
    void turnOn() {
        System.out.println("TV is now ON.");
    }
}
