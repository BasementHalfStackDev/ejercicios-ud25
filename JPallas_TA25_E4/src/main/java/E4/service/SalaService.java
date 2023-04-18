/**
 * @author BasementHalfStackDev/Josep Maria Pallas Batalla
 */
package E4.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import E4.dao.SalaDAO;
import E4.dto.Sala;

@Service // Assign service
public class SalaService {

	// Load DAO
	@Autowired
	SalaDAO salaDAO;

	// CRUD functions
	public List<Sala> listSalas() {
		return salaDAO.findAll();
	}

	public Sala saveSala(Sala sala) {
		return salaDAO.save(sala);
	}

	public Sala salaById(Long id) {
		return salaDAO.findById(id).get();
	}

	public Sala updateSala(Sala sala) {
		return salaDAO.save(sala);
	}

	public void deleteSala(Long id) {
		salaDAO.deleteById(id);
	}

}
