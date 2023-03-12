public class TestVehicle {

    public static void main(String[] args) {

        Vehicle v1 = new Vehicle();
        Vehicle v2 = new Vehicle(45, 3);

        v1.speedUp(40);
        v1.changeGear(3);
        System.out.println("V1 speed : " + v1.getSpeed() + " V1 gear: " +
                v1.getGear());

        v2.speedUp(-10);
        v2.changeGear(-1);
        System.out.println("V2 speed : " + v2.getSpeed() + " V2 gear: " +
                v2.getGear());
    }
}