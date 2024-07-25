import java.util.ArrayList;
public class Cavalier extends Piece {
    public Cavalier(){
        super('B', new Position(0,1));
	}
    public Cavalier(char couleur, Position position){
        super(couleur, position);
    }
    public String getType(){
        return "cavalier";
    }
    public ArrayList<Position> getDeplacementPossible(Plateau plateau) {
        int x = this.getPosition().getX();
        int y = this.getPosition().getY();
        ArrayList<Position> possible = new ArrayList<Position>();
        if(plateau.getCase(x, y).getCouleur() == 'B'){
    		if(((x-2) >= 0 && (y-1) >= 0 && (x-2) < 8 && (y-1) < 8) && ((plateau.getCase(x-2,y-1) == null) || plateau.getCase(x-2,y-1).getCouleur() == 'N')){
    			possible.add(new Position(x-2,y-1));
    		}
    		if(((x-1) >= 0 && (y-2) >= 0 && (x-1) < 8 && (y-2) < 8) && ((plateau.getCase(x-1,y-2) == null) || plateau.getCase(x-1,y-2).getCouleur() == 'N')){
    			possible.add(new Position(x-1,y-2));
    		}
    		if(((x+1) >= 0 && (y-2) >= 0 && (x+1) < 8 && (y-2) < 8) && ((plateau.getCase(x+1,y-2) == null) || plateau.getCase(x+1, y-2).getCouleur() == 'N')){
    			possible.add(new Position(x+1,y-2));
    		}
    		if(((x+2) >= 0 && (y-1) >= 0 && (x+2) < 8 && (y-1) < 8) && ((plateau.getCase(x+2,y-1) == null) || plateau.getCase(x+2,y-1).getCouleur() == 'N')){
    			possible.add(new Position(x+2,y-1));
    		}
    		if(((x+2) >= 0 && (y+1) >= 0 && (x+2) < 8 && (y+1) < 8) && ((plateau.getCase(x+2,y+1) == null) || plateau.getCase(x+2,y+1).getCouleur() == 'N')){
    			possible.add(new Position(x+2,y+1));
    		}
    		if(((x+1) >= 0 && (y+2) >= 0 && (x+1) < 8 && (y+2) < 8) && ((plateau.getCase(x+1,y+2) == null) || plateau.getCase(x+1, y+2).getCouleur() == 'N')){
    			possible.add(new Position(x+1,y+2));
    		}
    		if(((x-1) >= 0 && (y+2) >= 0 && (x-1) < 8 && (y+2) < 8) && ((plateau.getCase(x-1,y+2) == null) || plateau.getCase(x-1, y+2).getCouleur() == 'N')){
    			possible.add(new Position(x-1,y+2));
    		}
    		if(((x-2) >= 0 && (y+1) >= 0 && (x-2) < 8 && (y+1) < 8) && ((plateau.getCase(x-2,y+1) == null) || plateau.getCase(x-2,y+1).getCouleur() == 'N')){
    			possible.add(new Position(x-2,y+1));
    		}
    	}
    	else{
    		if(((x-2) >= 0 && (y-1) >= 0 && (x-2) < 8 && (y-1) < 8) && ((plateau.getCase(x-2,y-1) == null) || plateau.getCase(x-2,y-1).getCouleur() == 'B')){
    			possible.add(new Position(x-2,y-1));
    		}
    		if(((x-1) >= 0 && (y-2) >= 0 && (x-1) < 8 && (y-2) < 8) && ((plateau.getCase(x-1,y-2) == null) || plateau.getCase(x-1,y-2).getCouleur() == 'B')){
    			possible.add(new Position(x-1,y-2));
    		}
    		if(((x+1) >= 0 && (y-2) >= 0 && (x+1) < 8 && (y-2) < 8) && ((plateau.getCase(x+1,y-2) == null) || plateau.getCase(x+1, y-2).getCouleur() == 'B')){
    			possible.add(new Position(x+1,y-2));
    		}
    		if(((x+2) >= 0 && (y-1) >= 0 && (x+2) < 8 && (y-1) < 8) && ((plateau.getCase(x+2,y-1) == null) || plateau.getCase(x+2,y-1).getCouleur() == 'B')){
    			possible.add(new Position(x+2,y-1));
    		}
    		if(((x+2) >= 0 && (y+1) >= 0 && (x+2) < 8 && (y+1) < 8) && ((plateau.getCase(x+2,y+1) == null) || plateau.getCase(x+2,y+1).getCouleur() == 'B')){
    			possible.add(new Position(x+2,y+1));
    		}
    		if(((x+1) >= 0 && (y+2) >= 0 && (x+1) < 8 && (y+2) < 8) && ((plateau.getCase(x+1,y+2) == null) || plateau.getCase(x+1, y+2).getCouleur() == 'B')){
    			possible.add(new Position(x+1,y+2));
    		}
    		if(((x-1) >= 0 && (y+2) >= 0 && (x-1) < 8 && (y+2) < 8) && ((plateau.getCase(x-1,y+2) == null) || plateau.getCase(x-1, y+2).getCouleur() == 'B')){
    			possible.add(new Position(x-1,y+2));
    		}
    		if(((x-2) >= 0 && (y+1) >= 0 && (x-2) < 8 && (y+1) < 8) && ((plateau.getCase(x-2,y+1) == null) || plateau.getCase(x-2,y+1).getCouleur() == 'B')){
    			possible.add(new Position(x-2,y+1));
    		}
    	}
        return possible;
    }
}
