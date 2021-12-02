package modificadores;

public class PatoPrivate1 {
    private String barulho;

    private void grasnar() {
        System.out.println("grasnando");
    }

    private void fazerBarulho() {
        System.out.println(barulho);
        grasnar();
    }
}
