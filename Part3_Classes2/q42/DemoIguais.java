package q42;

public class DemoIguais {
    public static void main(String[] args) {

        Iguais<Integer> objeto1 = new Iguais<Integer>(3, 3, 3);
        objeto1.imprimirAtributos();
        System.out.println("Esse objeto tem: "+ objeto1.ContarIguais() + " atributos iguais");
        Iguais<Integer> objeto2 = new Iguais<Integer>(3, 5, 4);
        objeto2.imprimirAtributos();
        System.out.println("Esse objeto tem: "+ objeto2.ContarIguais() + " atributos iguais");
        Iguais<Integer> objeto3 = new Iguais<Integer>(2, 4, 2);
        objeto3.imprimirAtributos();
        System.out.println("Esse objeto tem: "+ objeto3.ContarIguais() + " atributos iguais");

        Iguais<String> objeto4 = new Iguais<>("UFERSA", "UERN", "IFRN");
        objeto4.imprimirAtributos();
        System.out.println("Esse objeto tem: "+ objeto4.ContarIguais() + " atributos iguais");
        Iguais<String> objeto5 = new Iguais<>("UFERSA", "UFERSA", "UFERSA");
        objeto5.imprimirAtributos();
        System.out.println("Esse objeto tem: "+ objeto5.ContarIguais() + " atributos iguais");
        Iguais<String> objeto6 = new Iguais<>("UFERSA","IFRN", "UFERSA");
        objeto6.imprimirAtributos();
        System.out.println("Esse objeto tem: "+ objeto6.ContarIguais() + " atributos iguais");
    }
}
