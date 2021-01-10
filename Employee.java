import java.util.Calendar;
import java.util.GregorianCalendar;


public abstract class Employee implements EmployeeInfo, Comparable<Employee>
{
    private String lastName;
    private String firstName;
    private String IDNum;
    private String gender;
    protected Calendar birthDate = new GregorianCalendar();

    public Employee()
    {
        lastName = "";
        firstName = "";
        IDNum = "";
        gender = "";
        this.birthDate.set(Calendar.YEAR,0);
        this.birthDate.set(Calendar.MONTH,0);
        this.birthDate.set(Calendar.DAY_OF_MONTH,0);
    }

    public Employee( String lastName, String firstName, String IDNum, String gender, Calendar birthDate)
    {
        this.lastName = lastName;
        this.firstName = firstName;
        this.IDNum = IDNum;
        this.gender = gender;
        this.birthDate = birthDate;
    }

    public String toString()
    {
        return "ID Employee Number: " + IDNum + "\nEmployee Name: " + firstName + " " + lastName + "\nBirth Date: " +
                birthDate.get(Calendar.MONTH) + "/" + birthDate.get(Calendar.DATE) + "/" + birthDate.get(Calendar.YEAR);
    }

    public String getLastName()
    {
        return lastName;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public String getID()
    {
        return IDNum;
    }

    public String getGender()
    {
        return gender;
    }

    public Calendar getBirthDate()
    {
        return birthDate;
    }

    public void setLastName( String lastName )
    {
        this.lastName = lastName;
    }

    public void setFirstName( String firstName )
    {
        this.firstName = firstName;
    }

    public void setID( String IDNum )
    {
        this.IDNum = IDNum;
    }

    public void setGender( String gender )
    {
        this.gender = gender;
    }

    public void setBirthDate (Calendar birthDate)
    {
        this.birthDate = birthDate;
    }

    public abstract double monthlyEarning();

    public int compareTo( Employee other)
    {
        if ( this.lastName.equals(other))
        {
            return 0;
        }

        int compareLast = this.lastName.compareTo(other.getLastName());
        if ( compareLast == 0 )
        {
            return this.lastName.compareTo(other.getLastName());
        }
        return compareLast;

    }
}

