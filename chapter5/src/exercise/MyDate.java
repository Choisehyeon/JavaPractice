package exercise;

public class MyDate {

    private int day;
    private int month;
    private int year;

    public MyDate(int day, int month, int year){
        setDay(day);
        setMonth(month);
        setYear(year);
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean isValid() {
        int[] days = new int[]{31,28,31,30,31,30,31,31,30,31,30,31};
        if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            days[1] = 29;
        }
        if(day > 0 && day < days[month-1] ){
            return true;
        }
        else {
            return false;
        }
    }
}
