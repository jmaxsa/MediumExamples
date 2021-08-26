class Eye() {
    fun openEye(){}
}

class Human(
    private val eye: Eye
) {
    init {
      eye.openEye()
    }
}
