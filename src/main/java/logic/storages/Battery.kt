package logic.storages

import logic.interfaces.IStorage

class SpeedController(
    private val bms: BatteryManagementSystem,
    private val motor: ElectricMotor
) {

    fun control() {
        val battery = bms.getBattery()
        motor.rotate(battery)
    }
}

class BatteryManagementSystem {

    fun getBattery(): Battery {
        return Battery(Electron())
    }
}

class ElectricMotor {

    fun rotate(battery: Battery) {
        // Rotate the rotor using electric power from the battery
    }
}


class Battery(private var electron: Electron) : IStorage<Electron>() {
    override fun fill(source: Electron) {
        electron = source;
    }

    override fun getSource(): Electron {
        return electron
    }
}