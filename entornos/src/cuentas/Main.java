package cuentas;

/**
 * 
 * @author pablofernandezmartinez
 * @version 1.1
 * @since 03/01/2020
 * 
 * Clase con el método main.
 * 
 */
public class Main {

    public static void main(String[] args) {
        operativa_cuenta(0);
    }

	public static void operativa_cuenta(float cantidad) {
		
		/**
		 * Clase resultado de la refeactorización. 
		 * Crea un objeto de la clase CCuenta con un estado y opera con sus métodos y variables.
		 */
		CCuenta cuenta1;
        double saldoActual;

        cuenta1 = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es"+ saldoActual );

        try {
            cuenta1.retirar(2300);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
	}
}
