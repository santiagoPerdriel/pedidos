/**
 * 
 */
package ar.com.navent.pedidos.entity;

import java.math.BigDecimal;

/**
 * @author santiago
 *
 */
public class Pedido {
	

    private Long idPedido;
	private String nombre;
	private BigDecimal monto;
	private BigDecimal descuento;

	public Pedido() {}
	
    public Pedido(String nombre, BigDecimal monto, BigDecimal descuento) {

        this.nombre = nombre;
        this.monto = monto;
        this.descuento = descuento;
    }
    
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public BigDecimal getMonto() {
		return monto;
	}

	public void setMonto(BigDecimal monto) {
		this.monto = monto;
	}

	public BigDecimal getDescuento() {
		return descuento;
	}

	public void setDescuento(BigDecimal descuento) {
		this.descuento = descuento;
	}

	/**
	 * @return the idPedido
	 */
	public Long getIdPedido() {
		return idPedido;
	}

	/**
	 * @param idPedido the idPedido to set
	 */
	public void setIdPedido(Long idPedido) {
		this.idPedido = idPedido;
	}


}
