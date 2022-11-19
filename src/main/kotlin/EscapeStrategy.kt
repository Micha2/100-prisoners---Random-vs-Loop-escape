interface EscapeStrategy {
    fun start(prisoners: List<Prisoner>, chests: List<Chest>): Boolean
}
