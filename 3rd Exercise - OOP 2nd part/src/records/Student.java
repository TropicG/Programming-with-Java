package records;

public record Student(String name, int facultyNum) {

    //this is used to make checks whether the arguments are valid
    public Student {

        if(name.isBlank()){
            throw new IllegalArgumentException("Student's name is blank");
        }

        if(facultyNum < 0){
            throw new IllegalArgumentException("Faculty num is negative");
        }
    }

    public static void main(String[] args) {
        Student student = new Student("Krasimir Krasimirov", 82128);
        System.out.println(student);

        try{
            Student student1 = new Student(" ", 111);
            System.out.println(student1.name + student1.facultyNum);
        }
        catch(IllegalArgumentException exception){
            System.out.println(exception.getMessage());
        }
    }

}
