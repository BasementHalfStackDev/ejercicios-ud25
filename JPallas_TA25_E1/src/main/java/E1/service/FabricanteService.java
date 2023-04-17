/**
 * @author BasementHalfStackDev/Josep Maria Pallas Batalla
 */
package E1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import E1.dao.FabricanteDAO;
import E1.dto.Fabricante;

@Service // Assign service
public class FabricanteService implements FabricanteServiceInterface { // Implement interface

	// Load DAO
	@Autowired
	FabricanteDAO fabricanteDAO;
	
	// Implemented Interface Functions
	@Override
	public List<Fabricante> listFabricantes() {
		return fabricanteDAO.findAll();
	}

	@Override
	public Fabricante saveFabricante(Fabricante fabricante) {
		return fabricanteDAO.save(fabricante);
	}

	@Override
	public Fabricante FabricanteById(Long id) {
		return fabricanteDAO.findById(id).get();
	}

	@Override
	public Fabricante updateFabricante(Fabricante fabricante) {
		return fabricanteDAO.save(fabricante);
	}

	@Override
	public void deleteFabricante(Long id) {
		fabricanteDAO.deleteById(id);
	} 
}
