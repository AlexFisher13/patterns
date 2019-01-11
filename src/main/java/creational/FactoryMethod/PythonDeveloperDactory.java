package creational.FactoryMethod;

public class PythonDeveloperDactory implements DeveloperFactory {
    public Developer createDeveloper() {
        return new PythonDeveloper();
    }
}
