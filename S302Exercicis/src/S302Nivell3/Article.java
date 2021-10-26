package S302Nivell3;

public class Article {
	String nomArticle;
	String moneda;
	Double preu;
	Double preuCanvi;
	
	public Article(String nomArticle,	String moneda,Double preu,Double preuCanvi) {
		this.nomArticle=nomArticle;
		this.moneda=moneda;
		this.preu=preu;
		this.preuCanvi=preuCanvi;
	}

	public String getNomArticle() {
		return nomArticle;
	}

	public void setNomArticle(String nomArticle) {
		this.nomArticle = nomArticle;
	}

	public String getMoneda() {
		return moneda;
	}

	public void setMoneda(String moneda) {
		this.moneda = moneda;
	}

	public Double getPreu() {
		return preu;
	}

	public void setPreu(Double preu) {
		this.preu = preu;
	}

	public Double getPreuCanvi() {
		return preuCanvi;
	}

	public void setPreuCanvi(Double preuCanvi) {
		this.preuCanvi = preuCanvi;
	}

}
