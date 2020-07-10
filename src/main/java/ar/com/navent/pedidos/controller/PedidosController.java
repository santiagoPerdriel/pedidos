/**
 * 
 */
package ar.com.navent.pedidos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ar.com.navent.pedidos.entity.Pedido;
import ar.com.navent.pedidos.service.PedidoService;

/**
 * @author santiago
 *
 */
@RestController
@RequestMapping("/pedido")
public class PedidosController {
	
	@Autowired
	private  PedidoService service;
	


	@PostMapping
	public void savePedido(@RequestBody Pedido pedido) {
		  service.createOrUpdatePedido(pedido);
	}

	@PutMapping
	public void updatePedido(@RequestBody Pedido pedido) {
		 service.createOrUpdatePedido(pedido);
	}


	@GetMapping("/{id}")
	public Pedido getPedido(@PathVariable Long id) throws Exception {
		return service.getPedido(id);

	}
	@DeleteMapping("/{id}")
	public void deletePedido(@PathVariable Long id) throws Exception {
		service.deletePedido(id);

	}

}
