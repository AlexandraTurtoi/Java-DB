/*s
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testbiblioteca;

/**
 *
 * @author Alexandra
 */;


public class Carte {
	
	private int codc;
        private int code;
        private int coda;
	private String titlu;
	private String categorie;
	private int nrpg;
	
	@Override
	public String toString() {
		return "\nCodc:  " + codc + ", Code: " + code + ", Coda: " + coda + ", Titlu: "
				+ titlu + ", Categorie:  " + categorie+ " Numar pagini: "+nrpg;
	}
	
	
	

	public String getTitlu() {
		return titlu;
	}
	public void setTitlu(String titlu) {
		this.titlu = titlu;
	}
	public String getCategorie() {
		return categorie;
	}
	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}
	
	public int  getCodc() {
		return codc;
	}
	public void setCodc(int codc) {
		this.codc = codc;
	}
     
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public int getCoda() {
		return coda;
	}
	public void setCoda(int coda) {
		this.coda = coda;
	}
        public int getNrpg() {
		return nrpg;
	}
	public void setNrpg(int nrpg) {
		this.nrpg = nrpg;
	}    
 }
	


