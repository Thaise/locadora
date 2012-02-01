import static org.junit.Assert.*;

import org.junit.Test;

public class ItemDoAcervoTest {

	@Test
	public void devePermitirCriarUmItemAcervo() {
		ItemDoAcervo item = new ItemDoAcervo("Matrix", 5);
		item.setCodigo(1);

		assertEquals(1, item.getCodigo());
	}

	@Test
	public void devePermitirCriarUmItemAcervoComNome() {
		ItemDoAcervo item = new ItemDoAcervo("Matrix", 5);
		assertEquals("Matrix", item.getNome());
	}

	@Test
	public void devePermitirCriarUmItemAcervoComGenero() {
		ItemDoAcervo item = new ItemDoAcervo("Matrix", 5);
		item.setGenero("fic��o");

		assertEquals("fic��o", item.getGenero());
	}

	@Test
	public void devePermitirCriarUmItemAcervoComPreco() {
		ItemDoAcervo item = new ItemDoAcervo("Matrix", 5);
		item.setTipo("Acervo");

		assertEquals(2.50, item.getPreco(), 0);
	}

	@Test
	public void deveAdicionarProcuraDeUmItemPorNome() {
		ItemDoAcervo item = new ItemDoAcervo("Matrix", 5);
		item.setCodigo(1);
		item.setGenero("Fic��o");
		item.setTipo("Acervo");
		ProcuraItem procura = new ProcuraItem();
		procura.adiciona(item);

		assertEquals("Codigo: 1\nG�nero: Fic��o\nQuantidade: 5\nPre�o: 2.5",
				procura.buscaPorNome("Matrix").toString());
	}

	@Test
	public void deveAdicionarDoisItensEProcuralosPorNome() {
		ItemDoAcervo item = new ItemDoAcervo("Matrix", 5);
		item.setCodigo(1);
		item.setGenero("Fic��o");
		item.setTipo("Acervo");
		ProcuraItem procura = new ProcuraItem();
		procura.adiciona(item);

		assertEquals("Codigo: 1\nG�nero: Fic��o\nQuantidade: 5\nPre�o: 2.5",
				procura.buscaPorNome("Matrix").toString());
	}

	@Test
	public void deveMostrarDataDeEntregaDeUmItem() {
		ItemDoAcervo item = new ItemDoAcervo("Matrix", 5);
		item.setDiaLocacao(3);
		item.setMesLocacao(1);
		item.setAnoLocacao(2012);

		assertEquals("Data de loca��o: 3/1/2012", item.getDataLocacao());
		assertEquals(6, item.getDataEntrega());
	}

}
