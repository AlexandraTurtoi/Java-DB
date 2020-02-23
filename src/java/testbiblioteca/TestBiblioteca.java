/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testbiblioteca;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Alexandra
 */
public class TestBiblioteca {

    /**
     * @param args the command line arguments
     */
   
	public static void main(String[] args) throws SQLException, ClassNotFoundException, IOException {
		Driver driver=new Driver();
                
		/*
		//int codcli =0;
                for(int i=301;i<310;i++){
		GestiuneClienti gc = new GestiuneClienti();
		Client clientCautat = gc.getDateClient(i);
		System.out.println(clientCautat);	   
                }*/
             Client cl= new Client();
             Interogari  intero=new Interogari();
            // System.out.println(intero.getAutor());
            // System.out.println(intero.getEditura());
           //  System.out.println(intero.getClienti());
            //System.out.println(intero.getCarte());
            // System.out.println(intero.getImprumut());
            System.out.println(intero.getAnumitAutor());
             

	}

	
	
	
}

    
