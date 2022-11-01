package ma_projet_deo;

import ma.projet.beans.Salle;

import java.util.ArrayList;
import java.util.List;

public class SalleService implements IDao<Salle>{
    List<Salle> salles = new ArrayList<>();
    //Methode Ajouter

    public boolean create(Salle o) {
        return salles.add(o);
    }

    //Methode de supprimer un objet

    public boolean delete(Salle o) {
        return salles.remove(o);
    }

    //Methode de modifier

    public boolean update(Salle o) {
        for(Salle s : salles){
            if(s.getId() == o.getId()){
                s.setCode(o.getCode());
                s.setLibelle(o.getLibelle());
                return true;
            }
        }
        return false;
    }

    public List<Salle> findAll() {
        return salles;
    }


    public Salle findById(int id) {
        for (Salle s : salles) {
            if (s.getId() == id)
                return s;
        }
        return null;
    }
}
