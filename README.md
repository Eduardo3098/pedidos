# CASO PRÁCTICO API SPRING BOOT

### Configuraciones iniciales
Se debe tener en cuenta las siguientes configuraciones antes de arrancar la API:

* BDD: MYSQL, se deberá configurar el archivo pedidos/../../../application.properties con la configuración del nombre de la base de datos, usuario, contraseña en caso de ser necesario
* El puerto por default de la aplicación se encuentra en el archivo antes mensionado, es el 9000

### Comentarios
Debido al tiempo y situaciones externas no se logró culminar todo lo expuesto, pero se puede destacar:

* Para el manejo de stock de proveedores se lo puede realizar mediante triggers en la base de datos, en la tabla detalle, la cual restaría el stock si ingresa en el detalle de un pedido, por lo que el api funcionaria de manera correcta para devolver el stock bien sea en la búsqueda de todos los proveedores o por uno en específico.
* Las pruebas unitarias y de integración se las podría realizar mediante el mismo framework y se las debería hacer para cada operación de servicio.
* Se puede implementar el patrón DTO para las operaciones de servicio, para una mejor presentación de datos.
* En general la API, consta del manejo de Clientes, Proveedores, Productos, Pedidos y Detalles del Pedido.

### Eduardo Albuja T.

