**Razones para declarar toString() como abstracto**
1. Cada una de las figuras tiene forma distinta
    Ya que el cuadrado, triangulo y rectangulo tienen dimensiones distintas, no     tendria sentido tener una unica implementacion para todas ellas en la clase     abstracta.
    Entonces, cada subclase necesita tener su propio metodo toStrig de acuerdo
    con sus caracteristicas.
2.  La clase FiguraGeometrica.java no sabe cuantos lados tiene cada figura
    asi que no puede dar una version que funcione por defecto de toString()
3. Al definir el metodo como abtracto estamos obligando a cada subclase a 
    definir dicho metodo con sus propias caracteristicas, por lo que se refuerza    el polimorfismo

