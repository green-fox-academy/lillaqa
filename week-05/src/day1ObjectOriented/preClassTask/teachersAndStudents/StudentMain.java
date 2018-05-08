package day1ObjectOriented.preClassTask.teachersAndStudents;



public class StudentMain {

    public static void main(String[] args) {

        Students jane = new Students();
        Teachers mike = new Teachers();

        jane.question(mike);
        mike.teach(jane);

    }
}
