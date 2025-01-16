package logic.output

import logic.*
import logic.storages.*

class VehicleFinal {

    companion object {

        fun combustion() {
            val tank = Tank()
            val oilPipe = OilPipe()
            val piston = Piston()
            val petrolEngine = PetrolEngine(oilPipe, piston)
            val petrolCar = Car<Oil>(engine = petrolEngine, storage = tank)
            val oil = Oil()
            petrolCar.refill(oil)
            petrolCar.accelerate()
            petrolCar.brake()
        }

        fun electricity() {
            // Electric car
            val electrons = Electron()
            val battery = Battery(electrons)
            val speedController = SpeedController(
                bms = BatteryManagementSystem(),
                motor = ElectricMotor()
            )
            val electricEngine = ElectricEngine(speedController)
            val electricCar = Car<Electron>(engine = electricEngine, storage = battery)
            electricCar.refill(electrons)
            electricCar.accelerate()
            electricCar.brake()
        }
    }
}