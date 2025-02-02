class Cuenta(val numeroCuenta: String, var saldo: Double) {

    fun abonar(cantidad: Double) {
        saldo += cantidad
    }

    fun pagar(cantidad: Double): Boolean {
        if (saldo >= cantidad) {
            saldo -= cantidad
            return true
        }
        return false
    }

    companion object {
        fun esMorosa(persona: Persona): Boolean {
            for (cuenta in persona.cuentas) {
                if (cuenta?.saldo ?: 0.0 < 0) {
                    return true
                }
            }
            return false
        }

        fun transferencia(
            personaA: Persona, cuentaAIndex: Int,
            personaB: Persona, cuentaBIndex: Int,
            cantidad: Double
        ): Boolean {
            val cuentaA = personaA.cuentas[cuentaAIndex]
            val cuentaB = personaB.cuentas[cuentaBIndex]

            if (cuentaA != null && cuentaB != null && cuentaA.pagar(cantidad)) {
                cuentaB.abonar(cantidad)
                return true
            }
            return false
        }
    }
}