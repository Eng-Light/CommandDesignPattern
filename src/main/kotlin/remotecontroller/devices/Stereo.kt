package remotecontroller.devices

class Stereo(private val location: String) {
    fun on() {
        println("$location stereo is on")
    }

    fun off() {
        println("$location stereo is off")
    }

    fun setCD() {
        println("$location stereo is set in CD mode")
    }

    fun setDVD() {
        println("$location stereo is set in DVD mode")
    }

    fun setRadio() {
        println("$location stereo is set in Radio mode")
    }

    fun setVolume(volume: Int) {
        println("$location stereo volume is set to $volume")
    }
}