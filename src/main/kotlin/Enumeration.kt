fun main() {
    val color: Color = Color.GREEN

    when(color){
        Color.RED -> print("Color is Red")
        Color.BLUE -> print("Color is Blue")
        Color.GREEN -> print("Color is Green")
    }
}

enum class Color(val value: Int){
    RED(0xff0000),
    GREEN(0x00ff00),
    BLUE(0x0000ff)
}