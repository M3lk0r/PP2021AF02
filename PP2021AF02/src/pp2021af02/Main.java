package pp2021af02;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		String produto;
		produto = JOptionPane.showInputDialog("Informe o nome do produto desejado: ");
		
		ICamisaEsportiva camisaEsportiva = FabricaEsportivaFactory.buscarProduto(produto);
		JOptionPane.showMessageDialog(null, camisaEsportiva.getCamisaEsportiva(), "Escolhida a camisa do time:", 1);
	}
}
