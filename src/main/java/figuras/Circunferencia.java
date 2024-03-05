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
        System.out.println("Di�metro: " + 2 * getRad());
        System.out.println("Color: " + "rojo");
        double area = calcularArea();
        System.out.println(area);
    }

    private double calcularArea() {
        double area = 2 * PI * getRad() * getRad();
        return area;
    }
    private static final double PI = 3.1416;

    public boolean esIgual(Circunferencia otro, boolean considerarDecimales) {
        double radio1 = this.getRad();
        double radio2 = otro.getRad();
        if (considerarDecimales) {
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
