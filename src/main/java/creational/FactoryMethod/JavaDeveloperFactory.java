package creational.FactoryMethod;

public class JavaDeveloperFactory implements DeveloperFactory {
    public Developer createDeveloper() {
        return new JavaDeveloper();
    }
}
