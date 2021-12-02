package modificadores;

import modificadores.PatoDefault1;

public class PatoPublic1 {
    public String barulho;

    public void fazerBarulho() {
        System.out.println("barulho PatoPublic1");
        // não compila poiss PatoDefault está sem modificador declarado (default)
        // PatoDefault1;
    }
}
