public class Vlogger {
    private String name;
    private int yearJoined;

    public Vlogger(String name, int yearJoined) {
        this.name = name;
        this.yearJoined = yearJoined;
    }

    public String getName() {
        return name;
    }

    public int getYearJoined() {
        return yearJoined;
    }

    public Vlogger() {
        name = "Kyuri";
        yearJoined = 2008;
    }
}