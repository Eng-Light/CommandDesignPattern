package remotecontroller

class Light {
    fun on(){
        println("Light ON")
    }
    fun off(){
        println("Light Off")
    }
}

class GarageDoor(){
    fun up(){
        println("Garage Door is open")
    }
    fun down(){
        println("Garage Door is down")
    }
    fun stop(){
        println("Garage Door is stopped")
    }
    fun lightOn(){
        println("Garage Door light is on")
    }
    fun lightOff(){
        println("Garage Door light is off")
    }
}