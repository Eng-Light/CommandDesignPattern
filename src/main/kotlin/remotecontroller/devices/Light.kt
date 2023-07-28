package remotecontroller.devices

class Light(private val location: String) {
    fun on() {
        println("$location light is on")
    }

    fun off() {
        println("$location light is off")
    }
}