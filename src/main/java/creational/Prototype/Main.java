package creational.Prototype;

public class Main {
    public static void main(String[] args) {
        //Создаем объект
        Human human = new Human("Sanya", 27, true);
        //Создаем его полную копию, со всеми его приватными его полями
        Human humanClone = (Human) human.copy();

        System.out.println(human);
        System.out.println(humanClone);
    }
}
