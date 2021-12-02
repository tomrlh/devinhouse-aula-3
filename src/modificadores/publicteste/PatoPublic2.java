package modificadores.publicteste;

import modificadores.PatoPublic1;

public class PatoPublic2 {
    public String barulho;

    protected void fazerBarulho() {
        new PatoPublic1().fazerBarulho();
    }
}
