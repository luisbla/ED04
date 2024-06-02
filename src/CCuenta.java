/**
 * Esta clase representa una cuenta bancaria.
 */
public class CCuenta {

    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    public CCuenta() {
    }

    /**
     * Construye una nueva cuenta bancaria con los parámetros dados.
     *
     * @param nom   el nombre del titular de la cuenta
     * @param cue   el número de cuenta
     * @param sal   el saldo inicial
     * @param tipo  el tipo de interés
     */
    public CCuenta(String nom, String cue, double sal, double tipo) {
        this.nombre = nom;
        this.cuenta = cue;
        this.saldo = sal;
        this.tipoInterés = tipo;
    }

    /**
     * Obtiene el saldo actual de la cuenta.
     *
     * @return el saldo actual
     */
    public double estado() {
        return this.saldo;
    }

    /**
     * Deposita una cantidad especificada en la cuenta.
     *
     * @param cantidad la cantidad a depositar
     * @throws Exception si la cantidad es negativa
     */
    public void ingresar(double cantidad) throws Exception {
        if (cantidad < 0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        this.saldo = this.saldo + cantidad;
    }

    /**
     * Retira una cantidad especificada de la cuenta.
     *
     * @param cantidad la cantidad a


