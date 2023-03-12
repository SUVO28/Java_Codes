class Vehicle {

    public int speed;
    public int gear;

    public Vehicle() {

        this.speed = 0;
        this.gear = 0;
    }

    public Vehicle(int speed, int gear) {

        this.speed = speed;
        this.gear = gear;
    }

    public int getSpeed() {

        return this.speed;
    }

    public int getGear() {

        return this.gear;
    }

    public int speedUp(int value) {

        this.speed += value;
        return this.speed;
    }

    public int changeGear(int value) {

        this.gear += value;
        return this.gear;
    }
}
