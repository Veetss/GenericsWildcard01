import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Double> individualMarksListLisa = new ArrayList<>();
        List<Integer> projectMarksListJeremy = new ArrayList<>();

        individualMarksListLisa.add(0, 9.5);
        individualMarksListLisa.add(1, 7.8);

        projectMarksListJeremy.add(0, 5);
        projectMarksListJeremy.add(1, 2);

        double LisaAvg = Student.getAverageMark(individualMarksListLisa);
        double JeremyAvg = Student.getAverageMark(projectMarksListJeremy);

        List<Student> listOfStudents = new ArrayList<>();

        listOfStudents.add(new Student("Lisa", "Stuart", LisaAvg));
        listOfStudents.add(new Student("Jeremy", "Green", JeremyAvg));

        System.out.println(listOfStudents.get(0).toString());
        System.out.println(listOfStudents.get(1).toString());
    }
}
