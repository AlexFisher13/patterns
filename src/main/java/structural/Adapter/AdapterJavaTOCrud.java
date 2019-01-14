package structural.Adapter;

//Объект который адаптирует класс JavaMethods к интерфейсу CRUDinterface
public class AdapterJavaTOCrud extends JavaMethods implements CRUDinterface {
    public void insert() {
        saveObject();
    }

    public void select() {
        loadObject();
    }

    public void update() {
        updateObject();
    }

    public void delete() {
        deleteObject();
    }
}
