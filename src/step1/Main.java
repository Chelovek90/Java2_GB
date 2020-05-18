package step1;

public class Main {
    public static void main(String[] args) {
        /*
        Создаем будущих чемпионов
        */
        Cat cat_1 = new Cat("Barsik", 3, 5);
        System.out.printf("Cat  - %s, run - %d, jump - %.1f\n",
                cat_1.getName(), cat_1.getMaxRun(), cat_1.getMaxJump());
        Robot rob_1 = new Robot("R2D2");
        System.out.printf("Robot  - %s, run - %d, jump - %.1f\n",
                rob_1.getName(), rob_1.getMaxRun(), rob_1.getMaxJump());
        Human hum_1 = new Human("Pet'ka");
        System.out.printf("Human  - %s, run - %d, jump - %.1f\n",
                hum_1.getName(), hum_1.getMaxRun(), hum_1.getMaxJump());
        /*
        Объединяем персонажей в один массив. Тут же хотел создать массив для чемпионов
        (пока не придумал как красиво сделать вывод участников которые прошли все испытания и
        как правильнее создать массив по длине, чтобы не тратить лишнюю память. В динамические массивы в джаве пока не лез).
        */
        DoubleEvent[] participants = {cat_1, rob_1, hum_1};
//        String[] champion = new String[];
        /*
        Создаем препятствия и объеденяем их в массив
        */
        Wall wall_1 = new Wall("Wall", 1.2);
        Track track_1 = new Track("Track", 100);
        Barrier[] barriers = {wall_1, track_1};
        /*
        Устраиваем проверку
        */
        for (int i = 0; i < participants.length; i++) {
            for (int j = 0; j < barriers.length; j++) {
                boolean result = barriers[j].action(participants[i]);
                if (!result) {
                    break;
                }
            }
        }
    }
}
