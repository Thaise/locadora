public class ItemDoAcervo {

	private int codigo;
	private String nome;
	private String genero;
	private int quantidade;
	private double preco;
	private int diaLocacao;
	private int mesLocacao;
	private int anoLocacao;
	private int diaEntrega;
	private String tipo;
	Cliente cliente = new Cliente();

	public String toString() {
		return "Codigo: " + getCodigo() + "\nGênero: " + getGenero()
				+ "\nQuantidade: " + getQuantidade() + "\nPreço: " + getPreco();
	}

	public ItemDoAcervo(String nome, int quantidade) {
		this.nome = nome;
		this.quantidade = quantidade;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getCodigo() {
		return this.codigo;
	}

	public int getQuantidade() {
		return this.quantidade;
	}

	public String getNome() {
		return this.nome;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getGenero() {
		return this.genero;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public double getPreco() {
		if (tipo.equalsIgnoreCase("Lançamento")) {
			this.preco = 3.5;
		} else {
			this.preco = 2.5;
		}
		return this.preco;
	}

	public void setDiaLocacao(int dia) {
		this.diaLocacao = dia;
	}

	public void setMesLocacao(int mes) {
		this.mesLocacao = mes;
	}

	public void setAnoLocacao(int ano) {
		this.anoLocacao = ano;
	}

	public String getDataLocacao() {
		return "Data de locação: " + this.diaLocacao + "/" + this.mesLocacao
				+ "/" + this.anoLocacao;
	}

	public int getDataEntrega() {
		this.diaEntrega = this.diaLocacao + 3;

		return this.diaEntrega;
	}

}
