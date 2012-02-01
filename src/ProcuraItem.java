import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class ProcuraItem {

	List<ItemDoAcervo> itens = new LinkedList<ItemDoAcervo>();
	Map<String, ItemDoAcervo> mapa = new HashMap<String, ItemDoAcervo>();

	public void adiciona(ItemDoAcervo item) {
		this.itens.add(item);
		mapa.put(item.getNome(), item);
	}

	public ItemDoAcervo buscaPorNome(String nome) {
		return mapa.get(nome);
	}

}
