public class Forma {
    private String nombre;

    public Forma(String nombre) {
        this.nombre = nombre;
    }
    public double area(){
        return 0;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    @Override
    public String toString() {
        return "Forma{" +
                "nombre='" + nombre + '\'' +
                '}';
    }

    public static class Esfera extends Forma{
        private double radio;

        public Esfera(String nombre,double radio) {
            super(nombre);
            this.radio=radio;
        }
        public double area(){
            return 4*Math.PI*(Math.pow(radio,2));
        }
        public double getRadio() {
            return radio;
        }
        public void setRadio(double radio) {
            this.radio = radio;
        }
        @Override
        public String toString() {
            return "Esfera{" +
                    "nombre='" + getNombre() + '\'' +
                    ", radio=" + radio +
                    '}';
        }
    }

    public static class Rectangulo extends Forma{
        private double longitud;
        private double altura;

        public Rectangulo(String nombre, double longitud, double altura) {
            super(nombre);
            this.longitud = longitud;
            this.altura = altura;
        }
        public double area(){
            return longitud*altura;
        }
        public double getLongitud() {
            return longitud;
        }
        public void setLongitud(double longitud) {
            this.longitud = longitud;
        }
        public double getAltura() {
            return altura;
        }
        public void setAltura(double altura) {
            this.altura = altura;
        }
        @Override
        public String toString() {
            return "Rectangulo{" +
                    "nombre='" + getNombre() + '\'' +
                    ", longitud=" + longitud +
                    ", altura=" + altura +
                    '}';
        }
    }

    public static class Cilindro extends Forma{
        private double radio;
        private double altura;

        public Cilindro(String nombre, double radio, double altura) {
            super(nombre);
            this.radio = radio;
            this.altura = altura;
        }
        public double area(){
            return Math.PI*(Math.pow(radio,2))*altura;
        }
        public double getRadio() {
            return radio;
        }
        public void setRadio(double radio) {
            this.radio = radio;
        }
        public double getAltura() {
            return altura;
        }
        public void setAltura(double altura) {
            this.altura = altura;
        }
        @Override
        public String toString() {
            return "Cilindro{" +
                    "nombre='" + getNombre() + '\'' +
                    ", radio=" + radio +
                    ", altura=" + altura +
                    '}';
        }
    }

    public static class Pintura {
        private double cobertura;

        public Pintura(double cobertura) {
            this.cobertura = cobertura;
        }
        public double getCobertura() {
            return cobertura;
        }
        public void setCobertura(double cobertura) {
            this.cobertura = cobertura;
        }
        public double cantPintura(Forma objeto) {
            return (objeto.area() / cobertura);
        }
    }

    public static class MainPintura {
        public static void main(String[] args){

            Pintura pintura = new Pintura(250);

            Rectangulo rectangulo = new Rectangulo("Rectángulo",20,35);
            Esfera esfera = new Esfera("Esfera",15);
            Cilindro cilindro = new Cilindro("Cilindro",10,30);

            System.out.println("------------------------------------------------------------------------");
            System.out.println("Vamos a calcular la cantidad de pintura necesaria para cada forma.");
            System.out.println("------------------------------------------------------------------------");
            System.out.println(rectangulo.toString());
            System.out.println("Cantidad de pintura necesaria para pintar un rectángulo es: "+
                    pintura.cantPintura(rectangulo));
            System.out.println("------------------------------------------------------------------------");
            System.out.println(esfera.toString());
            System.out.println("Cantidad de pintura necesaria para pintar una esfera es: "+
                    pintura.cantPintura(esfera));
            System.out.println("------------------------------------------------------------------------");
            System.out.println(cilindro.toString());
            System.out.println("Cantidad de pintura necesaria para pintar un cilindro es: "+
                    pintura.cantPintura(cilindro));
        }
    }
}
