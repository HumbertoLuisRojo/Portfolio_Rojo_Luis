function factura() {
	var nombre = new String();
	var direccion = new String();
	var continua = new String();
	var cliente = new String();
	var descripcion = new String();
	var cantidad = new Number();
	var nro_art = new Number();
	var fila = new Number();
	var cf = new Number();
	var codigo = new Number();
	var cantidad_venta = new Number();
	var articulo = new Number();
	var i = new Number();
	var j = new Number();
	var pre_unit = new Number();
	var total = new Number();
	var subtotal = new Number();
	var encuentra = new Boolean();
	// Array para guardar los datos de la factura;
	var articulo = new Array(3);
	var cantidad = new Array(3);
	var pre_unit = new Array(3);
	var descripcion = new Array(3);
	document.write(" ",'<BR/>');
	document.write("Ingresa articulos?",'<BR/>');
	document.write("=================",'<BR/>');
	continua = "s";
	nro_art = 1;
	total = 0;
	// Ingreso de articulos al arreglo
	do {
		document.write("Artículo Número ",nro_art,":");
		articulo[nro_art-1] = Number(prompt("Ingrese Articulo <nro entero>"));
		document.write("cantidad: ");
		cantidad[nro_art-1] = Number(prompt("Ingrese cantidad"));
		document.write("descripcion: ");
		descripcion[nro_art-1] = prompt("Ingrese descripcion");
		document.write("Precio unitario: ");
		pre_unit[nro_art-1] = Number(prompt("Ingrese Precio unitario"));
		nro_art = nro_art+1;
		document.write("Ingresa otro articulo? (s/n)",'<BR/>');
		continua = prompt("Ingresa otro articulo? (s/n)");
		document.write(" ",'<BR/>');
	} while (continua!="n");
	nro_art = nro_art-1;
	document.write(" ",'<BR/>');
	document.write("Ingrese datos del cliente",'<BR/>');
	document.write("=========================",'<BR/>');
	document.write("Nombre: ");
	nombre = prompt("Nombre: ");
	document.write("Dirección: ");
	direccion = prompt("Direccion: ");
	document.write(" ",'<BR/>');
	document.write(" ",'<BR/>');
	continua = "s";
	cf = 1;
	cliente = "s";
	encuentra = false;
	j = 0;
	do {
		document.write("Factura N° 00000 - ",cf,'<BR/>');
		document.write("Cantidad       Descripcion       Precio Unitario       Subtotal",'<BR/>');
		document.write("_______________________________________________________________",'<BR/>');
		do {
			document.write("Ingrese codigo del producto: ",'<BR/>');
			codigo = Number(prompt("Ingrese codigo del producto: "));
			document.write("cantidad en la venta: ",'<BR/>');
			cantidad_venta = Number(prompt("cantidad en la venta: "));
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
				document.write(cantidad_venta,"            ",descripcion[j-1],"             ",pre_unit[j-1],"          ",subtotal,'<BR/>');
				// Mostrar factura
				encuentra = false;
			} else {
				// Escribir error en la busqueda
				document.write(" ",'<BR/>');
				document.write("******************",'<BR/>');
				document.write("codigo inexistente",'<BR/>');
				document.write("******************",'<BR/>');
				document.write(" ",'<BR/>');
			}
			document.write("Hay mas articulos en el carrito? (s/n)",'<BR/>');
			continua = prompt("Hay mas articulos en el carrito? (s/n)");
		} while (continua!="n");
		document.write("Total factura ",total,'<BR/>');
		total = 0;
		continua = "s";
		cf = cf+1;
		document.write("Hay otro cliente? (s/n)",'<BR/>');
		cliente = prompt("Hay otro cliente? (s/n)");
	} while (cliente!="n");
	document.write("PRESIONE F5 - PARA CONTINUAR",'<BR/>');
}

