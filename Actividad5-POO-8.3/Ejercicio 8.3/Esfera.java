public class Esfera extends FiguraGeometrica{
   private double radio;
   
   public Esfera(double radio) {
        this.radio = radio;
        this.setVolumen(CalcularVolumen());
        this.setSuperficie(CalcularSuperficie());
   }

   public double CalcularVolumen() {
        double Volumen = 1.333 * Math.PI * Math.pow(radio, 3.0);
        return Volumen;
   }

   public double CalcularSuperficie() {
        double Superficie = 4 * Math.PI * Math.pow(radio, 2.0);
        return Superficie;
   }
}
