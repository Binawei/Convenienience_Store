package First_project.hello_world;

public enum Days_Of_The_Week {
    MONDAY(1),
    TUESDAY(2),
    WEDNESDAY(3),
    THURSDAY(4),
    FRIDAY(5),
    SATURDAY(6),
    SUNDAY(0);

    private int day_index;

    private Days_Of_The_Week(int day_index) {
        this.day_index = day_index;
    }

    public int index() {
        return day_index;
    }
}

