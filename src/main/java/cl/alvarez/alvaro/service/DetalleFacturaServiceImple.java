package cl.alvarez.alvaro.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.alvarez.alvaro.entity.DetalleFactura;
import cl.alvarez.alvaro.entity.DetalleFacturaRepository;

@Service
public class DetalleFacturaServiceImple implements DetalleFacturaService {
	
	@Autowired
	DetalleFacturaRepository dfr;

	@Override
	public List<DetalleFactura> getDetalles() {
		return (List<DetalleFactura>) dfr.findAll();
	}

	@Override
	public DetalleFactura getDetalleById(int detalleid) {
		return dfr.findOne(detalleid);
	}

}
