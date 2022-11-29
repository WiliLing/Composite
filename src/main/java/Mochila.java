public class Mochila {

    private Conteudo objeto;

    public void setObjeto(Conteudo objeto) {
        this.objeto = objeto;
    }

    public String getObjeto() {
        if (this.objeto == null) {
            throw new NullPointerException("Mochila sem item");
        }
        return this.objeto.getConteudo();
    }
}
