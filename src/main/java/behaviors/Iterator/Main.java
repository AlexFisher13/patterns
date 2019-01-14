package behaviors.Iterator;

public class Main {
    public static void main(String[] args) {
        String[] skills = {"Java", "Spring", "Hibernate", "PostgreSQL"};

        JavaDeveloper dev = new JavaDeveloper("Fisher",  skills);

        Iterator iterator = dev.getIterator();
        System.out.println("Developer: " + dev.getName());
        System.out.println("Skills: ");

        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
    }
}
