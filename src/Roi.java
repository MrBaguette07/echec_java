import java.util.ArrayList;
public class Roi extends Piece {
    private boolean premierCoup;

    public Roi(){
        super('B', new Position(0,1));
        this.premierCoup = true;
	}
    public Roi(char couleur, Position position){
        super(couleur, position);
    }
    public String getType(){
        return "roi";
    }
    public ArrayList<Position> getDeplacementPossible(Plateau plateau) {
        int x = this.getPosition().getX();
        int y = this.getPosition().getY();
        ArrayList<Position> possible = new ArrayList<Position>();
        if(((x) >= 0 && (y+1) >= 0 && (x) < 8 && (y+1) < 8) && (plateau.getCase(x,y+1) == null || plateau.getCase(x,y+1).getCouleur() != this.getCouleur())){
            possible.add(new Position(x,y+1));
        }
        if(((x) >= 0 && (y-1) >= 0 && (x) < 8 && (y-1) < 8) && (plateau.getCase(x,y-1) == null || plateau.getCase(x,y-1).getCouleur() != this.getCouleur())){
            possible.add(new Position(x,y-1));
        }
        if(((x+1) >= 0 && (y) >= 0 && (x+1) < 8 && (y) < 8) && (plateau.getCase(x+1,y) == null || plateau.getCase(x+1,y).getCouleur() != this.getCouleur())){
            possible.add(new Position(x+1,y));
        }
        if(((x-1) >= 0 && (y) >= 0 && (x-1) < 8 && (y) < 8) && (plateau.getCase(x-1,y) == null || plateau.getCase(x-1,y).getCouleur() != this.getCouleur())){
            possible.add(new Position(x-1,y));
        }
        if(((x+1) >= 0 && (y+1) >= 0 && (x+1) < 8 && (y+1) < 8) && (plateau.getCase(x+1,y+1) == null || plateau.getCase(x+1,y+1).getCouleur() != this.getCouleur())){
            possible.add(new Position(x+1,y+1));
        }
        if(((x-1) >= 0 && (y+1) >= 0 && (x-1) < 8 && (y+1) < 8) && (plateau.getCase(x-1,y+1) == null || plateau.getCase(x-1,y+1).getCouleur() != this.getCouleur())){
            possible.add(new Position(x-1,y+1));
        }
        if(((x+1) >= 0 && (y-1) >= 0 && (x+1) < 8 && (y-1) < 8) && (plateau.getCase(x+1,y-1) == null || plateau.getCase(x+1,y-1).getCouleur() != this.getCouleur())){
            possible.add(new Position(x+1,y-1));
        }
        if(((x-1) >= 0 && (y-1) >= 0 && (x-1) < 8 && (y-1) < 8) && (plateau.getCase(x-1,y-1) == null || plateau.getCase(x-1,y-1).getCouleur() != this.getCouleur())){
            possible.add(new Position(x-1,y-1));
        }
        if(premierCoup && plateau.getCase(x+1, y) == null && plateau.getCase(x+2, y) == null && plateau.getCase(x+3, y) != null && plateau.getCase(x+3, y).getClass().equals(Tour.class)){
            Tour t = (Tour)plateau.getCase(x+3, y);
            if(t.getPremierCoup()){
                possible.add(new Position(x+2,y));
            }
        }
        if(premierCoup && plateau.getCase(x-1, y) == null && plateau.getCase(x-2,y) == null && plateau.getCase(x-3,y) == null && plateau.getCase(x-4, y) != null && plateau.getCase(x-4, y).getClass().equals(Tour.class)){
            Tour t = (Tour)plateau.getCase(x-4, y);
            if(t.getPremierCoup()){
                possible.add(new Position(x-2,y));
            }
        }
        return possible;
    }

    public boolean getPremierCoup(){
        return premierCoup;
    }

    public void setPremierCoup(boolean b){
        this.premierCoup = b;
    }

}
