
package Caso3;

/**
 *
 * @author matia
 */

public class Main {
    public static void main(String[] args) {
        Universidad uni = new Universidad("Universidad Nacional");

        // Crear profesores
        Profesor p1 = new Profesor("P001", "Ana Torres", "Matemática");
        Profesor p2 = new Profesor("P002", "Luis Gómez", "Informática");
        Profesor p3 = new Profesor("P003", "María Ruiz", "Física");

        // Crear cursos
        Curso c1 = new Curso("C101", "Álgebra");
        Curso c2 = new Curso("C102", "Programación");
        Curso c3 = new Curso("C103", "Mecánica");
        Curso c4 = new Curso("C104", "Estadística");
        Curso c5 = new Curso("C105", "Bases de Datos");

        // Agregar a la universidad
        uni.agregarProfesor(p1);
        uni.agregarProfesor(p2);
        uni.agregarProfesor(p3);

        uni.agregarCurso(c1);
        uni.agregarCurso(c2);
        uni.agregarCurso(c3);
        uni.agregarCurso(c4);
        uni.agregarCurso(c5);

        // Asignar profesores
        uni.asignarProfesorACurso("C101", "P001");
        uni.asignarProfesorACurso("C102", "P002");
        uni.asignarProfesorACurso("C105", "P002");
        uni.asignarProfesorACurso("C103", "P003");

        // Listar cursos y profesores
        System.out.println(" Cursos:");
        uni.listarCursos();

        System.out.println(" Profesores:");
        uni.listarProfesores();

        // Reasignar profesor
        System.out.println(" Reasignar profesor de C104 a P001:");
        uni.asignarProfesorACurso("C104", "P001");

        // Eliminar curso
        System.out.println(" Eliminar curso C102:");
        uni.eliminarCurso("C102");

        // Eliminar profesor
        System.out.println("Eliminar profesor P003:");
        uni.eliminarProfesor("P003");

        // Reporte final
        System.out.println("Reporte de cursos por profesor:");
        uni.reporteCursosPorProfesor();
    }
}