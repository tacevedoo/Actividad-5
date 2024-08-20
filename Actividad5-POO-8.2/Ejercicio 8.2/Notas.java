public class Notas {
    public double[] ListaNotas;

    public Notas() {
        ListaNotas = new double[5];
    }

    public double CalcularPromedio() {
        double suma = 0;
        for(int i=0;i<ListaNotas.length;i++) {
            suma += ListaNotas[i];
        }
        return (suma / ListaNotas.length);
    }

    public double CalcularDesviacion() {
        double prom = CalcularPromedio();
        double suma = 0;
        for(int i=0;i<ListaNotas.length;i++) {
            suma += Math.pow(ListaNotas[i] - prom, 2);
        }
        return Math.sqrt(suma / ListaNotas.length);
    }

    public double CalcularMenor() {
        double menor = ListaNotas[0];
        for(int i=0;i<ListaNotas.length;i++) {
            if(ListaNotas[i] < menor) {
                menor = ListaNotas[i];
            }
        }
        return menor;
    }

    public double CalcularMayor() {
        double mayor = ListaNotas[0];
        for(int i=0;i<ListaNotas.length;i++) {
            if(ListaNotas[i] > mayor) {
                mayor = ListaNotas[i];
            }
        }
        return mayor;
    }
}