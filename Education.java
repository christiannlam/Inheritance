public class Education
{
    private String degree;
    private String major;
    private String researchNum;

    public Education()
    {
        degree = "";
        major = "";
        researchNum = "";
    }

    public Education ( String degree, String major, String researchNum)
    {
        this.degree = degree;
        this.major = major;
        this.researchNum = researchNum;
    }

    public String getDegree()
    {
        return degree;
    }

    public String getMajor()
    {
        return major;
    }

    public String getResearchNum()
    {
        return researchNum;
    }

    public void setDegree( String degree)
    {
        this.degree = degree;
    }

    public void setMajor( String major )
    {
        this.major = major;
    }

    public void setResearchNum( String value )
    {
        researchNum = value;
    }

    public Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }



}
