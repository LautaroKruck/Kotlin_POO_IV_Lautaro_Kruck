class Cafetera() {
        var ubicacion = "Sin Nombre"
            //La inicializamos a "Sin Nombre", ya que aunque por el enunciado del ejercicio es posible crear una persona
            //sin introducir el nombre en el constructor primario, no tiene sentido que permitamos que esté vacío si vamos
            //a requerir lo contrario en el set de la propiedad.
            set(value) {
                comprobarUbicacion(value)
                field = value
            }
        var capacidad = 1000
            set(value) {
                comprobarCapacidad(capacidad)
                field = value
            }
        var cantidad = 0
            set(value) {
                comprobarCantidad(cantidad)
                field = value
            }
        init {
            comprobarUbicacion(ubicacion)
        }
        constructor(ubicacion: String, capacidad: Int, cantidad: Int): this(capacidad, cantidad) {
            comprobarUbicacion(ubicacion)
            this.ubicacion = ubicacion
            this.cantidad = this.capacidad
        }
        constructor(ubicacion: String, capacidad: Int, cantidad: Int): this(capacidad, cantidad) {
            comprobarUbicacion(ubicacion)
            this.ubicacion = ubicacion
            if (this.cantidad > this.capacidad) {
                this.cantidad = this.capacidad
            }
        }

        private fun comprobarCapacidad(capacidad: Int) {
            require(capacidad > 0) { "La capacidad debe ser un valor positivo." }
            require(capacidad < 1000) { "La capacidad debe ser un valor positivo." }
            require(capacidad.trim().isNotEmpty()) { "La capacidad no puede estar vacía." }
        }
        private fun comprobarCantidad(cantidad: Int) {
            require(cantidad <= capacidad) { "La cantidad debe ser un valor positivo o cero" }
            require(cantidad >= 0) { "La cantidad debe ser un valor positivo o cero" }
            require(cantidad.isNotEmpty()) { "La cantidad no puede estar vacía." }
        }
        private fun comprobarUbicacion(ubicacion: String) {
            require(ubicacion.trim().isNotEmpty()) { "La ubicación no puede estar vacía." }
        }
        fun llenar() { this.cantidad = this.capacidad }
        fun servirTaza(Taza) {

        }
        fun vaciar() = { this.cantidad = 0 }

        fun agregarCafe() {
            println("Cantidad de cafe que se quuiere añadir: ")
            var cantAnadida: Int = readln()
            if (cantAnadida)
                { this.cantidad += 200 }
            else
                {this.cantidad += cantAnadida }

        }

        override fun toString(): String {
            return "Cafetera(Ubicación = ${this.ubicacion}, capacidad = ${this.capacidad} c.c., cantidad = ${this.cantidad} c.c.)"
        }

}