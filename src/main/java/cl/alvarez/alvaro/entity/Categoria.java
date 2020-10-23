package cl.alvarez.alvaro.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Categoria {
	
	@Id
	private int categoriaid;
	private String nombre;
	
	@OneToMany(mappedBy = "categoria", fetch = FetchType.EAGER)
	private List<Producto> listaDeProductos;

	public Categoria() {
		
	}

	public Categoria(int categoriaid, String nombre, List<Producto> listaDeProductos) {
		this.categoriaid = categoriaid;
		this.nombre = nombre;
		this.listaDeProductos = listaDeProductos;
	}

	public int getCategoriaid() {
		return categoriaid;
	}

	public void setCategoriaid(int categoriaid) {
		this.categoriaid = categoriaid;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Producto> getListaDeProductos() {
		return listaDeProductos;
	}

	public void setListaDeProductos(List<Producto> listaDeProductos) {
		this.listaDeProductos = listaDeProductos;
	}

	@Override
	public String toString() {
		return "Categoria [categoriaid=" + categoriaid + ", nombre=" + nombre + ", listaDeProductos=" + listaDeProductos
				+ "]";
	}
	
}
