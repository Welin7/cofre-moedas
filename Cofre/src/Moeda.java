
public abstract class Moeda {
	private double valor;
	private String descricao;

	public Moeda(double valor, String descricao) {
		this.valor = valor;
		this.descricao = descricao;
	}

	public String GetDescricao() {
		return descricao;
	}

	public double GetValor() {
		return valor;
	}
	
	public void SetValor(double novoValor) {
		valor = novoValor;
	}

	public abstract void Converter();

	public abstract void Informacao();
}