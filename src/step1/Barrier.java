package step1;

public abstract class Barrier {
    private String name;

    public Barrier(String name) {
        this.name = name;
    }
    public abstract boolean action (DoubleEvent event);

}
