package S302Nivell3;

import java.util.ArrayList;
import java.util.List;

public class LlistaCompra {
	List <Article> LlistaArticles=new ArrayList <Article>();
	
	public void AddLlista(Article article) {
		LlistaArticles.add(article);
		
	}
	
	

	public void  mostraLlista() {
		LlistaArticles.forEach(x->System.out.println(x.getNomArticle()+":"+Math.round((x.getPreuCanvi()* 100d) / 100d)+" "+x.getMoneda()));
	}

}
