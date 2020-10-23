package cl.alvarez.alvaro.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class DetalleFacturaEmbeddable implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Column(name="facturaid")
	private int facturaid;
	
	@Column(name="productoid")
	private int productoid;
	
	public DetalleFacturaEmbeddable () {
		
	}
	
	public DetalleFacturaEmbeddable (int facturaid, int productoid) {
		this.facturaid = facturaid;
		this.productoid = productoid;
	}

	public int getFacturaid() {
		return facturaid;
	}

	public void setFacturaid(int facturaid) {
		this.facturaid = facturaid;
	}

	public int getProductoid() {
		return productoid;
	}

	public void setProductoid(int productoid) {
		this.productoid = productoid;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	  @Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DetalleFacturaEmbeddable other = (DetalleFacturaEmbeddable) obj;
		if (facturaid != other.facturaid)
			return false;
		if (productoid != other.productoid)
			return false;
		return true;
	}
	 
	  @Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + facturaid;
		result = prime * result + productoid;
		return result;
	}

}
