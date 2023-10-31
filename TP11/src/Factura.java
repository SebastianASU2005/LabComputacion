import java.util.ArrayList;
import java.util.Scanner;

public class Factura {
    private int num_factura;
    private String fecha_emision;
    private String cliente;
    private ArrayList<String> articulos=new ArrayList<>();
    private ArrayList<Integer> precio_unitario=new ArrayList<>();
    private ArrayList<Integer> cantidad=new ArrayList<>();
    private double subtotal;
    private double IVA;
    private double Total;
    Scanner leer=new Scanner(System.in);

    public Factura(int num_factura, String fecha_emision, String cliente, ArrayList<String> articulos, ArrayList<Integer> precio_unitario, ArrayList<Integer> cantidad, double subtotal, double IVA, double total) {
        this.num_factura = num_factura;
        this.fecha_emision = fecha_emision;
        this.cliente = cliente;
        this.articulos = articulos;
        this.precio_unitario = precio_unitario;
        this.cantidad = cantidad;
        this.subtotal = subtotal;
        this.IVA = IVA;
        Total = total;
    }

    public Factura() {
    }

    public int getNum_factura() {
        return num_factura;
    }

    public void setNum_factura(int num_factura) {
        this.num_factura = num_factura;
    }

    public String getFecha_emision() {
        return fecha_emision;
    }

    public void setFecha_emision(String fecha_emision) {
        this.fecha_emision = fecha_emision;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public ArrayList<String> getArticulos() {
        return articulos;
    }

    public void setArticulos(ArrayList<String> articulos) {
        this.articulos = articulos;
    }

    public ArrayList<Integer> getPrecio_unitario() {
        return precio_unitario;
    }

    public void setPrecio_unitario(ArrayList<Integer> precio_unitario) {
        this.precio_unitario = precio_unitario;
    }

    public ArrayList<Integer> getCantidad() {
        return cantidad;
    }

    public void setCantidad(ArrayList<Integer> cantidad) {
        this.cantidad = cantidad;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public double getIVA() {
        return IVA;
    }

    public void setIVA(double IVA) {
        this.IVA = IVA;
    }

    public double getTotal() {
        return Total;
    }

    public void setTotal(double total) {
        Total = total;
    }
    public void agregar_articulo(){
        System.out.println("Ingrese el artículo que desee llevar");
        System.out.println("1_Coca-Cola  $500");
        System.out.println("2_Leche  $800");
        System.out.println("3_Fernet  $2600");
        int decision= leer.nextInt();
        switch (decision){
            case 1:
                articulos.add("Coca-Cola");
                System.out.println("Cuantas desea llevar");
                cantidad.add(leer.nextInt());
                precio_unitario.add(500);
                break;
            case 2:
                articulos.add("Leche");
                System.out.println("Cuantas desea llevar");
                cantidad.add(leer.nextInt());
                precio_unitario.add(800);
                break;
            case 3:
                articulos.add("Fernet");
                System.out.println("Cuantas desea llevar");
                cantidad.add(leer.nextInt());
                precio_unitario.add(2600);
                break;
        }

    }
    public double SubTotal(){
        int aux=0;
        for (int i=0;i<articulos.size();i++){
            aux+=cantidad.get(i)*precio_unitario.get(i);
        }
        return aux;
    }
    public double iva(){
        IVA=SubTotal()*0.21;
        return IVA;
    }
    public void mas_iva(){
        Total=SubTotal()+iva();
        System.out.println("El precio del IVA es "+iva());
        System.out.println("El precio sin iva es: "+SubTotal()+" El precio con iva es: "+Total);
    }
}
