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

public class Client {
	
	private int codcli;
	private String nume;
	private String prenume;
	private Date datan;
	private String telefon;
        private String email;
	
	@Override
	public String toString() {
		return "\nCodcli:  " + codcli + ", Nume: " + nume + ", Prenume: " + prenume + ", Data Nastere: "
				+ datan + ", Telefon:  " + telefon + " Email: "+email;
	}
	
	
	

	public String getNume() {
		return nume;
	}
	public void setNume(String nume) {
		this.nume = nume;
	}
	public String getPrenume() {
		return prenume;
	}
	public void setPrenume(String prenume) {
		this.prenume = prenume;
	}
	public Date getDataNastere() {
		return datan;
	}
	public void setDataNastere(Date dataNastere) {
		this.datan = dataNastere;
	}
	public String  getTelefon() {
		return telefon;
	}
	public void setTelefon(String tel) {
		this.telefon = tel;
	}
        public String  getEmail() {
		return email;
	}
	public void setEmail(String em) {
		this.email = em;
	}
        
	public int getCodcli() {
		return codcli;
	}
	public void setCodcli(int codcli) {
		this.codcli = codcli;
	}
	public Client getClienti(){
       return Client.this;
            
       }
	

}
