
public class Ej13 {

    // Método recursivo para imprimir los elementos de un array
    public static void imprimirArrayRecursivo(double[] arr, int indice) {
        // Caso base: si el indice es igual a la longitud del array, la recursión termina
        if (indice == arr.length) {
            return;
        }

        // Accion recursiva: imprime el elemento actual y llama a la funcion con el siguiente indice
        System.out.println("Precio: $" + arr[indice]);
        imprimirArrayRecursivo(arr, indice + 1);
    }

    public static void main(String[] args) {
        // a. Declarar e inicializar un array con los precios
        double[] precios = {199.99, 299.5, 149.75, 399.0, 89.99};

        // b. Usar la funcion recursiva para mostrar los precios originales
        System.out.println("Precios originales:");
        imprimirArrayRecursivo(precios, 0);

        // c. Modificar el precio de un producto especifico (tercer producto, indice 2)
        int indiceAModificar = 2;
        precios[indiceAModificar] = 129.99;

        // d. Usar la misma funcion recursiva para mostrar los valores modificados
        System.out.println("\nPrecios modificados:");
        imprimirArrayRecursivo(precios, 0);
    }
}


