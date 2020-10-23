package cl.alvarez.alvaro.entity;

import java.util.List;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Producto {
	
	@Id
	private int productoid;
	
	private String nombre;
	
	private int valor;
	
	@JsonIgnore
	@OneToMany(mappedBy = "producto", fetch = FetchType.EAGER)
	private List<DetalleFactura> facturas;
	
	@JsonIgnore
	@ManyToOne
	@MapsId("categoriaid")
	@JoinColumn(name = "categoriaid")
	private Categoria categoria;

	public Producto() {
		
	}	

	public Producto(int productoid, String nombre, int valor, List<DetalleFactura> facturas) {
		this.productoid = productoid;
		this.nombre = nombre;
		this.valor = valor;
		this.facturas = facturas;
	}

	public Producto(int productoid, String nombre, int valor, List<DetalleFactura> facturas, Categoria categoria) {
		this.productoid = productoid;
		this.nombre = nombre;
		this.valor = valor;
		this.facturas = facturas;
		this.categoria = categoria;
	}

	public int getProductoid() {
		return productoid;
	}

	public void setProductoid(int productoid) {
		this.productoid = productoid;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public List<DetalleFactura> getFacturas() {
		return facturas;
	}

	public void setFacturas(List<DetalleFactura> facturas) {
		this.facturas = facturas;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	
	public int subtotal(List<DetalleFactura> detalleFactu) {
		
		int subtotal = 0;
		
		for (DetalleFactura suma : detalleFactu) {
			int vari = suma.getProducto().getValor() * suma.getCantidad();
			subtotal = subtotal + vari;
		}
		
		return subtotal;
		
	}
	
	public int total(int subtotal) {
		 int total = (int) (subtotal *1.19);
		 
		 return total;
	}

	@Override
	public String toString() {
		return "Producto [productoid=" + productoid + ", nombre=" + nombre + ", valor=" + valor + ", facturas="
				+ facturas + "]";
	}	
	
	  @Override
	  public boolean equals(Object objeto) {
		 
		  if (this == objeto) 
			 
		return true;
	  
		  if (objeto == null || getClass() != objeto.getClass()) 
			  
		return false;
	  
	  Producto producto = (Producto) objeto;
	  
	  return Objects.equals(nombre, producto.nombre) && 
			  Objects.equals(valor, producto.valor); 
	  
	  }
	  
	  @Override
	  public int hashCode() { 
		  return Objects.hash(nombre, valor);
		  
	  }	

}
