/**
 * @author BasementHalfStackDev/Josep Maria Pallas Batalla
 */
package E2.service;

import java.util.List;

import E2.dto.Empleado;

public interface EmpleadoServiceInterface {

	// CRUD Functions
	public List<Empleado> listEmpleado();

	public Empleado saveEmpleado(Empleado empleado);

	public Empleado empleadoById(String dni);

	public Empleado updateEmpleado(Empleado empleado);

	public void deleteEmpleado(String dni);

}
