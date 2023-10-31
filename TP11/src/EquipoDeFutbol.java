import java.util.ArrayList;
import java.util.Scanner;

public class EquipoDeFutbol {
    private ArrayList<String>Jugadores=new ArrayList<>();
    Scanner leer=new Scanner(System.in);
    private int num=0;

    public EquipoDeFutbol(ArrayList<String> jugadores) {
        Jugadores = jugadores;
    }
    public EquipoDeFutbol() {
    }

    public ArrayList<String> getJugadores() {
        return Jugadores;
    }

    public void setJugadores(ArrayList<String> jugadores) {
        Jugadores = jugadores;
    }
    public void Ingresar(){
        System.out.println("Ingrese el nombre del jugador");
        Jugadores.add(leer.next());
    }
    public void Eliminar(){
        System.out.println("Que jugador desea eliminar (Ingrese la posición)");
        num= leer.nextInt();
        Jugadores.remove(num);
    }
    public void Mostrar(){
        for(String i:Jugadores){
            System.out.println(i);
        }
    }
}
