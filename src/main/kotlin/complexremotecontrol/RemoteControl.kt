package complexremotecontrol

class RemoteControl {//Invoker
    private var currentDevice: Device? = null

    fun setDevice(device: Device) {
        currentDevice = device
    }

    fun pressButtonOne() {
        if (currentDevice is TV) {
            (currentDevice as TV).turnOn()
        } else if (currentDevice is Stereo) {
            (currentDevice as Stereo).turnOn()
        }
    }

    fun pressButtonTwo() {
        if (currentDevice is TV) {
            (currentDevice as TV).changeChannel()
        } else if (currentDevice is Stereo) {
            (currentDevice as Stereo).changeVolume()
        }
    }
}