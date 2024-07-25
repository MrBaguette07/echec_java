import java.util.ArrayList;

public abstract class Piece {
    private char couleur;
    private Position position;

    public Piece(){
        this.couleur = 'B';
        this.position = new Position(0,2);
	}
    Piece(Piece p){
        couleur = p.couleur;
        position = p.position;
    }
    public Piece(char couleur, int x, int y) {
        this.couleur = couleur;
        this.position = new Position(x,y);
    }
    public Piece(char couleur, Position position) {
        this.couleur = couleur;
        this.position = position;
    }
    public Piece(char couleur, String position) {
        this.couleur = couleur;
        this.position = new Position(position);
    }
    public abstract String getType();
    
    public char getCouleur(){
        return this.couleur;
    }
    public Position getPosition(){
        return this.position;
    }
    public void setCouleur(char couleur){
        this.couleur = couleur;
    }
    public void setType(Position position){
        this.position = position;
    }
    public String getNomCourt(){
        return (""+Character.toUpperCase(getType().charAt(0)) + getType().charAt(1) + Character.toUpperCase(this.couleur)+"");
    }
    public String getNomLong(){
        return (""+ getType() + '_' + Character.toUpperCase(this.couleur)+"");
    }
    public abstract ArrayList<Position> getDeplacementPossible(Plateau p);

    public boolean equals(Object obj) {
        if (obj == null) return false;
        
        if (!(obj  instanceof Piece)){
           return false;
        }

        if (((Piece)obj ).couleur != couleur) return false;
        if (((Piece)obj ).position != position) return false;
        
        return true;
    }
    public String toString(){
        String codecouleur;
        if (this.couleur == 'B')
            codecouleur = new String("blanc");
        else
            codecouleur = new String("noir");
        return getType() + " " + codecouleur + " en " + this.position;
    }

}
