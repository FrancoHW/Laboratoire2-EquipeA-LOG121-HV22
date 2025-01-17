package Framework;

/**
 * <p>Description de la classe</p>
 *
 * @author Franco Huynh, Gabriel M. Borges & Thiago Ferreira
 * @version 1.0
 * @since 2022-02-24 9:20 a.m.
 */
public class CollectionJoueur<T extends Comparable> {
    private Joueur[] lstJoueur;

    public CollectionJoueur(int lstJoueurCapacite){
        lstJoueur = new Joueur[lstJoueurCapacite];
    }

    public void ajouterJoueur(Joueur joueur){
        for (int i = 0; i < lstJoueur.length; i++){
            if (lstJoueur[i] == null){
                lstJoueur[i] = joueur;
                System.out.println("Ajouté!");
                break;
            }
            if (lstJoueur[lstJoueur.length-1] != null){
                System.out.println("Tableau rempli!");
                break;
            }
        }
    }

    public iterateurJoueur creerIterateur(){
        iterateurJoueur iteJoueur = new iterateurJoueur(lstJoueur);
        return iteJoueur;
    }
}
