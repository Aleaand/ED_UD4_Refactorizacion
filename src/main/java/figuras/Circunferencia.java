package figuras;

public class Circunferencia {

    private double radio;

    /**
     * @param rad the radio to set
     */
    public void setRad(double rad) {
        this.radio = rad;
    }

    public Circunferencia(double radio) {
        this.radio = radio;
    }

    public void imprimir() {
        final double d = 2 * getRad();
        System.out.println("Di�metro: " + d);
        System.out.println("Color: " + "rojo");
        double area = 2 * PI * getRad() * getRad();
        System.out.println(area);
    }
    private static final double PI = 3.1416;

    public boolean esIgual(Circunferencia otro, boolean conDecimales) {
        double radio1 = this.getRad();
        double radio2 = otro.getRad();
        if (conDecimales) {
            if (radio1 == radio2) {
                return true;
            } else {
                return false;
            }
        } else {
            if (Math.abs(radio1 - radio2) < 1) {
                return true;
            } else {
                return false;
            }
        }
    }

    private double getRad() {
        return radio;
    }
}
