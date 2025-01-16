package logic

import logic.interfaces.IEngine
import logic.storages.SpeedController

class ElectricEngine(
    private val speedController: SpeedController
): IEngine{
    override fun move() {
        speedController.control()
    }
}