package Lesson1_HomeWork.Team;

import Lesson1_HomeWork.Skills.Jumpable;
import Lesson1_HomeWork.Skills.Runable;

public class Cat implements Team, Runable, Jumpable {
    private final String name;
    private final double maxJumpHeigh;
    private final double maxDistanceRun;

    public Cat(String name, double maxJumpHeigh, double maxDistanceRun) {
        this.name = name;
        this.maxJumpHeigh = maxJumpHeigh;
        this.maxDistanceRun = maxDistanceRun;
    }

    @Override
    public boolean jump(double heigh) {
        if (heigh<=maxJumpHeigh){
            System.out.printf("Кот %s прыгнул на высоту %s метров %n",name, heigh);
            return true;
        }
        else {
            System.out.printf("Кот %s не смог прыгнуть на высоту %s метров %n",name,heigh);
        }
        return false;
    }

    @Override
    public boolean run(double distance) {
        if (distance<=maxDistanceRun){
            System.out.printf("Кот %s пробежал %s метров %n",name,distance);
        }
        else {
            System.out.printf("Кот %s не смог пробежать %s метров %n",name,distance);
        }

        return false;
    }
}
