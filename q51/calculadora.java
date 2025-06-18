package q51;

public class calculadora {
    private double prod = 1;
    public double produto(double...numeros){
        if(numeros.length == 0){
            System.out.println("Sem valores, retornando 0.0");
            return 0.0;

        }else{
            for (double produto : numeros) {
                prod*= produto;
            }
        return prod;
        }
    }
}
