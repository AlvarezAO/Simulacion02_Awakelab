package cl.alvarez.alvaro.entity;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class DetalleFactura {
	
	@JsonIgnore
	@EmbeddedId
	private DetalleFacturaEmbeddable detalleFacturaId;
	
	
	@ManyToOne
	@MapsId("facturaid")
	@JoinColumn(name = "facturaid")
	private Factura factura;
	
	
	@ManyToOne
	@MapsId("productoid")
	@JoinColumn(name = "productoid")
	private Producto producto;
	
	@Column(name="cantidad")
	private int cantidad;

	public DetalleFactura() {
		
	}	
	
	 public DetalleFactura(DetalleFacturaEmbeddable detalleFacturaId, Factura factura, Producto producto, int cantidad) {
		this.detalleFacturaId = detalleFacturaId;
		this.factura = factura;
		this.producto = producto;
		this.cantidad = cantidad;
	}

	 


	public DetalleFacturaEmbeddable getDetalleFacturaId() {
		return detalleFacturaId;
	}

	public void setDetalleFacturaId(DetalleFacturaEmbeddable detalleFacturaId) {
		this.detalleFacturaId = detalleFacturaId;
	}

	public Factura getFactura() {
		return factura;
	}

	public void setFactura(Factura factura) {
		this.factura = factura;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
	
	
	@Override
	public boolean equals(Object objeto) { 
			if (this == objeto)
			
		return true;

	if (objeto == null || getClass() != objeto.getClass())
		return false;

	DetalleFactura that = (DetalleFactura) objeto;

	return Objects.equals(factura, that.factura) && 
			Objects.equals(producto, that.producto); 
	
	}

	@Override
	public int hashCode() { 
		return Objects.hash(factura, producto);
		
	}


}
