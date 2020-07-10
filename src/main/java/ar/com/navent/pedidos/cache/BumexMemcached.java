/**
 * 
 */
package ar.com.navent.pedidos.cache;

/**
 * @author santiago
 *
 */
public class BumexMemcached {

	private static BumexMemcached bumexMemcached = null;

	private BumexMemcached() {

	};

	public static BumexMemcached getBumexMemcached() {
		if (bumexMemcached == null) {
			bumexMemcached = new BumexMemcached();
		}
		return bumexMemcached;
	}

	public void set(String key, Object value) {
	}

	public Object get(String key) {
		return null;
	}

	public void delete(String key) {
	}

}
