package q42;

public class Iguais<T> {
    T a, b, c;

    public Iguais(T a, T b, T c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int ContarIguais(){
        boolean aIgualB = a.equals(b);
        boolean aIgualC = a.equals(c);
        boolean bIgualC = b.equals(c);
        if (aIgualB && aIgualC) {
            return 3;
        }else if(aIgualB || aIgualC || bIgualC){
            return 2;
        } else return 0;
    }
    
    public void imprimirAtributos(){
        System.out.println("Atributo 1:" + a);
        System.out.println("Atributo 2:" + b);
        System.out.println("Atributo 3:" + c);
    }
}
