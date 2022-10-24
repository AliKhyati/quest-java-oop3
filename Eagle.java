public class Eagle extends Bird implements Fly {

    private boolean flying;
    private int altitude;

    public Eagle(String name) {
        super(name);
        this.flying = false;
        this.altitude = 0;
    }

    @Override
    public void takeOff(){
        System.out.println(this.getName() + " takes off in the sky");
    }

    @Override
    public int ascend(int meters) {
        this.altitude+= meters;
        System.out.println(this.getName() + " flies upward, altitude: " + this.altitude);
        return altitude;
    }
    @Override
    public void land() {
        if (this.altitude > 1) {
            System.out.println("Hawkeye is too high, it can't land.");
        }else {
            System.out.println("Hawkeye lands on the ground.");
            this.altitude = 0;
        }
    }

    @Override
    public int descend(int meters) {
        this.altitude = this.altitude - meters;
        System.out.println(this.getName() + " flies downward, altitude: " + this.altitude);
        return altitude;
    }

    public int getAltitude() {
        return altitude;
    }

    public boolean isFlying() {
        return flying;
    }

    @Override
    public String sing() {
        return "Screech!";
    }
}
