package fs;
public abstract class Composante {
    protected  String name;
    protected  int level=0;

    public abstract void afficher();

    public Composante(String name) {
        this.name = name;
    }

    public String getTab(){
        String tab="";
        for(int i=0;i<level;i++){
            tab=tab+"\t";
        }
        return tab;
    }
}
