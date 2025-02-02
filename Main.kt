
fun main() {
    val persona = Persona("77495765A")

    val cuenta1 = Cuenta("ES1234567890", 0.0)
    val cuenta2 = Cuenta("ES0987654321", 700.0)

    persona.añadirCuenta(cuenta1)
    persona.añadirCuenta(cuenta2)

    cuenta1.abonar(1100.0)
    cuenta2.pagar(750.0)

    println("¿La persona es morosa? ${Cuenta.esMorosa(persona)}")

    val exito = Cuenta.transferencia(persona, 0, persona, 1, 100.0)

    if (exito) {
        println("Transferencia exitosa")
    } else {
        println("Transferencia fallida")
    }

    println("Saldo cuenta 1: ${cuenta1.saldo}")
    println("Saldo cuenta 2: ${cuenta2.saldo}")

    println("¿La persona es morosa después de la transferencia? ${Cuenta.esMorosa(persona)}")
}

