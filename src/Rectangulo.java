public class Rectangulo {

    int base;
    int altura;

    public Rectangulo(int base, int altura)

    {
        this.base = base;
        this.altura = altura;
    }

    public int Perimetro() {
        int r = (this.base * 2) + (this.altura * 2);
        return r;
    }


    public int Area() {
        int r = (this.base * this.altura);
        return r;
    }
}





