/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elitis;

/**
 *
 * @author Rob
 */
public class Dottore {
    public String nome;
    public String cognome;
    public String codFiscale;
    public String email;
    public String NumTel;
    public String Password;
    public String comuneResidenza;
    public String datanascita;
    public String matricola;

    
    
    public Dottore (){      
    }

    
    public Dottore (String nome, String cognome, String codFiscale, String email, String NumTel, String Password, String comuneResidenza, String datanascita, String matricola){
        this.nome=nome;
        this.cognome=cognome;
        this.codFiscale=codFiscale;
        this.email=email;
        this.NumTel=NumTel;
        this.Password = Password;
        this.comuneResidenza = comuneResidenza;
        this.datanascita = datanascita;
        this.matricola = matricola;
        }
    
    
    //Metodi GET
        public String getPassword(){
            return this.Password;
        }

        public String getNome(){
            return this.nome;
        }

        public String getCognome(){
            return this.cognome;
        }

        public String getCodFiscale(){
            return this.codFiscale;
        }

        public String getEmail(){
            return this.email;
        }

        public String getNumTel(){
            return this.NumTel;
        }
        
        public String getComuneResidenza(){
            return this.comuneResidenza;
        }
        
        public String getDataNascita(){
            return this.datanascita;
        }
        
        public String getMatricola(){
            return this.matricola;
        }
}
