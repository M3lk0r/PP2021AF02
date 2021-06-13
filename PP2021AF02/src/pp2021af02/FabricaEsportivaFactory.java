package pp2021af02;

public class FabricaEsportivaFactory {
	
	public static ICamisaEsportiva buscarProduto(String produto) {
		if (produto.toLowerCase().contains("Brasil".toLowerCase())) {
			return new Nike();
		}
		else if (produto.toLowerCase().contains("Flamengo".toLowerCase())) {
			return new Adidas();
		}
		else if (produto.toLowerCase().contains("Botafogo".toLowerCase())) {
			return new Puma();
		}
		else if (produto.toLowerCase().contains("Fluminense".toLowerCase())) {
			return new Umbro();
		}
		else if (produto.toLowerCase().contains("Vasco".toLowerCase())) {
			return new Kappa();
		}
		
		return null;
	}
}
