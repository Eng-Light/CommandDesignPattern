package remotecontroller.commands

import remotecontroller.devices.CeilingFan

class CeilingFanHighCommand(private val ceilingFan: CeilingFan): Command {
    private var prevSpeed:Int? = null
    override fun execute() {
        prevSpeed = ceilingFan.getSpeed()
        ceilingFan.high()
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