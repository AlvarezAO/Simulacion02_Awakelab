package cl.alvarez.alvaro.service;

import java.util.List;

import cl.alvarez.alvaro.entity.Categoria;

public interface CategoriaService {
	
	List<Categoria> getListCategoria();
	Categoria getCategoriaById(int categoriaid);

}
