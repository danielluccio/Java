public class WrapperTypes {
    public static void main(String[] args){

        // O uso da classe wrapper permite acesso a diversos tipos de métodos

        int age = 5;
        Integer ageWrapper = Integer.valueOf(age);

        System.out.println("Comparação entre o tipo p com o w: " + ageWrapper.compareTo(ageWrapper));
        System.out.println("Comparação entre o tipo p com o w: " + ageWrapper.compareTo(7));
        System.out.println("Comparação entre o tipo p com o w: " + ageWrapper.compareTo(4));
    }
}
