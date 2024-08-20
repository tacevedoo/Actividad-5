public class Cilindro extends FiguraGeometrica{
    private double radio;
    private double altura;

    public Cilindro(double radio, double altura) {
        this.radio = radio;
        this.altura = altura;
        this.setVolumen(CalcularVolumen());
        this.setSuperficie(CalcularSuperficie());
    }

    public double CalcularVolumen() {
        double Volumen = Math.PI * altura * Math.pow(radio, 2.0);
        return Volumen;
    }

    public double CalcularSuperficie() {
        double Area1 = 2 * (Math.PI * Math.pow(radio, 2.0));
        double Area2 = 2 * Math.PI * radio * altura;
        return Area1 + Area2;
    }
}
