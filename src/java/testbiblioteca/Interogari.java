/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testbiblioteca;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Alexandra
 */
public class Interogari{
public static List<Client> getClienti() throws  SQLException, ClassNotFoundException {
        
        List<Client> lcli = new ArrayList<>();
         Driver conn = new Driver(); 
         Connection connection = null;
          PreparedStatement ps=null;
          ResultSet rs=null;
         try{
         connection= conn.getConnection();
          ps= connection.prepareStatement("SELECT * FROM client;");
          rs=ps.executeQuery();
         while(rs.next()){
             Client client= new Client();
             client.setNume(rs.getString("nume"));
             client.setPrenume(rs.getString("prenume"));
             client.setCodcli(rs.getInt("codcli"));
             client.setDataNastere(rs.getDate("datan"));
             client.setTelefon(rs.getString("Telefon"));
             client.setEmail(rs.getString("email"));
         
             
             lcli.add(client);
         }
         }catch(SQLException | ClassNotFoundException e )
         {
             e.printStackTrace();
         }
         finally{
             if(ps !=null)
             ps.close();
         }
         
         return lcli;
    }


public static List<Autor> getAutor() throws  SQLException, ClassNotFoundException {
     List<Autor> la = new ArrayList<>();
         Driver conn = new Driver(); 
         Connection connection = null;
          PreparedStatement ps=null;
          ResultSet rs=null;
         try{
         connection= conn.getConnection();
          ps= connection.prepareStatement("SELECT * FROM autor;");
          rs=ps.executeQuery();
         while(rs.next()){
             Autor autor= new Autor();
             autor.setNume(rs.getString("nume"));
             autor.setPrenume(rs.getString("prenume"));
             autor.setCoda(rs.getInt("coda"));
         
             
             la.add(autor);
         }
         }catch(SQLException | ClassNotFoundException e )
         {
             e.printStackTrace();
         }
         finally{
             if(ps !=null)
             ps.close();
         }
        
         return la;




    }

public static List<Editura> getEditura() throws  SQLException, ClassNotFoundException {
     List<Editura> le = new ArrayList<>();
         Driver conn = new Driver(); 
         Connection connection = null;
          PreparedStatement ps=null;
          ResultSet rs=null;
         try{
         connection= conn.getConnection();
          ps= connection.prepareStatement("SELECT * FROM editura;");
          rs=ps.executeQuery();
         while(rs.next()){
             Editura editura= new Editura();
             editura.setNumed(rs.getString("numed"));
             editura.setCode(rs.getInt("code"));
             editura.setTelefon(rs.getString("telefon"));
             editura.setAdresa(rs.getString("adresa"));
         
             
             le.add(editura);
         }
         }catch(SQLException | ClassNotFoundException e )
         {
             e.printStackTrace();
         }
         finally{
             if(ps !=null)
             ps.close();
         }
        
         return le;




    }

public static List<Carte> getCarte() throws  SQLException, ClassNotFoundException {
     List<Carte> lc = new ArrayList<>();
         Driver conn = new Driver(); 
         Connection connection = null;
          PreparedStatement ps=null;
          ResultSet rs=null;
         try{
         connection= conn.getConnection();
          ps= connection.prepareStatement("SELECT * FROM carte;");
          rs=ps.executeQuery();
         while(rs.next()){
             Carte carte= new Carte();
             carte.setCodc(rs.getInt("codc"));
             carte.setTitlu(rs.getString("titlu"));
             carte.setCode(rs.getInt("code"));
             carte.setCoda(rs.getInt("coda"));
             carte.setCategorie(rs.getString("categorie"));
             carte.setNrpg(rs.getInt("Numar pagini"));

             lc.add(carte);
         }
         }catch(SQLException | ClassNotFoundException e )
         {
             e.printStackTrace();
         }
         finally{
             if(ps !=null)
             ps.close();
         }
        
         return lc;

    }

public static List<Imprumut> getImprumut() throws  SQLException, ClassNotFoundException {
     List<Imprumut> li = new ArrayList<>();
         Driver conn = new Driver(); 
         Connection connection = null;
          PreparedStatement ps=null;
          ResultSet rs=null;
         try{
         connection= conn.getConnection();
          ps= connection.prepareStatement("SELECT * FROM imprumut;");
          rs=ps.executeQuery();
         while(rs.next()){
             Imprumut imprumut= new Imprumut();
             imprumut.setCodimprumut(rs.getInt("codimprumut"));
             imprumut.setCodc(rs.getInt("codc"));
             imprumut.setCodcli(rs.getInt("codcli"));
             imprumut.setDataimpr(rs.getDate("dataimpr"));
             imprumut.setDataret(rs.getDate("dataret"));

             li.add(imprumut);
         }
         }catch(SQLException | ClassNotFoundException e )
         {
             e.printStackTrace();
         }
         finally{
             if(ps !=null)
             ps.close();
         }
        
         return li;

    }

public static List<Carte> getAnumitAutor() throws  SQLException, ClassNotFoundException, IOException {
     List<Carte> lc = new ArrayList<>();
         Driver conn = new Driver(); 
         Connection connection = null;
          PreparedStatement ps=null;
          ResultSet rs=null;
         try{
         connection= conn.getConnection();
         int n;
          System.out.println("Introdu codul autorului");
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
         n = Integer.parseInt(stdin.readLine());
          ps= connection.prepareStatement("SELECT c.codc,c.code, c.titlu,c.categorie,c.coda,a.nume,c.NumarPagini FROM carte c,autor a WHERE c.coda=a.coda and a.coda="+n+";");
        
          rs=ps.executeQuery();
         while(rs.next()){
             Carte carte= new Carte();
             carte.setCodc(rs.getInt("codc"));
             carte.setTitlu(rs.getString("titlu"));
             carte.setCode(rs.getInt("code"));
             carte.setCoda(rs.getInt("coda"));
             carte.setCategorie(rs.getString("categorie"));
             carte.setNrpg(rs.getInt("NumarPagini"));

             lc.add(carte);
         }
         }catch(SQLException | ClassNotFoundException  e )
         {
             e.printStackTrace();
         }
         finally{
             if(ps !=null)
             ps.close();
         }
        System.out.println("Cartile cu codul autorului");
         return lc;

    }

}