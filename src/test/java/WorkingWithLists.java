import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class WorkingWithLists {
    @Test
    public void createAndWorkWithLists() {
        Student valera = new Student();
        valera.setFirstName("Valera");
        valera.setLastName("The Tester");
        valera.setEmail("valera");

        Student liga = new Student ("Liga", "Ivanova", "liga@test.lv", "+3712855441");
        Student artis = new Student ("Artis", "Gether", "artisgether@test.com", "+371288888");
        Student vadim = new Student("Vadim", "Baroiko", "vadim.boroiko@test.lv", "+3712565458");

        List<Student> students = new ArrayList<>();
        students.add(valera);  //0
        students.add(liga);  //1
        students.add(artis);  //2
        students.add(vadim);  //3

        //--------------FOR----------------
        for (int i= 0; i < students.size(); i++ ) {    //i = i + 1 ->> i++
            System.out.println(students.get(i).getFirstName());

        }

        //----------------FOREACH------------------
        for (Student s : students ) {
            System.out.println(s.getFirstName() + "" + s.getLastName());
            System.out.println(s.getFullName());
        }

        //-----------------FOREACH with IF--------------------

        for (Student s : students ) {
            System.out.println("Printing students with phone nr starting with +371");
            if (s.getPhone().startsWith("+371")) {
                System.out.println(s.getFullName());

            }
        }
    }
}
