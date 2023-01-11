package desafio.composicao.desafio.mercado;

import java.util.ArrayList;

public class Cliente {
ArrayList<Compra> compraCliente = new ArrayList<>();
String nome;
 Cliente(String nome) {
	this.nome = nome;
}
void addCompra() {
	Compra compra = new Compra();
	compraCliente.add(compra);
	
}

public static void main(String[] args) {
	
	Cliente cliente = new Cliente("Raphael");
	
	Compra compra = new Compra();
	compra.compraProduto.add(new Itens((new Produto("Notebook", 6.7)), 10));
	cliente.compraCliente.add(compra);
	
	System.out.println(compra.obterValor());
	
	
}
		
	
}

