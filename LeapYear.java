
/**
 * Write a description of class LeapYear here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class LeapYear
{
    public static int numberOfLeapYears(int year1, int year2){
        int leapyears = 0;
        for(int i = year1; i < year2; i++){
            if (isLeapYear(i)){
                leapyears++;
            }
        }
        return leapyears;
    }
    
    public static int dayOfWeek(int month, int day, int year){
        int dayOfWeek = dayOfYear(month,day,year)%7;
        if(dayOfWeek != 6){
            dayOfWeek = dayOfWeek + firstDayOfYear(year);
        } else{
            dayOfWeek = 0;
        }
        return dayOfWeek;
    }
}
