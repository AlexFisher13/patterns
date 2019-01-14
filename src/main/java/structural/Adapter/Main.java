package structural.Adapter;

public class Main {
    public static void main(String[] args) {
        CRUDinterface crud = new AdapterJavaTOCrud();

        crud.insert();
        crud.select();
        crud.update();
        crud.delete();
    }
}
