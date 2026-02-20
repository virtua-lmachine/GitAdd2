public class Usuarios {
    private String name;

    public Usuarios(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    static void main() {

    }
    public class Coche {
        // Atributo para saber el estado del coche
        private boolean encendido = false;

        /**
         * Método para encender el coche
         */
        public void encenderCoche() {
            if (!encendido) {
                encendido = true;
                System.out.println("El coche se ha encendido. ¡Rum rum!");
            } else {
                System.out.println("El coche ya estaba encendido.");
            }
        }
    }
}
