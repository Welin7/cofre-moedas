
public class Dolar extends Moeda {

	public Dolar(double valor, String descricao) {
		super(valor, descricao);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void Converter() {
		// TODO Auto-generated method stub
		
		// Conversão de Dólar para Real
		double taxaDolar = 4.81, valorReal;
		valorReal = (super.GetValor() * taxaDolar);
		super.SetValor(valorReal);
	}

	@Override
	public void Informacao() {
		// TODO Auto-generated method stub

	}

}
