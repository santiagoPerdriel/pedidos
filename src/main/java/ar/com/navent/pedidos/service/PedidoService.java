/**
 * 
 */
package ar.com.navent.pedidos.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.com.navent.pedidos.cache.BumexMemcached;
import ar.com.navent.pedidos.entity.Pedido;
import ar.com.navent.pedidos.repository.PedidoDAOImpl;

/**
 * @author santiago
 *
 */
@Service
public class PedidoService {

	private final BumexMemcached bumexMemcached = BumexMemcached.getBumexMemcached();

	@Autowired
	private PedidoDAOImpl repository;

	public void createOrUpdatePedido(Pedido pedido) {
		try {
			Pedido pedidoNew = repository.insertOrUpdate(pedido);
			// se modifica o se agrega al hashmap
			this.bumexMemcached.set(Long.toString(pedidoNew.getIdPedido()), pedidoNew);
		} catch (Exception e) {
			// lanzar excepción propia de la app, y lanzarla hacia el controller
			throw e;
		}
	}

	public void deletePedido(Long idPedido) {
		try {
			repository.delete(idPedido);
			this.bumexMemcached.delete(idPedido.toString());
		} catch (Exception e) {
			// lanzar excepción propia de la app, y lanzarla hacia el controller
			throw e;
		}

	}

	public Pedido getPedido(Long idPedido) {
		Pedido pedido = null;
		try {
			pedido = (Pedido) this.bumexMemcached.get(Long.toString(idPedido));
			if (pedido == null) {
				pedido = repository.select(idPedido);
				this.bumexMemcached.set(Long.toString(pedido.getIdPedido()), pedido);
			}
		} catch (Exception e) {
			// lanzar excepción propia de la app, y lanzarla hacia el controller

			throw e;
		}
		return pedido;
	}

}
