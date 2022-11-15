import java.util.Date;
import java.util.Map;

public class SummerTime {

    Map<Integer, SummerTimeDates> dates = Map.of(
        2021, new SummerTimeDates(new Date(2021, 03, 28), new Date(2021, 10, 31)),
        2022, new SummerTimeDates(new Date(2022, 03, 26), new Date(2022, 10, 30)),
        2023, new SummerTimeDates(new Date(2023, 03, 26), new Date(2023, 10, 29))
    ); 
        
    
    public static void main(String[] args) {
        //Test Cases
        var s = new SummerTime();
        System.out.println(s.isSummerTime(new Date(2022,03,25))); //False
        System.out.println(s.isSummerTime(new Date(2022,03,27))); //True
        System.out.println(s.isSummerTime(new Date(2022,10,29))); //True
        System.out.println(s.isSummerTime(new Date(2023,10,29))); //False
        System.out.println(s.isSummerTime(new Date(2022,10,30))); //False
        
    }


    public boolean isSummerTime(Date date) {
        return dates.get(date.getYear()).isSummerTime(date);
    }


    class SummerTimeDates {
        private Date startDate, endDate;

        public SummerTimeDates(Date startDate, Date endDate) {
            this.startDate = startDate;
            this.endDate = endDate;
        }

        public boolean isSummerTime(Date date){
            return date.after(startDate) && date.before(endDate);
        }
    }
}