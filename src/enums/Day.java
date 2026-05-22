package enums;

public enum Day {

    monday(1),
    tuesday(2),
    wednesday(3),
    thursday(4),
    friday(5),
    saturday(6),
    sunday(7);
    private int value;
    Day(int value) {
        this.value = value;

    }
    public int getValue() {
        return value;

    }
}
