package cl.alvarez.alvaro.service;

import java.util.List;

import cl.alvarez.alvaro.entity.Producto;

public interface ProductoService {

	List<Producto> getProductos();
	Producto getProductoById(int productoid);
}
