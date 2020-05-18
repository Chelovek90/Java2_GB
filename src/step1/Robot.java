
package step1;

public class Robot implements DoubleEvent {

    private String name;
    private int maxRun = 3000;
    private double maxJump = 10;

    public Robot(String name){
        this.name = name;
    }

    public Robot (String name, int maxRun, double maxJump) {
        this.name = name;
        this.maxRun = maxRun;
        this.maxJump = maxJump;
    }

    @Override
    public void jump() {
        System.out.printf("%s jumping\n", getName());
    }

    @Override
    public void run() {
        System.out.printf("%s running\n", getName());
    }

    @Override
    public int getMaxRun() {
        return this.maxRun;
    }

    @Override
    public double getMaxJump() {
        return this.maxJump;
    }

    @Override
    public String getName() {
        return this.name;
    }
}

