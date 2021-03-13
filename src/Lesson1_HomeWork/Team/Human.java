package Lesson1_HomeWork.Team;

public class Human implements Team{
    private final String name;
    private final double maxJumpHeigh;
    private final double maxDistanceRun;

    public Human(String name, double maxJumpHeigh, double maxDistanceRun) {
        this.name = name;
        this.maxJumpHeigh = maxJumpHeigh;
        this.maxDistanceRun = maxDistanceRun;
    }
}
