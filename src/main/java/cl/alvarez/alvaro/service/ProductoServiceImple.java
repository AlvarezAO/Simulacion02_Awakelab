package cl.alvarez.alvaro.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.alvarez.alvaro.entity.Producto;
import cl.alvarez.alvaro.entity.ProductoRepository;

@Service
public class ProductoServiceImple implements ProductoService {

	@Autowired
	ProductoRepository pr;
	
	@Override
	public List<Producto> getProductos() {
		return (List<Producto>) pr.findAll();
	}

	@Override
	public Producto getProductoById(int productoid) {
		return pr.findOne(productoid);
	}

}
