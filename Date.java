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

    public boolean after(Date ohter){
        if (year == ohter.year){
            if (month == ohter.month){
                return day >= ohter.day;
            } else return month >= ohter.month;
        } else return year >= ohter.year;
    }

    public boolean before(Date other){
        return !after(other) && !equals(other);
    }
    
}
