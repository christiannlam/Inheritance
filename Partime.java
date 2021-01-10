import java.util.Calendar;
public class Partime extends Staff
{
    private int hoursPerWeek;
    private int FOUR_WEEKS = 4;

    public Partime ()
    {
        super();
        hoursPerWeek = 0;
    }

    public Partime(String lastName, String firstName , String ID, String gender, Calendar birthDate, double hourlyRate, int hoursPerWeek)
    {
        super(lastName,firstName,ID,gender,birthDate,hourlyRate);
        this.hoursPerWeek = hoursPerWeek;
    }

    public int getHours()
    {
        return hoursPerWeek;
    }

    public void setHours( int hours )
    {
        hoursPerWeek = hours;
    }

    public double monthlyEarning()
    {
        return super.getHourlyRate() * ( hoursPerWeek * FOUR_WEEKS);
    }

    public String toString()
    {
        return "ID Employee Number: " + getID() + "\nEmployee Name: " + getFirstName() + " " + getLastName() + "\nBirth Date: " +
                birthDate.get(Calendar.MONTH) + "/" + birthDate.get(Calendar.DATE) + "/" + birthDate.get(Calendar.YEAR) + "\nHours Per Month: "
                + getHours() + "\nMonthly Salary: " + monthlyEarning();
    }

}
