package step1;

public class Track extends Barrier{

    private int lenght;

    Track(String name, int lenght){
        super(name);
        this.lenght = lenght;
    }

    private int getLenght() {
        return lenght;
    }

    @Override
    public boolean action(DoubleEvent event) {
        event.run();
        if (getLenght() <= event.getMaxRun()) {
            System.out.printf("%s успешно прошел испытание на выносливость\n",
                    event.getName());
            System.out.println("*****************");
            return true;
        }else  {
            System.out.printf("%s не прошел испытание на выносливость и выбывает из игры\n",
                    event.getName());
            System.out.println("*****************");
            return false;
        }
    }
}
