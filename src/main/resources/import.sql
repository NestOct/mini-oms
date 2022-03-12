/* Populate tables */
INSERT INTO oders(order_id,first_name,last_name,email) VALUES(1, 'Daira Citlalli', 'Cordova Bautista', 'day.cordova@gmail.com');
INSERT INTO oders(order_id,first_name,last_name,email) VALUES(2, 'Nestor Octavio', 'Hernandez Velasquez', 'nestor051189@gmail.com');

INSERT INTO order_lines(order_line_id,order_id,product_id,product_description,unit,price) VALUES(1,1,101,'SqueakAir Ball - Una divertida pelota de tenis',1,175);
INSERT INTO order_lines(order_line_id,order_id,product_id,product_description,unit,price) VALUES(2,1,102,'Gyro - Un divertido juguete con un movimiento para tu perro',2,339.99);
INSERT INTO order_lines(order_line_id,order_id,product_id,product_description,unit,price) VALUES(3,1,103,'Wild Knots Bear Gris - Tierno oso de peluche diseñado para tu perro',2,169.99);
INSERT INTO order_lines(order_line_id,order_id,product_id,product_description,unit,price) VALUES(4,1,104,'Bounzer - Este increíble juguete es ideal para buscar y recoger', 4, 239.99);

INSERT INTO order_lines(order_line_id,order_id,product_id,product_description,unit,price) VALUES(5,2,105,'Arenero con Pala para Gatos Salmon - Con un diseño sencillo este arenero es la mejor opcion para nuestro amigo gato',2,151);
INSERT INTO order_lines(order_line_id,order_id,product_id,product_description,unit,price) VALUES(6,2,106,'Placa Skull - Original placa de identificacion con forma de calavera, perfecta para darle un toque irreverente al estilo de tu amigo perro',1,234);
