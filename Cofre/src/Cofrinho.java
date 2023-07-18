
import java.util.ArrayList;
import java.util.List;

public class Cofrinho {
	private List<Moeda> ListaMoedas;

	public Cofrinho() {
		ListaMoedas = new ArrayList<>();
	}

	public void Adicionar(Moeda moeda) {
		ListaMoedas.add(moeda);
	}

	public void Remover(Moeda moeda) {
		ListaMoedas.remove(moeda);
	}

	public List<Moeda> ListarMoedas() {
		return ListaMoedas;
	}
}