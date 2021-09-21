public class Time {
    private int hour = 0;
    private int minute = 0;
    private int second = 0;

    Time(int h, int m, int s) {
        hour = h;
        minute = m;
        second = s;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public void setHour(int newHour) {
        hour = newHour;
    }

    public void setMinute(int newMinute) {
        minute = newMinute;
    }

    public void setSecond(int newSecond) {
        second = newSecond;
    }

    public static void main(String[] args) {
        Time t1 = new Time(15, 6, 18);
        t1.setHour(15);
        t1.setMinute(6);
        t1.setSecond(18);
        System.out.print("Time:" + t1.getHour());
        System.out.print(":0" + t1.getMinute());
        System.out.print(":" + t1.getSecond());

    }
}