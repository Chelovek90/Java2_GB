package step1;

public class Wall extends Barrier{

    private double height;

    Wall(String name, double height){
        super(name);
        this.height = height;
    }

    private double getHeight() {
        return height;
    }

    @Override
    public boolean action(DoubleEvent event) {
        event.jump();
        if (getHeight() <= event.getMaxJump()) {
            System.out.printf("%s успешно прошел испытание по прыжкам в высоту\n",
                    event.getName());
            System.out.println("*****************");
            return true;
        }else  {
            System.out.printf("%s не прошел испытание покрыжкам и выбывает из игры\n",
                    event.getName());
            System.out.println("*****************");
            return false;
        }
    }
}
