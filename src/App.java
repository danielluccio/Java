public class App {
    public static void main(String[] args) throws Exception {
        StringWrapper stringWrapper = new StringWrapper("Olá Mundo !!");
        System.out.println(stringWrapper.getElement());

        Generics generics = new Generics("Olá Mundo !!");
        System.out.println(generics.getElement());

        Generics generics2 = new Generics(2);
        System.out.println(generics2.getElement());
    }
}
