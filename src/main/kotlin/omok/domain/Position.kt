package omok.domain

data class Position(val x: Int, val y: Int) {
    val color: StoneType = StoneType.BLACK
}
