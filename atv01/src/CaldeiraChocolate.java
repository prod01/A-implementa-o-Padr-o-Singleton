public class CaldeiraChocolate {

    private static CaldeiraChocolate instance;
    public boolean vazia;
    public boolean fervida;

    private CaldeiraChocolate() {
        System.out.println("Criando uma instância Singleton");
        vazia = true;
        fervida = false;
    }

    public static CaldeiraChocolate getInstancia() {
        if (instance == null) {
            instance = new CaldeiraChocolate();
        }
        return instance;
    }

    // Método para encher a caldeira
    public void encher() {
        if (!vazia) {
            System.out.println("A caldeira já está cheia!");
        } else {
            System.out.println("Caldeira esta sendo cheia com leite e chocolate.");
            vazia = false;
            System.out.println("Caldeira cheia com leite e chocolate.");
        }

    }

    // Método para ferver a mistura
    public void ferver() {

        if (fervida) {
            System.out.println("A mistura já foi fervida.");
        } else {

            if (!vazia) {
                System.out.println("A mistura está fervendo.");
                fervida = true;
                System.out.println("A mistura ferveu.");

            } else {
                System.out.println("Não é possível ferver. A caldeira está vazia.");
            }

        }

    }

    // Método para drenar a mistura
    public void drenar() {

        if (!fervida) {
            System.out.println("Não é possível drenar. A mistura ainda não foi fervida.");

        } else {

            if (!vazia) {
                System.out.println("A mistura fervida esta sendo drenada.");
                vazia = true;
                System.out.println("A mistura fervida foi drenada.");
            } else {
                System.out.println("Não é possível drenar. A caldeira está vazia.");
            }

        }
    }

}
