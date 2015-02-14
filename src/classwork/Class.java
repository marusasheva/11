package classwork;


public class Class {
    public static void main(String[] args) {
    PersonalInfo pi=new PersonalInfo();
        pi.setAge(15);
        pi.setWeight(45);
        pi.setHeight(150);
        pi.setYear(1995);
        System.out.println(pi.getAge());
        System.out.println(pi.getWeight());
        System.out.println(pi.getHeight());
        System.out.println(pi.getYear());
    }
}
