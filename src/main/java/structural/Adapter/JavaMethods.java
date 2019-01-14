package structural.Adapter;

public class JavaMethods {

    //Методы класса которые нам нужно адаптировать к CRUDinterface
    public void saveObject(){
        System.out.println("Saving java object...");
    }
    public void updateObject(){
        System.out.println("Update java object...");
    }
    public void loadObject(){
        System.out.println("Load java object...");
    }
    public void deleteObject(){
        System.out.println("Delete java object...");
    }
}
