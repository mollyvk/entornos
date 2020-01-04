package cuentas;
/**
 * 
 * @author pablofernandezmartinez
 * @version 1.1
 * @since 03/01/2020
 * 
 */

public class CCuenta {

	/**
	 * 
	 *  
	 */

    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    // Métodos getter y setter conseguidos tras refactorizar.
    public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getCuenta() {
		return cuenta;
	}

	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

    public double estado()
    {
        return getSaldo();
    }
    
	public CCuenta()
    {
    }

    public CCuenta(String nom, String cue, double sal, double tipo)
    {
    	/**
    	 * Método constructor CCuenta.
    	 */
        setNombre(nom);
        setCuenta(cue);
        setSaldo(sal);
    }

    public void ingresar(double cantidad) throws Exception
    {
    	/**
    	 * Método para añadir una cantidad a saldo.  No acepta cantidades negativas.
    	 */
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }

    public void retirar(double cantidad) throws Exception
    {
    	/**
    	 * Método para restar una cantidad a saldo. No acepta cantidades negativas ni superiores al estado de la cuenta.
    	 */
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }
}
