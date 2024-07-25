import java.util.ArrayList;

public class Plateau {
    private ArrayList<Piece> tableau = new ArrayList<Piece>();
    public Plateau(){
        this.tableau.add(new Tour('B', new Position(0, 0)));
        this.tableau.add(new Cavalier('B', new Position(1, 0)));
        this.tableau.add(new Fou('B', new Position(2, 0)));
        this.tableau.add(new Dame('B', new Position(3, 0)));
        this.tableau.add(new Roi('B', new Position(4, 0)));
        this.tableau.add(new Fou('B', new Position(5, 0)));
        this.tableau.add(new Cavalier('B', new Position(6, 0)));
        this.tableau.add(new Tour('B', new Position(7, 0)));
        for (int i=0; i<8;i++) {
            this.tableau.add(new PionBlanc(new Position(i, 1)));
            this.tableau.add(new PionNoir(new Position(i, 6)));
        }
        this.tableau.add(new Tour('N', new Position(0, 7)));
        this.tableau.add(new Cavalier('N', new Position(1, 7)));
        this.tableau.add(new Fou('N', new Position(2, 7)));
        this.tableau.add(new Dame('N', new Position(3, 7)));
        this.tableau.add(new Roi('N', new Position(4, 7)));
        this.tableau.add(new Fou('N', new Position(5, 7)));
        this.tableau.add(new Cavalier('N', new Position(6, 7)));
        this.tableau.add(new Tour('N', new Position(7, 7)));
    }
    public void removeCase(Piece obj) {
        this.tableau.remove(obj);
    }
    public void addCase(Piece obj) {
        this.tableau.add(obj);
    }
    public void deplacer(Position un, Position deux) {
        this.getCase(un);
    }
    public Piece getCase(Position position){
        int index = 0;
        for (Piece valeur: tableau) {
            if ((valeur.getPosition().getX() == position.getX()) && (valeur.getPosition().getY() == position.getY())) {
                //System.out.println(valeur.getClass().getName());
                return tableau.get(index);
            }
            index+=1;
        }
        return null;
    }
    public Piece getCase(int x, int y){
        return this.getCase(new Position(x,y));

    }
    public Piece getCase(String position){
        return this.getCase(new Position(position.charAt(0),position.charAt(1)));
    }
}