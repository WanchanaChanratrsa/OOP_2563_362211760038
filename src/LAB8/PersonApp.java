package LAB8;

public class PersonApp {
    public static void main(String[] args) {

        //objects

        Person p1 = new Person();
        p1.setName("Wanchana Charnstras");
        p1.setAge(34);

        Person p2 = new Teacher("RUTS");
        p2.setName("Wanchana Charnstras");
        p2.setAge(37);

        Person p3 = new Doctor("Thungsong");
        p3.setName("Wanchana Charnstras");
        p3.setAge(40);

        //call introduce
        p1.introduce();
        p2.introduce();
        p3.introduce();

    }
}