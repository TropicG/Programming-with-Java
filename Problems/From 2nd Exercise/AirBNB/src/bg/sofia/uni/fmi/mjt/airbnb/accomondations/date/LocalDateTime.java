package bg.sofia.uni.fmi.mjt.airbnb.accomondations.date;

public class LocalDateTime {
//private
    private int day;
    private int month;
    private int year;


//public
    public LocalDateTime(){
        this.day = 0;
        this.month = 0;
        this.year = 0;
    }

    public LocalDateTime(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public final boolean inPast(LocalDateTime other){

        if(this.year <= other.year){

            if(this.month <= other.month){
                return this.day > other.day;
            }
            else return true;
        }
        else return true;
    }

    public final int getDay(){
        return this.day;
    }

    public final int getMonth(){
        return this.month;
    }

    public final int getYear(){
        return this.year;
    }
}
