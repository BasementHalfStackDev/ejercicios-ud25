/**
 * @author BasementHalfStackDev/Josep Maria Pallas Batalla
 */
package E1.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import E1.dto.Fabricante;

public interface FabricanteDAO extends JpaRepository<Fabricante, Long> {

}
