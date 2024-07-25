public class Position {
    private int x;
    private int y;
    Position() { // Constructeur intialisation à 0
        this.x = 0;
        this.y = 0;
    }
    Position(int x, int y) { // Constructeur prenant x et y en paramètre
        this.x = x;
        this.y = y;
    }
    Position(Position p) { // Constructeur par copie
        x = p.x;
        y = p.y;
    }
    Position(String c) { // Constructeur prenant x et y en paramètre
        this.x = Character.toUpperCase(c.charAt(0));
        this.y = c.charAt(1);
    }
    public int getX(){ // Getter X
        return this.x;
    }
    public int getY(){ // Getter Y
        return this.y;
    }
    public void setX(int x){ // Setter X
        this.x = x;
    }
    public void setY(int y){ // Setter y
        this.y = y;
    }
    public boolean equals(Object obj) { // Equals prenant un objet en paramètre
        if (obj == null) return false;
        
        if (!(obj  instanceof Position)){
           return false;
        }
        
        if (((Position)obj ).x != x) return false;
        if (((Position)obj ).y != y) return false;
        
        return true;
    }
    private String getCharToNumber(int i) {
        return i >= 0 && i < 26 ? String.valueOf((char)(i + 97)) : null;
    }
    @Override
    public String toString(){
        return getCharToNumber(x).toUpperCase()+(y+1);
    }
}
