import java.util.Calendar;
public class Staff extends Employee
{
    private double hourlyRate;

    public Staff()
    {
        super();
        hourlyRate = 0;

    }

    public Staff( String lastName, String firstName , String ID, String gender, Calendar birthDate, double hourlyRate)
    {
        super(lastName,firstName,ID,gender,birthDate);
        this.hourlyRate = hourlyRate;
    }

    public double getHourlyRate()
    {
        return hourlyRate;
    }

    public void setHourlyRate( double value )
    {
        hourlyRate = value;
    }

    public double monthlyEarning()
    {
        return hourlyRate * STAFF_MONTHLY_HOURS_WORKED;
    }

    public String toString()
    {
        return super.toString() + "\nFull Time" + "\nMonthly Salary: " + monthlyEarning();
    }

}
