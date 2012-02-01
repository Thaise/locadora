
public class Test {

	public static void main(String[] args) {
		ItemDoAcervo item = new ItemDoAcervo("Matrix", 5);
		item.setCodigo(1);
		item.setGenero("Ficção");
		item.setTipo("Lançamento");
		
		ProcuraItem procura = new ProcuraItem();
		procura.adiciona(item);
		System.out.println(procura.buscaPorNome("Matrix"));
	}

}
