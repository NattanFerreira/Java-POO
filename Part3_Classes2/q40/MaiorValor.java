package q40;

public class MaiorValor {
    public static int intMaior(int n1, int n2){
        return Math.max(n1, n2);
    }

    public static int intMaior(int n1, int n2, int n3){
        return Math.max(intMaior(n1, n2), n3);
    }

    public static int intMaior(int n1, int n2, int n3, int n4){
        return Math.max(intMaior(n1, n2, n3), n4);
    }

    public static int intMaior(int n1, int n2, int n3, int n4, int n5){
        return Math.max(intMaior(n1, n2, n3, n4), n5);
    }

    public static double doubleMaior(double n1, double n2){
        return Math.max(n1, n2);
    }

    public static double doubleMaior(double n1, double n2, double n3){
        return Math.max(doubleMaior(n1, n2), n3);
    }

    public static double doubleMaior(double n1, double n2, double n3, double n4){
        return Math.max(doubleMaior(n1, n2, n3), n4);
    }

    public static double doubleMaior(double n1, double n2, double n3, double n4, double n5){
        return Math.max(doubleMaior(n1, n2, n3, n4), n5);
    }
}