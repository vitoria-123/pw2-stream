import java.util.List;
import java.util.Optional;

public class ManipulacaoProdutos {

	public static void main(String[] args) {
		Produto p1 = new Produto();
		p1.setId(1);
		p1.setNome("Detergente");
		p1.setCategoria(null);
		p1.setPreco(5);
		
		Produto p2 = new Produto();
		p2.setId(2);
		p2.setNome("Queijo");
		p2.setCategoria(null);
		p2.setPreco(10);
		
		Produto p3 = new Produto();
		p3.setId(3);
		p3.setNome("Alface");
		p3.setCategoria(null);
		p3.setPreco(3);
		
		Produto p4 = new Produto();
		p4.setId(4);
		p4.setNome("Energ?tico");
		p4.setCategoria(null);
		p4.setPreco(8);
		
		Produto p5 = new Produto();
		p5.setId(5);
		p5.setNome("Papel higi?nico");
		p5.setCategoria(null);
		p5.setPreco(10);
		
		List<Produto> list = List.of(p1, p2, p3, p4, p5);
				
		
		
		/*System.out.println();
		lista.stream().filter(e -> e.getPreco() > 50).findFirst();*/
		
		/*if(lista.is)
		lista.forEach(e ->{
			System.out.println("Esse produto custa mais de 50: " + e.getNome());
		});*/
		Optional<Produto> existe = 
		list.stream().filter(e -> e.getCategoria() == CategoriaEnum.bebida).findFirst();
		if(existe.isPresent()) {
			System.out.println("Tem bebida na compra");
		}
	}
}
