package remotecontroller.commands

import remotecontroller.devices.CeilingFan

class CeilingFanOffCommand(private val ceilingFan: CeilingFan):Command{
    private var prevSpeed:Int? = null

    override fun execute() {
        prevSpeed = ceilingFan.getSpeed()
        ceilingFan.off()
    }

    override fun undo() {
        when (prevSpeed) {
            CeilingFan.LOW -> {
                ceilingFan.low()
            }
            CeilingFan.MEDIUM -> {
                ceilingFan.medium()
            }
            CeilingFan.HIGH -> {
                ceilingFan.high()
            }
            CeilingFan.OFF -> ceilingFan.off()
        }
    }
}