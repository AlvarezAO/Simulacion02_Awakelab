package cl.alvarez.alvaro.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import cl.alvarez.alvaro.entity.Categoria;
import cl.alvarez.alvaro.entity.DetalleFactura;
import cl.alvarez.alvaro.entity.Factura;
import cl.alvarez.alvaro.entity.Producto;
import cl.alvarez.alvaro.service.CategoriaService;
import cl.alvarez.alvaro.service.DetalleFacturaService;
import cl.alvarez.alvaro.service.FacturaService;
import cl.alvarez.alvaro.service.ProductoService;

@RestController
public class JsonController {
	
	@Autowired
	FacturaService fs;
	@Autowired
	DetalleFacturaService dfs;
	@Autowired
	ProductoService ps;
	@Autowired
	CategoriaService cs;
	
	@GetMapping(value = "/JsonFacturas", headers = "Accept=application/json")
	public List<Factura> getJsonFacturas(){
		List<Factura> factu = fs.getListFactura();
		
		return factu;
	}
	
	@GetMapping(value = "/detallefactura", headers = "Accept=application/json")
	public List<DetalleFactura> getDetalles(){
		List<DetalleFactura> detFactura = dfs.getDetalles();
		return detFactura;
	}
	

	@GetMapping(value = "/productos", headers = "Accept=application/json")
	public List<Producto> getListaProductos(){
		List<Producto> productos = ps.getProductos();
		return productos;		
	}
	
	@GetMapping(value = "/categoria/{categoriaid}", headers = "Accept=application/json")
	public Categoria getCategoriaById(@PathVariable("categoriaid") int categoriaid){
		Categoria categoria = cs.getCategoriaById(categoriaid);
		return categoria;
		
	}
	

}
