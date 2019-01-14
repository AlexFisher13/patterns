package structural.Decorator;

public class DeveloperDecorator implements Developer {

    Developer developer;

    public DeveloperDecorator(Developer developer) {
        this.developer = developer;
    }

    public String makeJob() {
        return developer.makeJob();
    }
}