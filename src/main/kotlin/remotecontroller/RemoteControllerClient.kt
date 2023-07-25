package remotecontroller

fun main(){
    val remote = SimpleRemoteControl()//Init Invoker
    val light = Light()//Init Receiver
    val garageDoor = GarageDoor()
    val lightOn = LightOnCommand(light)//create command and pass the receiver to it
    val garageOpen = GarageDoorOpenCommand(garageDoor)

    remote.setCommand(lightOn)//Pass the command object that will be executed
    remote.buttonWasPressed()
    remote.setCommand(garageOpen)
    remote.buttonWasPressed()
}