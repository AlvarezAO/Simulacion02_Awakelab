package cl.alvarez.alvaro.service;

import java.util.List;

import cl.alvarez.alvaro.entity.Factura;

public interface FacturaService {
	
	List<Factura> getListFactura();
	Factura getFacturaById(int facturaid);

}
