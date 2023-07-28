package remotecontroller.devices

class CeilingFan(private val location: String) {
    var SPEED: Int = OFF

    companion object {
        val HIGH = 3
        val MEDIUM = 2
        val LOW = 1
        val OFF = 0
    }

    fun high() {
        SPEED = HIGH
        on("high")
    }

    fun low() {
        SPEED = LOW
        on("low")
    }

    fun medium() {
        SPEED = MEDIUM
        on("medium")
    }

    fun getSpeed(): Int {
        return SPEED
    }

    fun on(mode: String) {
        println("$location ceiling fan is on $mode mode")
    }

    fun off() {
        println("$location ceiling fan is off")
    }
}