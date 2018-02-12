package methodreference;

public class Student {

    private String name;

    private int score;

    public int compareByScore(Student student){
        return this.getScore() - student.getScore();
    }

    public int compareByName(Student student){
        return this.name.compareToIgnoreCase(student.getName());
    }


    public static int compareStudentByScore(Student s1, Student s2){

        return s1.getScore() - s2.getScore();
    }

    public static int compareStudentByName(Student s1, Student s2){

        return s1.getName().compareToIgnoreCase(s2.getName());
    }

    public Student(String name, int score){

        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
