# tareaPatrones
Tarea Patrones de diseño <br />
Integrantes del Grupo: <br />
Jorge Luis Anaya 0000266790 <br />
David Alejandro Corzo 0000267690  <br />
Luis Angel Bernal Perez 0000317613 <br />
<br />
<br />
Problema 1: <br />
En el problema 1 elegí el patrón template method porque como lo indica el problema, hay algunos pasos que se repiten en todos los productos, por lo mismo, como lo establece el patrón, hice los métodos que se tenían; verificación de inventario,  facturación y notificación al cliente y con estos mismos, hice una super clase “pasos generales” en donde se tienen los métodos y adapte las subclases para que puedan compartir

![1](https://github.com/janayajoo/tareaPatrones/assets/35385564/68a22268-93fe-4843-b3ec-535e2b5410e4)

<br />
<br />
Problema 2: <br />
El patron escogido para el problema numero 2 fue el patron de comportamiento, estrategia.
Se escogio este patron dado que el problema plantea tener multiples tipos de pagos, tales como paypal, tarjeta de credito y digitales.
Con este patron se puede tener una clase que haga una cosa especifica en muchas formas diferentes, sacarlas y crear clases de ellas y 
llamarlas estrategias. En esta idea tenemos lo que hacen todas, pagar, pero de formas diferentes, o en este caso con metodos diferentes pero que
al final terminan haciendo la misma accion especifica. Una buena aplicacion de este patron es cuando tenes muchas clases similares que se diferencian 
solo en la forma que se executa un comportamiento, perfecto para este problema.

![2](https://github.com/janayajoo/tareaPatrones/assets/35385564/e683dc89-08e5-47c3-a69b-27a79d893f8b)
Diagrama Clase Prob 2


<br />
<br />
Problema 3: <br />
Escogimos el método de builder para el tercer ejercicio porque se requeria crear objeto personalizable, este siendo la orden del cliente. Esto se cumplió con una clase builder y mucho objetos tipo ingrediente.


![3](https://github.com/janayajoo/tareaPatrones/assets/35385564/d0747981-cc79-4312-a0f5-98f725026d4b)
