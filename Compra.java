package desafio.composicao.desafio.mercado;

import java.util.ArrayList;

public class Compra {
ArrayList<Itens> compraProduto = new ArrayList();

void addItens(Produto Produto, int quantidade) {
	this.compraProduto.add(new Itens(Produto , quantidade));
	
	
}

double obterValor(){
	double total = 0;
	for (Itens itens : compraProduto) {
		
		total += itens.Produto.preco * itens.quantidade;
		
		
	}
	return total;
}
}
