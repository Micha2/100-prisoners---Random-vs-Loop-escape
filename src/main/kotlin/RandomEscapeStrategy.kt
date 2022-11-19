class RandomEscapeStrategy : EscapeStrategy{
    override fun start(prisoners: List<Prisoner>, chests: List<Chest>) : Boolean {
        for(prisoner in prisoners.withIndex()) {
            var currentChest = chests.random()
            currentChest.opened = true
            var openedChests: Int = 1

            while(currentChest.insideNumber != prisoner.value.number) {
                while(currentChest.opened)
                    currentChest = chests.random()
                currentChest.opened = true
                openedChests++
            }
            if(openedChests > 50) {
//                println("The ${prisoner.index + 1}. prisoner with #${prisoner.value.number} needed $openedChests chests to find his number. All prisoners get executed.")
                for(chest in chests)
                    chest.opened = false
                return false
            }
//            println("I am prisoner #${prisoner.value.number} and I needed $openedChests tries.")
            for(chest in chests)
                chest.opened = false
        }
//        println("All prisoners found their number in under 50 tries. All prisoners survive.")
        return true
    }
}
