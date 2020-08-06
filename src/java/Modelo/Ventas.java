package Modelo;


public class Ventas {
    private int idventa;
    private int idproductto;
    private int descuento;
    private String reportes;
    private String estado;

    public Ventas() {
    }

    public Ventas(int idventa, int idproductto, int descuento, String reportes, String estado) {
        this.idventa = idventa;
        this.idproductto = idproductto;
        this.descuento = descuento;
        this.reportes = reportes;
        this.estado = estado;
    }

    public int getIdventa() {
        return idventa;
    }

    public void setIdventa(int idventa) {
        this.idventa = idventa;
    }

    public int getIdproductto() {
        return idproductto;
    }

    public void setIdproductto(int idproductto) {
        this.idproductto = idproductto;
    }

    public int getDescuento() {
        return descuento;
    }

    public void setDescuento(int descuento) {
        this.descuento = descuento;
    }

    public String getReportes() {
        return reportes;
    }

    public void setReportes(String reportes) {
        this.reportes = reportes;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
    
}
