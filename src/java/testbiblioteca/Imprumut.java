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

import java.util.Date;

public class Imprumut {
	
	private int codimprumut;
        private int codc;
        private int codcli;
	private Date dataimpr;
	private Date dataret;
	
	
	@Override
	public String toString() {
		return "\nCodimprumut:  " + codimprumut + ", Codc: " + codc + ", Codcli: " + codcli + ", Data imprumut: "
				+ dataimpr + ", Data retur:  " + dataret;
	}
	
	
	

	
	
	public int  getCodc() {
		return codc;
	}
	public void setCodc(int codc) {
		this.codc = codc;
	}
     
	public int getCodcli() {
		return codcli;
	}
	public void setCodcli(int codcli) {
		this.codcli = codcli;
	}
	public int getCodimprumut() {
		return codimprumut;
	}
	public void setCodimprumut(int codimprumut) {
		this.codimprumut = codimprumut;
	}
        public Date getDataimpr() {
		return dataimpr;
	}
	public void setDataimpr(Date impr) {
		this.dataimpr = impr;
	}    
         public Date getDataret() {
		return dataret;
	}
	public void setDataret(Date ret) {
		this.dataret = ret;
	}  
        
 }
	


