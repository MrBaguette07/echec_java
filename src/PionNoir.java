import java.util.ArrayList;
public class PionNoir extends Pion {
    private boolean premierCoup = true;
    public PionNoir(){
        super('N', new Position(0,1));
	}
    public PionNoir(Position position){
        super('N', position);
    }
    public String getType(){
        return "pion";
    }
    public ArrayList<Position> getDeplacementPossible(Plateau plateau) {
        int x = this.getPosition().getX();
        int y = this.getPosition().getY();
        ArrayList<Position> possible = new ArrayList<Position>();
        if(((x+1) >= 0 && (y-1) >= 0 && (x+1) < 8 && (y-1) < 8) && (plateau.getCase(x+1,y-1) != null) && plateau.getCase(x+1,y-1).getCouleur() == 'B'){
            possible.add(new Position(x+1,y-1));
        }
        if(((x-1) >= 0 && (y-1) >= 0 && (x-1) < 8 && (y-1) < 8) && (plateau.getCase(x-1,y-1) != null) && plateau.getCase(x+1,y-1).getCouleur() == 'B'){
            possible.add(new Position(x-1,y-1));
        }
        if(y >= 2 && premierCoup && plateau.getCase(x, y-1) == null && plateau.getCase(x, y-2) == null){
            possible.add(new Position(x,y-1));
            possible.add(new Position(x,y-2));
        }
        if(y > 0 && plateau.getCase(x, y-1) == null){
            possible.add(new Position(x,y-1));
        }
        return possible;
    }

    public boolean isPremierCoup(){
    	return this.premierCoup;
    }

    public void setPremierCoup(boolean b){
    	this.premierCoup = b;
    }
}
