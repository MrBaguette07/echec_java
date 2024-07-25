
public class Main {
    public static void main(String[] args) throws Exception {
        Plateau plateau = new Plateau();
        String limite = new String(" |---|---|---|---|---|---|---|---|");
        String fin = new String("   A   B   C   D   E   F   G   H  ");
        System.out.println(limite);
        for (int i=7; i >= 0;i--){
            System.out.print(i+1);
            System.out.print("|");
            for (int j=7; j>=0;j--) {
                if (plateau.getCase(j, i) != null){
                    System.out.print(plateau.getCase(j, i).getNomCourt());
                } else {
                    System.out.print("   ");
                }
                System.out.print("|");
            }
            System.out.print(i+1);
            System.out.println("");
            System.out.println(limite);
        }
        System.out.println(fin);
    }

    public void jeu() {
        Plateau plateau = new Plateau();
        String limite = new String(" |---|---|---|---|---|---|---|---|");
        String fin = new String("   A   B   C   D   E   F   G   H  ");
        System.out.println(limite);
        for (int i=7; i >= 0;i--){
            System.out.print(i+1);
            System.out.print("|");
            for (int j=7; j>=0;j--) {
                if (plateau.getCase(j, i) != null){
                    System.out.print(plateau.getCase(j, i).getNomCourt());
                } else {
                    System.out.print("   ");
                }
                System.out.print("|");
            }
            System.out.print(i+1);
            System.out.println("");
            System.out.println(limite);
        }
        System.out.println(fin);
    }
}