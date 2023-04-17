/**
 * @author BasementHalfStackDev/Josep Maria Pallas Batalla
 */
package E1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import E1.dao.ArticuloDAO;
import E1.dto.Articulo;

@Service // Assign service
public class ArticuloService implements ArticuloServiceInterface { // Implement interface
	
	// Load DAO
	@Autowired
	ArticuloDAO articuloDAO;

	// Implemented interface Functions
	@Override
	public List<Articulo> listArticulo() {
		return articuloDAO.findAll();
	}

	@Override
	public Articulo saveArticulo(Articulo articulo) {
		return articuloDAO.save(articulo);
	}

	@Override
	public Articulo ArticuloById(Long id) {
		return articuloDAO.findById(id).get();
	}

	@Override
	public Articulo updateArticulo(Articulo articulo) {
		return articuloDAO.save(articulo);
	}

	@Override
	public void deleteArticulo(Long id) {
		articuloDAO.deleteById(id);
	}
}
