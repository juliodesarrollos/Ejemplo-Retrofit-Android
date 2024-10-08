package com.juliovazquez.ejemploretrofit;

import com.google.gson.annotations.SerializedName;

public class RetrofitProducto {
    @SerializedName("nombreProducto")
    private String nombreProducto;
    @SerializedName("precioVenta")
    private Double precioVenta;
    @SerializedName("existencia")
    private Integer existencia;
    @SerializedName("nombreProveedor")
    private String nombreProveedor;
    @SerializedName("nombreCategoria")
    private String nombreCategoria;

    public RetrofitProducto(String nombreProducto, Double precioVenta, Integer existencia, String nombreProveedor, String nombreCategoria) {
        this.nombreProducto = nombreProducto;
        this.precioVenta = precioVenta;
        this.existencia = existencia;
        this.nombreProveedor = nombreProveedor;
        this.nombreCategoria = nombreCategoria;
    }

    public Integer getExistencia() {
        return existencia;
    }

    public void setExistencia(Integer existencia) {
        this.existencia = existencia;
    }

    public Double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(Double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getNombreProveedor() {
        return nombreProveedor;
    }

    public void setNombreProveedor(String nombreProveedor) {
        this.nombreProveedor = nombreProveedor;
    }

    public String getNombreCategoria() {
        return nombreCategoria;
    }

    public void setNombreCategoria(String nombreCategoria) {
        this.nombreCategoria = nombreCategoria;
    }
}
