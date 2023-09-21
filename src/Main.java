class Main {
    public static void main(String[] args) {

        double radio, circ, area;
        double pi = 3.14;
        radio = 4.0;
        circ = 2* pi *radio;
        area = pi * Math.pow(radio, 2);

        System.out.println("La Circunferencia: " + circ);
        System.out.println("El area: " + area);

    }
}