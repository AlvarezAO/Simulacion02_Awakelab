package cl.alvarez.alvaro.service;

import java.util.List;

import cl.alvarez.alvaro.entity.DetalleFactura;

public interface DetalleFacturaService {
	
	List<DetalleFactura> getDetalles();
	DetalleFactura getDetalleById(int detalleid);

}
