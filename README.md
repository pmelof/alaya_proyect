AlayaIDEA

Para acceder a los datos por ruta:

En Controller se encuentran todoslos controladores, estan de comentarios, ideas, retos y users.
En cada controlador esta un @GetMapping, el cual es la ruta incial, onda si quiero acceder a las idea, parto con la ruta que sale ahí
ej: localhost:8080/rest/ideas
pero eso no es sufieciente, ya que no esta usando nada de ahí, para ello usas algunos de los métodos creados, como por ejemplo getAll()
para ese, debes ingresar la ruta:
	localhost:8080/rest/ideas/all	->muestra todas las ideas que se encuentran en la BD.
De la misma manera se accede a los demás.

Ahora una explicación de donde acceder y y qué hace cada cosa.

->LatteGroup.ALayaIDEA
    ->controller	Aquí se encuentran todos los controladores.
	-ComentariosController
	-IdeasController
	-RestosController
	-UsersController

----------------
	
->ComentariosController
Ruta: "/rest/comentarios"

localhost:8080/rest/comentarios/all --> Obtiene todos los comentarios en DB.
localhost:8080/rest/comentarios/create --> crea un nuevo comentario y lo guarda en DB, lo hace como JSON, necesita el body del comentario, con todos sus datos, lo mismo que el resto de los create.

----------------

->IdeasController
Ruta: "/rest/ideas"

localhost:8080/rest/ideas/all -->Todas las ideas en DB.
localhost:8080/rest/ideas/create --> crea una nueva idea y la guarda en DB, necesita el body de la idea, con todos sus datos, lo mismo que el resto de los create.
localhost:8080/rest/ideas/like -->aumenta en 1 el contador de likes, necesita como parametro una id, se agrega esa en la URL.
localhost:8080/rest/ideas/dislike -->disminuye en 1 el contador de likes, necesita como parametro una id, se agrega esa en la URL.
localhost:8080/rest/ideas/update/state -->actualiza el estado de una idea, como parametro ingresado en la URL necesita la id (de la idea) y el state a actualizar, ambos son números.
localhost:8080/rest/ideas/add/comemtario -->agrega un comentario a una idea.  Como parametro id de idea, y el comentario va en un body.

-----------------

->RestosController
Ruta: "/rest/retos"

localhost:8080/rest/retos/all -->Todos los retos en dB.
localhost:8080/rest/retos/create -->Crea un nuevo reto en la DB, necesita el body del reto, con todos sus datos, lo mismo que el resto de los create.
localhost:8080/rest/retos/add/idea -->Agrega una idea en la DB, necesita como parametro la id del reto y el body de la idea.

------------------

->UsersController
Ruta: "/rest/users"

localhost:8080/rest/users/all --> Todos los usuario en DB.
localhost:8080/rest/users/create -->crea un nuevo user, necesita el body del usuario, con todos sus datos, lo mismo que el resto de los create.
