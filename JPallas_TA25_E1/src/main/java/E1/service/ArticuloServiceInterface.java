/**
 * @author BasementHalfStackDev/Josep Maria Pallas Batalla
 */
package E1.service;

import java.util.List;

import E1.dto.Articulo;

public interface ArticuloServiceInterface {

	// CRUD Functions
	public List<Articulo> listArticulo();

	public Articulo saveArticulo(Articulo articulo);

	public Articulo ArticuloById(Long id);

	public Articulo updateArticulo(Articulo articulo);

	public void deleteArticulo(Long id);

}
