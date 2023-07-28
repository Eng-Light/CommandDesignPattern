package remotecontroller.devices

class HotTub {
    fun on() {
        println("Hot tub is on")
    }

    fun heat(value: Int) {
        println("HotTub is heating at $value degrees ")
    }

    fun bubble() {
        println("HotTub is bubbling")
    }

    fun off() {
        println("HotTub is off")
    }
}