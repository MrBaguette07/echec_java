import java.util.ArrayList;
public class Tour extends Piece {
    private boolean premierCoup;
    public Tour(){
        super('B', new Position(0,1));
	}
    public Tour(char couleur, Position position){
        super(couleur, position);
        this.premierCoup = true;
    }
    public String getType(){
        return "tour";
    }
    public ArrayList<Position> getDeplacementPossible(Plateau plateau) {
        int x = this.getPosition().getX()+1;
        int y = this.getPosition().getY();
        int haut = 0;
        int bas = 0;
        int gauche = 0;
        int droite = 0;
        ArrayList<Position> possible = new ArrayList<Position>();
        while(droite==0 &&x<8 && x>=0 && y>=0&& y<8 && (plateau.getCase(x, y) == null || plateau.getCase(x, y).getCouleur() != this.getCouleur())){
            possible.add(new Position(x,y));
            if (plateau.getCase(x, y) != null) {
                if (plateau.getCase(x, y).getCouleur() != this.getCouleur()) {
                    droite = 1;
                }
            }
            x++;
        }
    	x = this.getPosition().getX()-1;
    	
    	while(gauche==0 &&x<8 && x>=0 && y>=0&& y<8 && (plateau.getCase(x, y) == null || plateau.getCase(x, y).getCouleur() != this.getCouleur())){
    		possible.add(new Position(x,y));
            if (plateau.getCase(x, y) != null) {
                if (plateau.getCase(x, y).getCouleur() != this.getCouleur()) {
                    gauche = 1;
                }
            }
    		x--;
    	}
    	x = this.getPosition().getX();
    	y = this.getPosition().getY()+1;
    	while(bas==0 &&x<8 && x>=0 && y>=0&& y<8 && (plateau.getCase(x, y) == null || plateau.getCase(x, y).getCouleur() != this.getCouleur())){
    		possible.add(new Position(x,y));
            if (plateau.getCase(x, y) != null) {
                if (plateau.getCase(x, y).getCouleur() != this.getCouleur()) {
                    bas = 1;
                }
            }
    		y++;
    	}
    	x = this.getPosition().getX();
    	y = this.getPosition().getY()-1;
    	while(haut==0 &&x<8 && x>=0 && y>=0&& y<8 && (plateau.getCase(x, y) == null || plateau.getCase(x, y).getCouleur() != this.getCouleur())){
    		possible.add(new Position(x,y));
            if (plateau.getCase(x, y) != null) {
                if (plateau.getCase(x, y).getCouleur() != this.getCouleur()) {
                    haut = 1;
                }
            }
    		y--;
    	}
        return possible;
    }
    public boolean getPremierCoup(){
		return premierCoup;
	}
	
	public void setPremierCoup(boolean premierCoup){
		this.premierCoup = premierCoup;
	}
}
