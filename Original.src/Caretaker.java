import java.util.ArrayList;

public class Caretaker{
    private ArrayList<Memento> estados = new ArrayList<Memento>();

    public void addMemento(Memento m){
        estados.add(m);
    }

    public Memento getMemento(int index){
        return estados.get(index);
    }

    public Memento getLastMemento(){
        if(!estados.isEmpty()){
            Memento estado = estados.get(0);
            estados.remove(0);
            return estado;
        }else{
            return null;
        }
        
    }

}