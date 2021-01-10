import java.util.Calendar;
import java.lang.*;
public class Faculty extends Employee implements Cloneable
{
    private double AO_EARNING = 1.5;
    private double FU_EARNING = 2.0;
    private Education education;
    public void setEducation ( Education b)
    {
        education = b;
    }
    public Education getEducation()
    {
        return education;
    }
    public Object clone() throws CloneNotSupportedException
    {
        Faculty clone = (Faculty) super.clone();
        education = new Education(getEducation().getDegree(),getEducation().getMajor(),getEducation().getResearchNum());
        clone.setEducation(education);
        return clone;
    }
    enum Levels
    {
        AS, AO, FU
    }

    private Levels position;

    public Faculty()
    {
        super();
        position = null;
        education = new Education();
    }

    public Faculty(String lastName, String firstName , String ID, String gender, Calendar birthDate, Levels position, Education education)
    {
        super(lastName,firstName,ID,gender,birthDate);
        this.position = position;
        this.education = education;
    }

    public Levels getPosition()
    {
        return position;
    }

    public void setPosition( Levels position)
    {
        this.position = position;
    }
    public double monthlyEarning()
    {
        double earning;
        if( getPosition().equals(Faculty.Levels.AS ) )
        {
            earning = FACULTY_MONTHLY_SALARY;
        }
        else if ( getPosition().equals(Faculty.Levels.AO ) )
        {
            earning = AO_EARNING * FACULTY_MONTHLY_SALARY;
        }
        else
        {
            earning = FU_EARNING * FACULTY_MONTHLY_SALARY;
        }
        return earning;
    }

    public String toString()
    {
        String output;
        if ( getPosition().equals(Faculty.Levels.AS) )
        {
           output = super.toString() + "\n" + "Assistant" + "\nMonthly Salary: " + monthlyEarning();
        }
        else if ( getPosition().equals(Faculty.Levels.AO) )
        {
            output = super.toString() + "\n" + "Associate" + "\nMonthly Salary: " + monthlyEarning();
        }
        else
        {
            output = super.toString() + "\n" + "Full Professor" + "\nMonthly Salary: " + monthlyEarning();
        }
        return output;
    }

}

