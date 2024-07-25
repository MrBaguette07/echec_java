import java.util.ArrayList;
public class Fou extends Piece {
    public Fou(){
        super('B', new Position(0,1));
	}
    public Fou(char couleur, Position position){
        super(couleur, position);
    }
    public String getType(){
        return "fou";
    }
    public ArrayList<Position> getDeplacementPossible(Plateau plateau) {
        int x = this.getPosition().getX()+1;
        int y = this.getPosition().getY()+1;
        int hautD = 0;
        int hautG = 0;
        int basG = 0;
        int basD = 0;
        ArrayList<Position> possible = new ArrayList<Position>();
        while(basD == 0 && x<8 && x>=0 && y>=0&& y<8 && (plateau.getCase(x, y) == null || plateau.getCase(x, y).getCouleur() != this.getCouleur())){
    		possible.add(new Position(x,y));
            if (plateau.getCase(x, y) != null) {
                if (plateau.getCase(x, y).getCouleur() != this.getCouleur()) {
                    basD = 1;
                }
            }
    		x++;
    		y++;
    	}
    	x = this.getPosition().getX()-1;
    	y = this.getPosition().getY()-1;
    	while(hautG == 0 && x<8 && x>=0 && y>=0&& y<8 && (plateau.getCase(x, y) == null || plateau.getCase(x, y).getCouleur() != this.getCouleur())){
    		possible.add(new Position(x,y));
            if (plateau.getCase(x, y) != null) {
                if (plateau.getCase(x, y).getCouleur() != this.getCouleur()) {
                    hautG = 1;
                }
            }
    		x--;
    		y--;
    	}
    	
    	x = this.getPosition().getX()-1;
    	y = this.getPosition().getY()+1;
    	while(basG == 0 && x<8 && x>=0 && y>=0&& y<8 && (plateau.getCase(x, y) == null || plateau.getCase(x, y).getCouleur() != this.getCouleur())){
    		possible.add(new Position(x,y));
            if (plateau.getCase(x, y) != null) {
                if (plateau.getCase(x, y).getCouleur() != this.getCouleur()) {
                    basG = 1;
                }
            }
    		x--;
    		y++;
    	}
    	x = this.getPosition().getX()+1;
    	y = this.getPosition().getY()-1;
    	while(hautD == 0 && x<8 && x>=0 && y>=0&& y<8 && (plateau.getCase(x, y) == null || plateau.getCase(x, y).getCouleur() != this.getCouleur())){
    		possible.add(new Position(x,y));
            if (plateau.getCase(x, y) != null) {
                if (plateau.getCase(x, y).getCouleur() != this.getCouleur()) {
                    hautD = 1;
                }
            }
    		x++;
    		y--;
    	}
        return possible;
    }
}
