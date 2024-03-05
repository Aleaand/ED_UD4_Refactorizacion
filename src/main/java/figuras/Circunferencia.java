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
        String color = "rojo";
        System.out.println("Di�metro: " + 2 * getRad());
        System.out.println("Color: " + color);
        double area = 2 * 3.1416 * getRad() * getRad();
        System.out.println(area);
    }

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
