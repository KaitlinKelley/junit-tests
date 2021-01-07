import java.util.ArrayList;

public class Student {

    private long id;
    private String name;
    private ArrayList<Integer> grades;



    public Student(long id, String name){
        this.id = id;
        this.name = name;
        this.grades = new ArrayList<>();
    }

    public long getId(){
        return this.id;
    }

    public String getName(){
        return this.name;
    }

    public void addGrade(int grade){
        this.grades.add(grade);
    }

    public ArrayList<Integer> getGrades(){
        return this.grades;
    }

    public double getGradeAverage(){
        double gradeSum = 0;
        double numOfGrades = this.grades.size();
        for(int grade: this.grades){
            gradeSum += grade;
        }
        return gradeSum/numOfGrades;
    }



}
