package ma.projet.beans;

public class Salle {
    //Attributs
    private int id;
    private String code;
    private String libelle;
    private static int count =0;


    //Getters
    public int getId(){
        return id;
    }
    public String getCode() {
        return code;
    }

    public String getLibelle() {
        return libelle;
    }

    //Setters
    public void setId(int id){
        this.id = id;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    //Constructeur parametrer
    public Salle(int id,String code,String libelle){
        this.id = id;
        this.code = code;
        this.libelle = libelle;
    }
    //Constructeur par defaut
    public Salle(){
        id = 0;
        code = "";
        libelle = "";
    }

    //Constructeur par copie
    public Salle(Salle S){
        this.id = S.id;
        this.code = S.code;
        this.libelle = S.libelle;
    }

    //Methode toString()
    public String toString(){
        return "- Id de la salle :" + id + "     avec le code :" + code + "    et libelle :" + libelle;
    }
    //Methode equals
    public void equals(){
        String s1 = "Salle 1";
        String s2 = "Salle 2";
        s1.equals(s2);
    }



}
