/**
 * @author BasementHalfStackDev/Josep Maria PAllas Batalla
 */

package E1.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "fabricantes")
public class Fabricante {

	// Attributes
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nombre;
	@OneToMany
	@JoinColumn(name = "id")
	private List<Articulo> articulo;

	// Constructor
	public Fabricante() {
	}

	public Fabricante(Long id, String nombre) {
		this.id = id;
		this.nombre = nombre;
	}

	// Getters
	public Long getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}

	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Articulo")
	public List<Articulo> getArticulo() {
		return articulo;
	}

	// Setters
	public void setId(Long id) {
		this.id = id;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setArticulo(List<Articulo> articulo) {
		this.articulo = articulo;
	}

}
