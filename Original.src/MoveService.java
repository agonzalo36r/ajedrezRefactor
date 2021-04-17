import java.util.ArrayList;
import java.util.List;

public class MoveService{

    public List<MoveDTO> lista = new ArrayList<MoveDTO>();

    public void agregarMovimiento(MoveDTO move){
        lista.add(move);
    }
    public List<MoveDTO> obtenerMovimientos(){
        return lista;
    }
    
}