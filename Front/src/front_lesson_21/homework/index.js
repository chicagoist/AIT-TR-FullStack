class Transport {
  constructor(_make, _model, _year) {
    this.make = _make;
    this.model = _model;
    this.year = _year;
  }

  displayMainInfo() {
    console.log(`This model \"${this.model}\" produced by ${this.make} in ${this.year}`);
  }
}

// Car
class Car extends Transport {
  constructor(_make, _model, _year, _numDoors, _isConvertible) {
    super(_make, _model, _year);
    this.numDoors = _numDoors;
    this.isConvertible = _isConvertible;
  }

  displayMainInfo() {
    console.log(
      `This model \"${this.model}\" produced by ${this.make} in ${this.year} and the car have a ${this.numDoors} doors. Is it convertible? ${this.isConvertible}!`,
    );
  }
}

// Motorcycle
class Motorcycle extends Transport {
  constructor(_make, _model, _year, _numWheels, _hasSideCar) {
    super(_make, _model, _year);
    this.numWheels = _numWheels;
    this.hasSideCar = _hasSideCar;
  }

  displayMainInfo() {
    console.log(
      `This model \"${this.model}\" produced by ${this.make} in ${this.year} and the moto have a ${this.numWheels} wheels. Has sidecar? ${this.hasSideCar}!`,
    );
  }
}

// let vehicle = new Transport('Ford', 'Taurus',  1998);
// vehicle.displayMainInfo();

let car1 = new Car("Mercedes", "Vito", 2010, 4, false);
car1.displayMainInfo();

let car2 = new Car("Mazda", "Miata", 1998, 2, Boolean(true));
car2.displayMainInfo();

let moto1 = new Motorcycle("Jawa", 350, 1996, 2, Boolean(false));
moto1.displayMainInfo();

let moto2 = new Motorcycle("Ural", "Волк", 2020, 3, Boolean(true));
moto2.displayMainInfo();
