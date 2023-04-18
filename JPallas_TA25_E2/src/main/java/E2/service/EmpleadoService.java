/**
 * @author BasementHalfStackDev/Josep Maria Pallas Batalla
 */
package E2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import E2.dao.EmpleadoDAO;
import E2.dto.Empleado;

@Service // Assign service
public class EmpleadoService implements EmpleadoServiceInterface {

	// Import DAO
	@Autowired
	EmpleadoDAO empleadoDAO;

	// Implemented Interface Functions
	@Override
	public List<Empleado> listEmpleado() {
		return empleadoDAO.findAll();
	}

	@Override
	public Empleado saveEmpleado(Empleado empleado) {
		return empleadoDAO.save(empleado);
	}

	@Override
	public Empleado empleadoById(String dni) {
		return empleadoDAO.findById(dni).get();
	}

	@Override
	public Empleado updateEmpleado(Empleado empleado) {
		return empleadoDAO.save(empleado);
	}

	@Override
	public void deleteEmpleado(String dni) {
		empleadoDAO.deleteById(dni);
	}

}
