package S302Nivell3;

public class Main {

	public static void main(String[] args) {
		String nomArticle1 = "camisa";
		String moneda1 = "Dolar";
		Double preu1 = 12.5;
		Double preuCanvi1 = new CalculaPreu(moneda1, preu1).preuCanvi();

		Article article1 = new Article(nomArticle1, moneda1, preu1, preuCanvi1);

		String nomArticle2 = "pantalons";
		String moneda2 = "libra";
		Double preu2 = 25.5;
		Double preuCanvi2 = new CalculaPreu(moneda2, preu2).preuCanvi();

		Article article2 = new Article(nomArticle2, moneda2, preu1, preuCanvi2);

		LlistaCompra miLista = new LlistaCompra();
		miLista.AddLlista(article2);
		miLista.AddLlista(article1);
		miLista.mostraLlista();
	}
}
