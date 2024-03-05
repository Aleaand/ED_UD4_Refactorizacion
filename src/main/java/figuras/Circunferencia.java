package figuras;

public class Circunferencia {

    private double radio;

    public Circunferencia(double radio) {
        this.radio = radio;
    }

    /**
     * @param rad the radio to set
     */
    public void setRadio(double rad) {
        this.radio = rad;
    }

    public void imprimir() {
        System.out.println("Di�metro: " + 2 * getRadio());
        System.out.println("Color: " + "rojo");
        double area1 = 2 * 3.1416 * getRadio() * getRadio();
        double area = area1;
        System.out.println(area);
    }

    public boolean esIgual(Circunferencia otro, boolean considerarDecimales) {
        double radio1 = this.getRadio();
        double radio2 = otro.getRadio();
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

    private double getRadio() {
        return radio;
    }
}
