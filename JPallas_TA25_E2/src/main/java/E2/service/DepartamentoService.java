/**
 * @author BasementHalfStackDev/Josep Maria Pallas Batalla
 */
package E2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import E2.dao.DepartamentoDAO;
import E2.dto.Departamento;

@Service // Assign service
public class DepartamentoService implements DepartamentoServiceInterface {

	// Import DAO
	@Autowired
	DepartamentoDAO departamentoDAO;

	// Implemented Interface Functions
	@Override
	public List<Departamento> listDepartamentos() {
		return departamentoDAO.findAll();
	}

	@Override
	public Departamento saveDepartamento(Departamento departamento) {
		return departamentoDAO.save(departamento);
	}

	@Override
	public Departamento departamentoById(Long id) {
		return departamentoDAO.findById(id).get();
	}

	@Override
	public Departamento updateDepartamento(Departamento departamento) {
		return departamentoDAO.save(departamento);
	}

	@Override
	public void deleteDepartamento(Long id) {
		departamentoDAO.deleteById(id);
	}

}
