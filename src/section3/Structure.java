package section3;

public class Structure {
    public enum Dia {
        LUNES(1),
        MARTES(2),
        MIERCOLES(3),
        JUEVES(4),
        VIERNES(5),
        SABADO(6),
        DOMINGO(7);

        private int valor;

        // Constructor para inicializar el valor
        Dia(int valor) {
            this.valor = valor;
        }

        // Método para obtener el valor
        public int getValor() {
            return valor;
        }
    }

    public enum Review {
        verybad(1),
        bad(2),
        normal(3),
        good(4),
        excelent(5);

        private int valor;

        // Constructor para inicializar el valor
        Review(int valor) {
            this.valor = valor;
        }

        // Método para obtener el valor
        public int getValor() {
            return valor;
        }
    }

    public static void main(String[] args) {

    }

    public void otherStructureDatas(){
        class Person { //typedef Custom Types
            int age;
            float hight;
        }
        Dia today = Dia.LUNES;
        Review curse = Review.excelent;
        Person dad = new Person();
        dad.age = 75;
        dad.hight = 1.89F;
        System.out.println("Age" + dad.age);
        System.out.println("Hight" + dad.hight);
    }
}
