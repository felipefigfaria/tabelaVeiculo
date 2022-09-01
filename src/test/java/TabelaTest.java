import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TabelaTest {

    @Test
    public void deveRetornarClasse1() {
        Tabela tabela = new Tabela();
        tabela.setAno(1970);
        tabela.setPeso(1199);
        assertEquals(1, tabela.obterClasse());
    }

    @Test
    public void deveRetornarClasse2() {
        Tabela tabela = new Tabela();
        tabela.setAno(1970);
        tabela.setPeso(1699);
        assertEquals(2, tabela.obterClasse());
    }

    @Test
    public void deveRetornarClasse3() {
        Tabela tabela = new Tabela();
        tabela.setAno(1970);
        tabela.setPeso(1701);
        assertEquals(3, tabela.obterClasse());
    }

    @Test
    public void deveRetornarClasse4() {
        Tabela tabela = new Tabela();
        tabela.setAno(1971);
        tabela.setPeso(1199);
        assertEquals(4, tabela.obterClasse());
    }

    @Test
    public void deveRetornarClasse5() {
        Tabela tabela = new Tabela();
        tabela.setAno(1971);
        tabela.setPeso(1700);
        assertEquals(5, tabela.obterClasse());
    }

    @Test
    public void deveRetornarClasse6() {
        Tabela tabela = new Tabela();
        tabela.setAno(1971);
        tabela.setPeso(1701);
        assertEquals(6, tabela.obterClasse());
    }

    @Test
    public void deveRetornarClasse7() {
        Tabela tabela = new Tabela();
        tabela.setAno(1980);
        tabela.setPeso(1599);
        assertEquals(7, tabela.obterClasse());
    }

    @Test
    public void deveRetornarClasse8() {
        Tabela tabela = new Tabela();
        tabela.setAno(1980);
        tabela.setPeso(1600);
        assertEquals(8, tabela.obterClasse());
    }

    @Test
    public void deveRetornarTaxa1() {
        Tabela tabela = new Tabela();
        tabela.setAno(1970);
        tabela.setPeso(1199);
        assertEquals(16.50f, tabela.obterTaxa());
    }

    @Test
    public void deveRetornarTaxa2() {
        Tabela tabela = new Tabela();
        tabela.setAno(1970);
        tabela.setPeso(1699);
        assertEquals(25.50f, tabela.obterTaxa());
    }

    @Test
    public void deveRetornarTaxa3() {
        Tabela tabela = new Tabela();
        tabela.setAno(1970);
        tabela.setPeso(1701);
        assertEquals(46.50f, tabela.obterTaxa());
    }

    @Test
    public void deveRetornarTaxa4() {
        Tabela tabela = new Tabela();
        tabela.setAno(1971);
        tabela.setPeso(1199);
        assertEquals(27.00f, tabela.obterTaxa());
    }

    @Test
    public void deveRetornarTaxa5() {
        Tabela tabela = new Tabela();
        tabela.setAno(1971);
        tabela.setPeso(1700);
        assertEquals(30.50f, tabela.obterTaxa());
    }

    @Test
    public void deveRetornarTaxa6() {
        Tabela tabela = new Tabela();
        tabela.setAno(1971);
        tabela.setPeso(1701);
        assertEquals(52.50f, tabela.obterTaxa());
    }

    @Test
    public void deveRetornarTaxa7() {
        Tabela tabela = new Tabela();
        tabela.setAno(1980);
        tabela.setPeso(1599);
        assertEquals(19.50f, tabela.obterTaxa());
    }

    @Test
    public void deveRetornarTaxa8() {
        Tabela tabela = new Tabela();
        tabela.setAno(1980);
        tabela.setPeso(1600);
        assertEquals(55.50f, tabela.obterTaxa());
    }



}