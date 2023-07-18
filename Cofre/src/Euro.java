
public class Euro extends Moeda {

	public Euro(double valor, String descricao) {
		super(valor, descricao);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void Converter() {
		// TODO Auto-generated method stub
		
		// Conversão de Euro para Real
		double taxaEuro = 5.40, valorReal;
		valorReal = (super.GetValor() * taxaEuro);
		super.SetValor(valorReal);
	}

	@Override
	public void Informacao() {
		// TODO Auto-generated method stub

	}

}
