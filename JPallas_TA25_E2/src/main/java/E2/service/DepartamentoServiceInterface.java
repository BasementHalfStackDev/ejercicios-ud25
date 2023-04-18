/**
 * @author BasementHalfStackDev/Josep Maria Pallas Batalla
 */
package E2.service;

import java.util.List;

import E2.dto.Departamento;

public interface DepartamentoServiceInterface {

	// CRUD Functions
	public List<Departamento> listDepartamentos();

	public Departamento saveDepartamento(Departamento departamento);

	public Departamento departamentoById(Long id);

	public Departamento updateDepartamento(Departamento departamento);

	public void deleteDepartamento(Long id);

}
