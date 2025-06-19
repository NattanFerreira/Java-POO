package q73_74;

public class Desenho {
    private final FiguraGeometrica f1, f2;
    private final float x1, y1, x2, y2;

    public Desenho(FiguraGeometrica f1, float x1, float y1, FiguraGeometrica f2, float x2, float y2) {
        this.f1 = f1;
        this.f2 = f2;
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }
    
    public void apresenta(){
        System.out.println("A figura 1 esta desenhada em x = " + x1 + " e y = " + y1);
        f1.descricao();
        System.out.println("A figura 2 esta desenhada em x = " + x2 + " e y = " + y2);
        f2.descricao();
    }
}
