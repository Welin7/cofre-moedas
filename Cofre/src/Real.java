
public class Real extends Moeda {

	public Real(double valor, String descricao) {
		super(valor, descricao);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void Converter() {
		// TODO Auto-generated method stub
		double valorReal;
		valorReal = super.GetValor();
		super.SetValor(valorReal);
	}

	@Override
	public void Informacao() {
		// TODO Auto-generated method stub

	}

}
