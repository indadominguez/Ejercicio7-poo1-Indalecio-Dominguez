
class Persona(val dni: String) {
    val cuentas: MutableList<Cuenta?> = mutableListOf()

    fun añadirCuenta(cuenta: Cuenta) {
        if (cuentas.size < 3) {
            cuentas.add(cuenta)
        } else {
            println("No se puede añadir más de 3 cuentas.")
        }
    }
}
