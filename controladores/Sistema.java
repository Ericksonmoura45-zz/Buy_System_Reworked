package controladores;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import app.enums.TipoFormaPagamento;
import app.models.compra.Compra;
import app.models.pessoa.Comprador;
import app.models.pessoa.Vendedor;
import app.models.produto.Mostruario;
import app.models.produto.Produto;

public class Sistema {
	public static Scanner scan = new Scanner(System.in);
	public static Set<Comprador> compradores;
	public static Set<Vendedor> vendedores;
	public static List<Compra> compras;
	public static Set<Produto> produtos;
	
	public static Comprador compradorSelecionado;
	public static Vendedor vendedorSelecionado;
	public static Produto produtoSelecionado;
	
	public static void inicializar() {
		Sistema.produtos = new HashSet<Produto>();
		Sistema.compras = new ArrayList<Compra>();
		Sistema.compradores = new HashSet<Comprador>();
		Sistema.vendedores = new HashSet<Vendedor>();
		//testing
		Sistema.produtos.add(new Produto("456", "Danone", 3.96, 1));
		Sistema.produtos.add(new Produto("457", "Leite", 6.00, 12));
		Sistema.produtos.add(new Produto("458", "Pneu", 150.99, 4));
		Sistema.produtos.add(new Produto("459", "Roda", 60.00, 4));
		Sistema.produtos.add(new Produto("460", "Shampoo", 15.00, 3));
		Sistema.produtos.add(new Produto("461", "Celular", 1500.00, 2));
		Sistema.produtos.add(new Produto("462", "Meia", 10.00, 10));
		Sistema.produtos.add(new Produto("463", "Refrigerante", 7.00, 5));
		Sistema.produtos.add(new Produto("464", "Polpa", 3.50, 200));
        //teste
		Sistema.compras.add(new Compra("456.456.789-23", "50.266.711/0001-80", TipoFormaPagamento.BOLETO, Sistema.produtos));
		Sistema.compradores.add(new Comprador("Erickson comprador", "999.888.777-44", 13000.59, Sistema.compras, Sistema.produtos));
		Sistema.vendedores.add(new Vendedor("Erickson vendedor", "50.266.711/0001-80"));
	}
}
