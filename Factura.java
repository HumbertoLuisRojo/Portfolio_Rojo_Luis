/* Este codigo ha sido generado por el modulo psexport 20180802-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo debería llamarse "FACTURA.java."

import java.io.*;

public class factura {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		int articulo[];
		int cantidad[];
		int cantidad_venta;
		int cf;
		String cliente;
		int codigo;
		String continua;
		String descripcion[];
		String direccion;
		boolean encuentra;
		int fila;
		int i;
		int j;
		String nombre;
		int nro_art;
		double pre_unit[];
		double subtotal;
		double total;
		// Array para guardar los datos de la factura;
		articulo = new int[3];
		cantidad = new int[3];
		pre_unit = new double[3];
		descripcion = new String[3];
		System.out.println(" ");
		System.out.println("Ingresa articulos?");
		System.out.println("=================");
		continua = "s";
		nro_art = 1;
		total = 0;
		do {
			System.out.print("Artículo Número "+nro_art+":");
			articulo[nro_art-1] = Integer.parseInt(bufEntrada.readLine());
			System.out.print("cantidad: ");
			cantidad[nro_art-1] = Integer.parseInt(bufEntrada.readLine());
			System.out.print("descripcion: ");
			descripcion[nro_art-1] = bufEntrada.readLine();
			System.out.print("Precio unitario: ");
			pre_unit[nro_art-1] = Double.parseDouble(bufEntrada.readLine());
			nro_art = nro_art+1;
			System.out.println("Ingresa otro artículo? (s/n)");
			continua = bufEntrada.readLine();
			System.out.println(" ");
		} while (!continua.equals("n"));
		nro_art = nro_art-1;
		System.out.println(" ");
		System.out.println("Ingrese datos del cliente");
		System.out.println("=========================");
		System.out.print("Nombre: ");
		nombre = bufEntrada.readLine();
		System.out.print("Dirección: ");
		direccion = bufEntrada.readLine();
		System.out.println(" ");
		// Escribir "Ingresa articulos?";
		// Escribir "=================";
		// continua <- "s";
		// nro_art <- 1;
		// total <- 0;
		// Repetir
		// Escribir Sin Saltar "Artículo Número ", nro_art, ":";
		// Leer articulo[nro_art];
		// Escribir Sin Saltar "cantidad: ";
		// Leer cantidad[nro_art];
		// Escribir Sin Saltar "descripcion: ";
		// Leer descripcion[nro_art];
		// Escribir Sin Saltar "Precio unitario: ";
		// Leer pre_unit[nro_art];
		// nro_art <- nro_art + 1;
		// Escribir "Ingresa otro artículo? (s/n)";
		// Leer continua;
		// Escribir " ";
		// Hasta Que continua = "n"
		// nro_art <- nro_art - 1;
		System.out.println(" ");
		continua = "s";
		cf = 1;
		cliente = "s";
		encuentra = false;
		j = 0;
		do {
			System.out.println("Factura N° 00000 - "+cf);
			System.out.println("Cantidad     Descripcion     Precio Unitario     Subtotal");
			System.out.println("_________________________________________________________");
			do {
				System.out.println("Ingrese código del producto: ");
				codigo = Integer.parseInt(bufEntrada.readLine());
				System.out.println("cantidad en la venta: ");
				cantidad_venta = Integer.parseInt(bufEntrada.readLine());
				// buscar codigo en vector
				for (i=1;i<=nro_art;i++) {
					if (articulo[i-1]==codigo) {
						encuentra = true;
						j = i;
					}
				}
				if (encuentra) {
					subtotal = cantidad_venta*pre_unit[j-1];
					total = total+subtotal;
					System.out.println(cantidad_venta+"        "+descripcion[j-1]+"        "+pre_unit[j-1]+"        "+subtotal);
					// Mostrar factura
					encuentra = false;
				} else {
					// Escribir error en la busqueda
					System.out.println(" ");
					System.out.println("******************");
					System.out.println("código inexistente");
					System.out.println("******************");
					System.out.println(" ");
				}
				System.out.println("Hay más artículos en el carrito? (s/n)");
				continua = bufEntrada.readLine();
			} while (!continua.equals("n"));
			System.out.println("Total factura "+total);
			total = 0;
			continua = "s";
			cf = cf+1;
			System.out.println("Hay otro cliente? (s/n)");
			cliente = bufEntrada.readLine();
		} while (!cliente.equals("n"));
	}


}

