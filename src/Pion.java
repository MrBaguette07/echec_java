import java.util.ArrayList;
public abstract class Pion extends Piece {
    public Pion(){
        super('B', new Position(0,1));
	}
    public Pion(char couleur, Position position){
        super(couleur, position);
    }
    public String getType(){
        return "pion";
    }
    public abstract ArrayList<Position> getDeplacementPossible(Plateau p);

}
