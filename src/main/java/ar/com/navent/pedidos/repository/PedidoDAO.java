/**
 * 
 */
package ar.com.navent.pedidos.repository;

import ar.com.navent.pedidos.entity.Pedido;

/**
 * @author santiago
 *
 */
public interface PedidoDAO {
	
	/**
	 * Si el pedido viene con id nulo lo va a crear.
	 *  
	 *  si no lo va modifica
	 * 
	 * @param pedido
	 * @return
	 */
	public Pedido insertOrUpdate(Pedido pedido);
	
	/**
	 * 
	 * @param id
	 */
	public void delete (Long id);

	/**
	 * 
	 * @param idPedido
	 * @return
	 */
	public Pedido select(Long idPedido);
}
