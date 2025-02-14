# GruMiVillanoFavorito
Examen Programación : Aplicación sobre pelicula "Gru mi villano favorito"

Los villanos lideran ejércitos de Minions. La eficiencia de los villanos en una misión dependerá de la fuerza combinada de sus Minions, ajustada por su torpeza.

Clase Minions: Los minions son unos seres adorables pero algo torpes. No tienen nombre, solo son los sirvientes de los villanos. Los atributos que definen a estos seres son la fuerza y la torpeza, que serán valores aleatorios entre 1 y 10 y que se inicializarán por defecto en el constructor. Una vez creados, no podrán modificarse sus atributos, pero sí listar sus atributos. (1.5 puntos)


Clase Villano: Los villanos tienen un nombre y un nivel de maldad que va de 1 a 4, no puede ser mayor ni menor. Por lo tanto, si se intenta crear un villano con un nivel de maldad superior a 4, este quedará en 4.
Los villanos tienen un ejército de seguidores que depende de su nivel de maldad. Para el nivel de maldad 1, tendrán 10 minions, y por cada nivel superior aumentará en diez el número de minions.
Los villanos también tienen un nivel de victorias, que comenzará en cero y que irá aumentando cada vez que completen una misión.
Además de los métodos básicos en la clase Villano, debemos tener en cuenta que la maldad no se podrá modificar una vez que se ha creado. (1.5 puntos)

Debemos tener un método reclutarMinions que rellene automáticamente el ejército de minions del villano. (1.5 puntos)
Método registrarVictoria, que incrementará las victorias del villano por cada misión ganada. (0.5 puntos)


Clase Misión: Las misiones tienen un nombre, una descripción y una puntuacionNecesaria, que será un entero con un rango entre 10 y 400 (ajustar si se intenta introducir valores fuera de ese rango). (1 punto)

Situados en el main, deberemos crear un array (estático) para almacenar un máximo de 10 misiones. Al comenzar la ejecución, se creará un villano. (0.5 puntos)
Deberemos crear un menú que nos permita:

  - Crear Misiones (0.5 puntos)
  - Listar misiones (0.5 puntos)
  - Listar estadísticas de mi villano (0.5 puntos)
  - Conseguir victorias: Para conseguir una victoria, se debe sumar la fuerza de todos los minions del villano y restar la torpeza de los mismos. Si el resultado es mayor que la puntuación de la misión, conseguirá una victoria. (1.5 puntos)
  - Si el villano consigue la victoria, la misión debe eliminarse del listado de misiones disponibles. (0.5 puntos)

Se restarán puntos si:

  - El formato no es correcto.
  - Los nombres de clases y variables no cumplen con lo establecido.
  - Los modificadores de acceso no están correctamente marcados.
  - Existen impresiones en los métodos de las clases.
  - La solución al problema presentado no es óptima.

