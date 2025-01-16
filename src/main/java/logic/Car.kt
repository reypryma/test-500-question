package logic

import logic.interfaces.BaseVehicle
import logic.interfaces.IEngine
import logic.interfaces.IStorage

class Car<T>constructor(private val engine: IEngine?,
                        private val storage: IStorage<T>): BaseVehicle<T>(){
//    constructor(
//        a : Int, b: String, engine: IEngine
//    ) : this(engine)

    override fun accelerate() {
        engine?.move()
    }

    override fun brake() {
        TODO("Not yet implemented")
    }

    override fun refill(source: T) {
        storage.fill(source);
    }
}