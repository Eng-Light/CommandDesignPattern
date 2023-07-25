package complexremotecontrol

class TV : Device {
    fun turnOn() {
        println("TV: Turning on")
    }

    fun changeChannel() {
        println("TV: Changing channel")
    }
}

class Stereo : Device {
    fun turnOn() {
        println("Stereo: Turning on")
    }

    fun changeVolume() {
        println("Stereo: Changing volume")
    }
}
