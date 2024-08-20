public class Piramide extends FiguraGeometrica{
    private double base;
    private double altura;
    private double apotema;
    
    public Piramide(double base, double altura, double apotema) {
        this.altura = altura;
        this.base = base;
        this.apotema = apotema;
        this.setVolumen(CalcularVolumen());
        this.setSuperficie(CalcularSuperficie());
    }

    public double CalcularVolumen() {
        double Volumen = (Math.pow(base, 2.0) * altura) / 3;
        return Volumen;
    }

    public double CalcularSuperficie() {
        double areaBase = Math.pow(base, 2.0);
        double areaLado = 2.0 * base * apotema;
        return areaBase + areaLado;
    }
}