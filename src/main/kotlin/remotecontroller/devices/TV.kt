package remotecontroller.devices

class TV(private val location: String) {
    fun on() {
        println("$location TV is on")
    }

    fun off() {
        println("$location TV is off")
    }

    fun setDVD() {
        println("$location TV is set to DVD mode")
    }

    fun setNormal() {
        println("$location TV is set to Normal mode")
    }

}