/**
 * @author BasementHalfStackDev/Josep Maria Pallas Batalla
 */
package E2.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import E2.dto.Departamento;

public interface DepartamentoDAO extends JpaRepository<Departamento, Long> {

}
