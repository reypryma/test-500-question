package logic

import logic.interfaces.IEngine
import logic.interfaces.IStorage


class PetrolEngine(
    private val oilPipe: OilPipe,
    private val piston: Piston
) : IEngine {
    override fun move() {
        val oil = oilPipe.suckOil()
        val energy = oil.burn()
        energy.push(piston)
    }
}

class Piston {
    fun move() {
        // Implement piston movement
    }
}

class OilPipe {
    fun suckOil(): Oil {
        return Oil()
    }
}

class Oil {
    fun burn(): Energy {
        // Do some combustion process here
        return Energy()
    }
}

class Energy {
    fun push(piston: Piston) {
        piston.move()
    }
}


class Tank : IStorage<Oil>() {
    private lateinit var oil: Oil

    override fun fill(source: Oil) {
        oil = source
    }

    override fun getSource(): Oil {
        return oil
    }
}
