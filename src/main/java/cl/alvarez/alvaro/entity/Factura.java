package cl.alvarez.alvaro.entity;

import java.util.List;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Factura {
	
	@Id
	private int facturaid;
	private String cliente;
	private String fecha;
	
	@JsonIgnore
	@OneToMany(mappedBy = "factura", fetch = FetchType.EAGER)
	private List<DetalleFactura> productos;

	public Factura() {
		
	}

	public Factura(int facturaid, String cliente, String fecha, List<DetalleFactura> productos) {
		this.facturaid = facturaid;
		this.cliente = cliente;
		this.fecha = fecha;
		this.productos = productos;
	}

	public int getFacturaid() {
		return facturaid;
	}

	public void setFacturaid(int facturaid) {
		this.facturaid = facturaid;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public List<DetalleFactura> getProductos() {
		return productos;
	}

	public void setProductos(List<DetalleFactura> productos) {
		this.productos = productos;
	}
	
	  @Override
	  public boolean equals(Object objeto) {
		 
		  if (this == objeto) 
			 
		return true;
	  
		  if (objeto == null || getClass() != objeto.getClass()) 
			  
		return false;
	  
	  Factura factura = (Factura) objeto;
	  
	  return Objects.equals(cliente, factura.cliente) && 
			  Objects.equals(fecha, factura.fecha) &&
	  			Objects.equals(productos, factura.productos);
	  
	  }
	  
	  @Override
	  public int hashCode() { 
		  return Objects.hash(cliente, fecha, productos);
		  
	  }	
	
	
}
