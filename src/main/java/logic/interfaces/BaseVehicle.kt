package logic.interfaces

abstract class BaseVehicle<T> {
    abstract fun accelerate()
    abstract fun brake()
    abstract fun refill(source: T)
}