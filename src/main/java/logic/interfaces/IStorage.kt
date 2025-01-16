package logic.interfaces

abstract class IStorage<T> {
    abstract fun fill(source:T)
    abstract fun getSource(): T
}