import java.util.*;

/**
 * @author Christian.Lam@student.csulb.edu
 */
public class Main
{
    /**
     *  Main Method to Display All Functions
     * @param args unused
     */
    public static void main ( String args[])
    {
        Employee[] list = new Employee[9];
        list[0] = new Staff("Allen", "Paita", "123", "M", new GregorianCalendar(59,Calendar.MARCH,23), 50.00);
        list[1] = new Staff("Zapata","Steven","456","F", new GregorianCalendar(64,Calendar.AUGUST,12), 35.00);
        list[2] = new Staff("Rios","Enrique","789","M", new GregorianCalendar(70,Calendar.JULY,2), 40.00);
        list[3] = new Faculty("Johnson","Anne","243","F", new GregorianCalendar(62,Calendar.MAY,27),Faculty.Levels.FU, new Education("Ph.D","Engineering","3"));
        list[4] = new Faculty("Bouris","Williams","791","F", new GregorianCalendar(75,Calendar.APRIL,14), Faculty.Levels.AO, new Education( "Ph.D","English","1"));
        list[5] = new Faculty("Andrade","Christopher","623","F", new GregorianCalendar(80,Calendar.JUNE,22), Faculty.Levels.AS, new Education("MS","Physical Education","0"));
        list[6] = new Partime("Guzman","Augusto","455","F", new GregorianCalendar(77,Calendar.SEPTEMBER,10), 35.00, 30);
        list[7] = new Partime("Depirro","Martin","678","F", new GregorianCalendar(87,Calendar.OCTOBER,15), 30.00, 15);
        list[8] = new Partime("Aldaco","Marque","945","M", new GregorianCalendar(88,Calendar.DECEMBER,24), 20.00, 35);
        System.out.println("=======================================");
        for(int i = 0; i < list.length; i++)
        {
            System.out.println(list[i] + "\n");
        }

        double partSalary = 0;
        for ( Employee employee : list)
        {
            if ( employee instanceof Partime)
            {
                partSalary += employee.monthlyEarning();
            }
        }
        System.out.println("=======================================");
        System.out.println("Total Monthly Salary for Part-Time Staff:");
        System.out.println(partSalary);
        System.out.println("=======================================");

        double employeeSalary = 0;
        for ( Employee employee : list)
        {
            employeeSalary += employee.monthlyEarning();
        }
        System.out.println("Total Monthly Salary for all Employees:");
        System.out.println(employeeSalary);

        Arrays.sort(list, new IDComparator());
        System.out.println("=======================================");
        System.out.println("Employee ID In Ascending Order: \n");
        for ( Employee employee : list )
        {
            System.out.println(employee + "\n");
        }
        System.out.println("=======================================");

        System.out.println("Employee Names In Descending Order: \n");
        Arrays.sort(list, Collections.reverseOrder());
        for ( Employee employee : list )
        {
            System.out.println(employee + "\n");
        }
        System.out.println("=======================================");

        System.out.println("Duplicating Faculty Object: \n");
        try
        {
            Faculty norm = new Faculty("Johnson","Anne","243","F", new GregorianCalendar(62,Calendar.MAY,27),Faculty.Levels.FU, new Education("Ph.D","Engineering","3"));
            System.out.println(norm);
            System.out.println(norm.getEducation().getDegree());
            System.out.println(norm.getEducation().getMajor());
            System.out.println(norm.getEducation().getResearchNum());
            System.out.println("\n");
            Faculty norm2 = (Faculty) norm.clone();
            norm2.setEducation(new Education("MS","Physics","2"));
            norm2.setID("432");
            norm2.setFirstName("Annie");
            System.out.println(norm2);
            System.out.println(norm2.getEducation().getDegree());
            System.out.println(norm2.getEducation().getMajor());
            System.out.println(norm2.getEducation().getResearchNum());

        }
        catch ( Exception e)
        {
            System.out.println("Clone Exception");
        }
            System.out.println("=======================================");
    }
}
