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


public class Editura{
	
	private int code;
	private String numed;
	private String telefon;
        private String adresa;
	
	@Override
	public String toString() {
		return "\nCode:  " + code + ", Nume editura: " + numed + ", Telefon:  " + telefon + " Adresa: "+adresa;
	}
	
	
	

	public String getNumed() {
		return numed;
	}
	public void setNumed(String numed) {
		this.numed = numed;
	}
	
	public String  getTelefon() {
		return telefon;
	}
	public void setTelefon(String tel) {
		this.telefon = tel;
	}
        public String  getAdresa() {
		return adresa;
	}
	public void setAdresa(String ads) {
		this.adresa = ads;
	}
        
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	
	

}
