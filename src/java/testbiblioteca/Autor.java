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


public class Autor {
	
	private int coda;
	private String nume;
	private String prenume;
	
	
	@Override
	public String toString() {
		return "\nCoda:  " + coda + ", Nume: " + nume + ", Prenume: " + prenume ;
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
	
        
	public int getCoda() {
		return coda;
	}
	public void setCoda(int coda) {
		this.coda = coda;
	}
	
            
   }
	


