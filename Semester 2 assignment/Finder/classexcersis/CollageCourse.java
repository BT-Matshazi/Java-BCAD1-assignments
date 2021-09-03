public class CollageCourse 
{

    private String course;
    private int coursenumber;
    private double coursefee;
    private int coursecredits;

    public CollageCourse(String course, int coursenumber, int coursecredits) 
    {
        this.course = course;
        this.coursenumber = coursenumber;
        this.coursecredits = coursecredits;

        coursefee=coursecredits*120;
    }

    public double getCourseFee()
    {
        coursefee=coursecredits*120;
        return coursefee;
    }

    public void display()
    {
        System.out.println("department " + course + " course number " 
                            + coursenumber + " course fee" + coursefee);
    }

    
}
