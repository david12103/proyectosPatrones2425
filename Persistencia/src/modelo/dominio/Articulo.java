package modelo.dominio;

import java.io.Serializable;
import java.util.Objects;

import modelo.repositorios.KeyAccesible;
import modelo.repositorios.Keyable;

public class Articulo implements KeyAccesible<Long>,Serializable {
	private Long id;
	private String descripcion;
	private float precio;
	public Articulo(Long id, String descripcion, float precio) {
		super();
		this.id = id;
		this.descripcion = descripcion;
		this.precio = precio;
	}
	public Long getId() {
		return id;
	}
	private void setId(Long id) {
		this.id = id;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	
	@Override
	public boolean equalKey(Long keyable) {
		return this.id.equals(keyable);
	}
	@Override
	public Long getKey() {
		return this.getId();
	}
	@Override
	public int hashCode() {
		return Objects.hash(descripcion, id, precio);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Articulo other = (Articulo) obj;
		return Objects.equals(descripcion, other.descripcion) && Objects.equals(id, other.id)
				&& Float.floatToIntBits(precio) == Float.floatToIntBits(other.precio);
	}
	

	
	
}
