# EQUIPO “LOS SKIBIDI TOILET´S”
Bryan Vasquez Maldonado
Camila Magne Hinojosa
Mayra Belen Arias Grageda
Matias Juan Jose Mita Senzano

# GitFlow utilizado
Utilizamos un enfoque básico de ramificación en Git. Cada uno de nosotros creó su propia rama a partir de la rama master principal y trabajamos en nuestras características respectivas en esas ramas individuales. Luego fusionamos nuestras ramas de vuelta a la rama master una vez que nuestras características estuvieron listas.

# Bitácora del mini-proyecto con relación al GitFlow
**¿Les sirve ese GitFlow?** Sí, el enfoque básico de ramificación que utilizamos con la rama master como principal resultó ser útil para nuestro proyecto.
Nos permitió trabajar en paralelo en diferentes características sin interferir en el trabajo de los demás. Además, al fusionar nuestras ramas individuales de vuelta a master, pudimos integrar las características de manera ordenada y controlada.
**¿Qué problemas tuvieron?** Experimentamos algunos problemas relacionados con la sincronización y la resolución de conflictos al fusionar nuestras ramas de vuelta a master.
En ocasiones, dos o más miembros del equipo realizaban cambios en las mismas áreas del código, lo que generaba conflictos que debíamos resolver manualmente.
**¿Apareció algún conflicto?** Sí, surgieron conflictos durante el proceso de fusión de nuestras ramas individuales en master. Estos conflictos estaban relacionados principalmente con cambios concurrentes en el mismo código por parte de diferentes miembros del equipo.
**¿Quién generó el conflicto y por qué?** Los conflictos fueron generados por diferentes miembros del equipo al trabajar en sus características respectivas en ramas individuales basadas en master.
Esto sucedió porque estábamos modificando áreas del código que afectaban a múltiples funcionalidades del juego, lo que aumentaba la probabilidad de conflictos al fusionar nuestras ramas de vuelta a la rama principal.
Aunque el enfoque básico de ramificación con master como rama principal fue útil para trabajar en paralelo, enfrentamos desafíos relacionados con la sincronización y la resolución de conflictos al integrar nuestras características en la rama principal. Esto resalta la importancia de una comunicación efectiva y la coordinación entre los miembros del equipo para minimizar los conflictos y asegurar una integración suave de las nuevas características en el proyecto.




# Buenas y malas prácticas utilizadas en el proyecto siendo que:
**Bryan documentará las buenas y malas prácticas de Camila**
Camila trabajó con el método Teclas que se encargaba de controlar el direccionamiento de la víbora.
Buenas prácticas utilizadas por Camila:
Commits significativos: Realizó commits frecuentes significativos.
Usó su propia rama: Utilizó su propia rama para trabajar en nuevas características o arreglar errores, manteniendo la rama master limpia y estable.
Revisó el código: Realizó revisiones de código regularmente para garantizar la calidad del código.
Malas prácticas utilizadas por Camila:
No documentó cambios: No documentó sus cambios en los mensajes de commit, lo que dificultó entender qué se ha modificado.


**Camila documentará las buenas y malas prácticas de Bryan**
Buenas prácticas:
Modularización efectiva: Bryan ha empleado métodos como startGame, generarComida, y actualizar para organizar el código de forma modular, lo que facilita la comprensión y el mantenimiento.
Comentarios descriptivos: Se han incluido comentarios claros en el código, lo cual es esencial para comprender la lógica y el propósito de cada sección.
Buena estructura de la interfaz gráfica: La configuración de la ventana y la interfaz gráfica del juego están bien implementadas y organizadas de manera lógica.
Convenciones de nombramiento adecuadas: Bryan sigue las convenciones de nombramiento de Java, lo cual es fundamental para mantener la legibilidad y la consistencia en el código.
Máximo de 50 caracteres: Bryan ha mantenido todos los mensajes de commit dentro del límite de 50 caracteres, lo cual es una buena práctica para mantener los mensajes claros y concisos.
Prefijos para los Commits: Bryan ha utilizado prefijos adecuados para los commits, como "add" y "commit", lo cual ayuda a identificar rápidamente la naturaleza de cada cambio.
            Malas prácticas:
Variables globales innecesarias: Se han identificado algunas variables globales como width, height, y longitud que podrían reestructurarse para reducir dependencias excesivas en el código.
Verbos Imperativos Incorrectos:
git commit -m "añadimos un nuevo archivo.": El mensaje contiene un punto final, lo cual es incorrecto según las buenas prácticas de verbos imperativos.
git commit -m "para arreglar un problema...": El uso de puntos suspensivos en el mensaje también es incorrecto.
Prefijos para los Commits: Aunque Bryan ha utilizado prefijos adecuados, sería beneficioso agregar más detalles al principio de los mensajes para una identificación más clara de los cambios.

**Matías documentaría las buenas y malas prácticas de Bélen**
Buenas prácticas utilizadas por Bélen:
Buenos commits: Bélen hizo a tiempo todos sus commits, lo bueno es que analizo todos sus códigos antes de subirlos con un commit.
Nombre de rama: Le puso el nombre a su rama para poder identificar que esa rama le pertenece solo a ella.
Malas prácticas hechas por Bélen:
No especifico todos sus cambios que estaba realizando al hacer cada commit.

**Belén documentaría las buenas y malas prácticas de Matías**
Buenas prácticas: Aclaración de commits que se está utilizando en sus acciones al trabajar ,así mismo,como los espacios que se debe manejar de linea a linea,
Malas prácticas : Agregación de puntos final al terminar las líneas de código, la cual no debería llegar a implementar, 

# Git hooks o git alias que utilizaron como equipo
Los git hooks o git alias que utilizamos como equipo fueron los siguientes:
**Pre-commit:** Se ejecuta justo antes de confirmar los cambios. Puede usarse para realizar verificaciones automáticas de código, como pruebas unitarias, linters para asegurar el estilo de código consistente, o cualquier otra tarea de validación.
**Pre-push:** Se ejecuta justo antes de que los cambios sean enviados al repositorio remoto. Puede usarse para ejecutar pruebas más extensas o para asegurarse de que se cumplan ciertas políticas de calidad antes de permitir el envío de código al repositorio compartido.
