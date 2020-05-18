
package step1;

public class Human implements DoubleEvent {

    private String name;
    private int maxRun = 500;
    private double maxJump = 3.2;

    public Human(String name){
        this.name = name;
    }

    public Human (String name, int maxRun, double maxJump) {
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
