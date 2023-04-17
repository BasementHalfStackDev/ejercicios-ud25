/**
 * @author BasementHalfStackDev/Josep Maria Pallas Batalla
 */
package E1.service;

import java.util.List;

import E1.dto.Fabricante;

public interface FabricanteServiceInterface {
	
	// CRUD Functions
	public List<Fabricante> listFabricantes();
	
	public Fabricante saveFabricante(Fabricante fabricante);
	
	public Fabricante FabricanteById(Long id);
	
	public Fabricante updateFabricante(Fabricante fabricante);
	
	public void deleteFabricante(Long id);

}
