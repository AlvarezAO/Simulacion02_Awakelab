package cl.alvarez.alvaro.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.alvarez.alvaro.entity.Factura;
import cl.alvarez.alvaro.entity.FacturaRepository;


@Service
public class FacturaServiceImple implements FacturaService {
	
	@Autowired
	FacturaRepository fs;

	@Override
	public List<Factura> getListFactura() {
		return (List<Factura>) fs.findAll() ;
	}

	@Override
	public Factura getFacturaById(int facturaid) {
		return fs.findOne(facturaid);
	}

}
