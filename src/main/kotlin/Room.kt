data class Room(var prisoners: List<Prisoner>, var chests: List<Chest>, var escapeStrategy: EscapeStrategy) {
    fun start() : Boolean {
        return escapeStrategy.start(prisoners, chests)
    }
}
