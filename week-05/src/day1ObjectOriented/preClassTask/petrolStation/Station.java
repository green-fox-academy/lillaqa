package day1ObjectOriented.preClassTask.petrolStation;

public class Station extends Cars {

    int gasAmount;

    public Station() {

        this.gasAmount = 30000;
    }

    public void refill(Cars car) {
        this.gasAmount = this.gasAmount - (car.capicity - car.gasAmount);
        car.gasAmount = car.capicity;
    }
}

/*
refill(car) -> decreases the gasAmount by the capacity of the car and increases the cars gasAmount
if (this.gasAmount > (car.capacity - car.gasAmount)) {
            this.gasAmount -= car.capacity - car.gasAmount;
            car.gasAmount = car.capacity;
        }
 */