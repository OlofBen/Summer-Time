public class Date{
    public int year, month, day;

    public Date(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    
    public boolean equals(Object other){
        if (other instanceof Date){
            var otherDate = (Date) other;
            return 
                year == otherDate.year && 
                month == otherDate.month && 
                day == otherDate.day;
        } 
        else return false;
    } 

    public boolean after(Date other){
        if (year != other.year) {
            return year > other.year;
        } else if (month != other.month) {
            return month > other.month;
        } else {
            return day >= other.day;
        }
    }

    public boolean before(Date other){
        return !after(other);
    }
    
}
