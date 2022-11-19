fun main(args: Array<String>) {
    var success: Int = 0
    for(round in 1..10000000) {
        val prisoners: MutableList<Prisoner> = mutableListOf<Prisoner>()
        val chests: MutableList<Chest> = mutableListOf<Chest>()
        var randomNumberList = (1..100).shuffled()
        for(i in 1..100) {
            prisoners.add(Prisoner(i))
            chests.add(Chest(i, randomNumberList[i-1]))
        }
//        val room = Room(prisoners, chests, LoopEscapeStrategy())
        val room = Room(prisoners, chests, RandomEscapeStrategy())

    if(room.start())
            success++
    }
    println("$success runs were successfull.")
}
