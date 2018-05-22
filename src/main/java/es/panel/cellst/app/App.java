package es.panel.cest.app;

/**
 * Hello world!
 */
public class App
{

    private final String message = "Buscandole las cuatro patas al gato";

    public App() {}

    public static void main(String[] args) {
        System.out.println(new App().getMessage());
    }

    private final String getMessage() {
        return message;
    }

}
