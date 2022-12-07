import java.util.List;

public class Student {

    public String studentName;
    public String studentSurname;
    public double marksAverage;

    /**
     *
     * @param name
     * @param surname
     * @param average
     */
    public Student(String name, String surname, double average){
        this.studentName = name;
        this.studentSurname = surname;
        this.marksAverage = average;
    }

    /**
     *
     * @param listOfMarks
     * @return
     */
    public static double getAverageMark(List<? extends Number> listOfMarks){ //<? extends Number> vuol dire passare parametri di qualsiasi tipo che estende number, Number è la classe numerica base/libreria. Possiamo inserire tutte le classi che rendono number
        return (listOfMarks.get(0).doubleValue() + listOfMarks.get(1).doubleValue()) / 2;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentName='" + studentName + '\'' +
                ", studentSurname='" + studentSurname + '\'' +
                ", marksAverage=" + marksAverage +
                '}';
    }
}
