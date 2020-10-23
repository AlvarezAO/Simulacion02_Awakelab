package cl.alvarez.alvaro.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.alvarez.alvaro.entity.Categoria;
import cl.alvarez.alvaro.entity.CategoriaRepository;

@Service
public class CategoriaServiceImple implements CategoriaService {

	@Autowired
	CategoriaRepository cr;
	
	@Override
	public List<Categoria> getListCategoria() {
		return (List<Categoria>) cr.findAll() ;
	}

	@Override
	public Categoria getCategoriaById(int categoriaid) {		
		return cr.findOne(categoriaid);
	}

}
