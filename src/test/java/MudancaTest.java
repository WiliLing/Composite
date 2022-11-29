import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MudancaTest {

    @Test
    void deveRetornarObjetoMochila() {
        Inventario inventario1 = new Inventario("Comida");

        Inventario inventario2 = new Inventario("Equipamentos");
        Itens itens21 = new Itens("Corda", 2);
        Itens itens22 = new Itens("Barraca", 1);
        inventario2.addConteudo(itens21);
        inventario2.addConteudo(itens22);


        Inventario inventario3 = new Inventario("Bens Valiosos");
        Itens itens31 = new Itens("Aneis de ouro", 10);
        Itens itens32 = new Itens("Jóias", 2);
        inventario3.addConteudo(itens31);
        inventario3.addConteudo(itens32);

        Inventario objeto = new Inventario("Tesouro");
        objeto.addConteudo(inventario1);
        objeto.addConteudo(inventario2);
        objeto.addConteudo(inventario3);

        Mochila mochila = new Mochila();
        mochila.setObjeto(objeto);

        assertEquals("Inventario: Tesouro\n" +
                "Inventario: Comida\n" +
                "Inventario: Equipamentos\n" +
                "Itens: Corda - quantidade: 2\n" +
                "Itens: Barraca - quantidade: 1\n" +
                "Inventario: Bens Valiosos\n" +
                "Itens: Aneis de ouro - quantidade: 10\n" +
                "Itens: Jóias - quantidade: 2\n", mochila.getObjeto());
    }

    @Test
    void deveRetornarExecacaoMochilaSemObjeto() {
        try {
            Mochila mochila = new Mochila();
            mochila.getObjeto();
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("Mochila sem item", e.getMessage());
        }
    }
}
