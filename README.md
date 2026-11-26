# Metodología de Sistemas II – TP Integrador (Segunda parte)
 
**UTN Avellaneda – Tecnicatura Universitaria en Programación**

**Grupo:** 6
 
**Integrantes:** Di Bona, Fabian - Barrio, Malena - Jara, Julieta - Lopez, Matias - Roig, Matias - Moya, Michael
 
**Docente:** Edith Rocio Castillo Yauri
 
Repositorio que contiene el código Java de los ejercicios de patrones de diseño y refactoring del trabajo práctico. Cada ejercicio aborda el problema planteado aplicando el patrón correspondiente, buscando un diseño claro, reutilizable y de bajo acoplamiento. Además, el repositorio incluye los diagramas UML de cada ejercicio. En el PDF de la entrega se encuentran también los diagramas UML, junto con las respuestas teóricas, incluido el tema de DDD (Domain-Driven Design).
 
## Contenido
 
| # | Problema | Patrón / técnica | Qué se hizo |
|---|----------|------------------|-------------|
| 1 | Transacciones bancarias (depósito, extracción, transferencia) | **Strategy** | Cada tipo de operación es una estrategia intercambiable. El contexto permite elegir y cambiar la operación antes de confirmar la transacción. |
| 2 | Reservas de hotel con distintos medios de pago | **Adapter** | Se adaptan `TarjetaCredito` y `BilleteraVirtual` (sin modificarlas) a una interfaz común de pago, para que `Reserva.pagarCon(medio)` funcione con cualquiera. |
| 3 | Combate de personajes (Mago y Guerrero) | **Template Method** | Una clase abstracta define el esqueleto del combate; Mago y Guerrero redefinen los pasos propios. Se incluye un *hook* y se pueden agregar nuevos personajes sin tocar el flujo general. |
| 4 | Monitoreo ambiental con sensores y paneles | **Observer** | Los sensores (sujetos) notifican a los paneles (observadores): principal, alertas y consola. Los paneles se pueden suscribir o desuscribir en tiempo real y es posible sumar nuevos sensores o paneles sin modificar el código existente. |
| 5 | Gremios y héroes | **Factory Method + Singleton + Facade** | La fábrica crea guerreros y magos sin que el gremio conozca su construcción. Un único gestor central de héroes (Singleton) actúa como fachada para reclutar, consultar el mejor guerrero y generar reportes de batalla. |
| 6 | Refactoring de `Videojuego` | **Replace Conditional with Polymorphism** | Se elimina el `if` que consulta el tipo de habilidad con `getClass()` (mal olor *Switch Statements*) y se delega el comportamiento a cada tipo de habilidad. |
