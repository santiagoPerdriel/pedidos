/**
 * 
 */
package ar.com.navent.pedidos.repository;

import org.springframework.stereotype.Component;

import ar.com.navent.pedidos.entity.Pedido;

/**
 * @author santiago
 *
 */
@Component
public class PedidoDAOImpl implements PedidoDAO {
	
	/**
	 * Si el pedido viene con id nulo lo va a crear.
	 *  
	 *  si no lo va modifica
	 * 
	 * @param pedido
	 * @return
	 */
	public Pedido insertOrUpdate(Pedido pedido) {
		return null;
		
	};
	
	/**
	 * 
	 * @param id
	 */
	public void delete (Long id) {};

	/**
	 * 
	 * @param idPedido
	 * @return
	 */
	public Pedido select(Long idPedido) {
		return null;
	};
}
