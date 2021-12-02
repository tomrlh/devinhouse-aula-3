public class Livro {
    String titulo;
    int paginas;
    String fabricante;

    Livro(String titulo, int paginas, String fabricante){
        this.titulo = titulo;
        this.paginas = paginas;
        this.fabricante = fabricante;
    }

    String getTitulo() {
        return titulo;
    }

    int getPaginas() {
        return this.paginas;
    }

    String getFabricante() {
        return this.fabricante;
    }

    public String toString(){
        return "titulo: " + titulo + "\npáginas: " + paginas + "\nfabricante; " + fabricante;
    }


    public static void main(String[] args) {

        Livro livro = new Livro("titulo",102810,"fabricante");

        System.out.printf("título: %s\n, páginas: %d\n, fabricante: %s",livro.titulo,livro.paginas,livro.fabricante);

    }
}