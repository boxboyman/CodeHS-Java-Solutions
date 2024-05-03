public class PersonRunner
{
    public static void main(String[] args)
    {
        // Start here!
        Person wg = new Person("Wolfgang Amadeus Mozart","January 27, 1756");
        System.out.println("Name: " + wg.getName());
        System.out.println("Birthday: " + wg.getBirthday());
        Student jnh = new Student("Johann Nepomuk Hummel","November 14, 1778",10,4.0);
        System.out.println("Name: " + jnh.getName());
        System.out.println("Birthday: " + jnh.getBirthday());
        System.out.println("Grade: " + jnh.getGrade());
        System.out.println("GPA: " + jnh.getGpa());
    }
}
