package cl.alvarez.alvaro.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import cl.alvarez.alvaro.entity.DetalleFactura;
import cl.alvarez.alvaro.entity.Factura;
import cl.alvarez.alvaro.entity.Producto;
import cl.alvarez.alvaro.service.DetalleFacturaService;
import cl.alvarez.alvaro.service.FacturaService;

@Controller
public class MainController {
	
	@Autowired
	FacturaService fs;
	
	@Autowired
	DetalleFacturaService dfs;
	
	@RequestMapping({"/", "index"})
	public String mainMethod(Model m) {
		
		List<DetalleFactura> ls = dfs.getDetalles();
		System.out.println(ls);
		m.addAttribute("lista", ls);
		return "index";
	}
	
	@RequestMapping("buscaid")
	public String detalleFactura(@RequestParam("facturaid") int facturaid, Model m) {
		Factura factura = fs.getFacturaById(facturaid);
		List<DetalleFactura> detFacturas = factura.getProductos();	
		
		Producto producto = new Producto();
		
		int subtotal = producto.subtotal(detFacturas);
		int total = producto.total(subtotal);
		
		System.out.println(subtotal);
		
		m.addAttribute("factu", factura);
		m.addAttribute("total", total);
		m.addAttribute("detalleFactura", detFacturas);
		m.addAttribute("subtotal", subtotal);
		
		return "detalle";
	}

}
