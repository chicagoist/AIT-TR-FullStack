**Задачи на урок:**

    setTimeout
    setInterval
    Ассинхронность
    Callbacks

**_JS: Timers_**

Ссылка на презентацию: [презентация](https://github.com/ait-tr/cohort37.1/blob/main/front_end/lesson_22/JS_Timers.pdf)

**Homework**


    Создайте простой таймер на веб-странице, который будет отсчитывать время назад от 60 секунд. При достижении 0 секунд таймер должен остановиться.
    Стилизуйте его

Важно: задание нужно прислать мне в виде архива, в котором будут три файла: index.js, index.html, styles.css

```js
code/homework/index.js

// - Создайте базовый класс Transport, представляющий транспортное средство. У транспортного средства должны быть следующие свойства:
// - make (марка)
// - model (модель)
// - year (год выпуска)
// - Добавьте в класс Transport метод displayMainInfo(), который выводит всю информацию о транспортном средстве в консоль.

// - Создайте два подкласса, расширяющих класс Transport:

// - Car - представляет автомобиль. Дополнительные свойства:
//   - numDoors (количество дверей)
//   - isConvertible (является ли кабриолетом)

// - Motorcycle - представляет мотоцикл. Дополнительные свойства:
//   - numWheels (количество колес)
//   - hasSideCar (имеет ли боковую коляску)

// - Создайте по два экземпляра для классов Car и Motorcycle

// Для демонстрации результатов вызовите метод displayMainInfo() для каждого экземпляра (4 вызова).

class Transport {
  constructor(make, model, year) {
    this.make = make;
    this.model = model;
    this.year = year;
  }

  displayMainInfo() {
    console.log(`Make: ${this.make}, Model: ${this.model}, Year: ${this.year}`);
  }
}

class Car extends Transport {
  constructor(make, model, year, numDoors = 4, isConvertible = false) {
    super(make, model, year);
    this.numDoors = numDoors;
    this.isConvertible = isConvertible;
  }

  // displayMainInfo() {
  //   // super.displayMainInfo();
  //   console.log(
  //     `Make: ${this.make}, Model: ${this.model}, Year: ${this.year}, Number of Doors: ${this.numDoors}, Convertible car: ${this.isConvertible}`
  //   );
  // }
  displayAdditionalInfo() {
    console.log(
      `Number of Doors: ${this.numDoors}, Convertible car: ${this.isConvertible}`
    );
  }
}

class Motorcycle extends Transport {
  constructor(make, model, year, numWheels, hasSideCar) {
    super(make, model, year);
    this.numWheels = numWheels;
    this.hasSideCar = hasSideCar;
  }
}

const toyotaCar = new Car("Toyota", "Camry", 2022, 2, true);
console.log(toyotaCar);
const audiCar = new Car("Audi", "A4", 2020, 4, true);

const harleyMotorcycle = new Motorcycle(
  "Harley-Davidson",
  "Sportster",
  2022,
  2,
  false
);

const hondaMotorcycle = new Motorcycle("Honda", "VTX 1800", 2002, 2, false);

toyotaCar.displayMainInfo();
toyotaCar.displayAdditionalInfo();
audiCar.displayMainInfo();
harleyMotorcycle.displayMainInfo();
hondaMotorcycle.displayMainInfo();
```


```js
code/lesson/index.js

// setTimeout
const delayedFunction = () => {
  console.log("Функция выполниться через 3 секунды");
};

setTimeout(delayedFunction, 3000); //3000ms = 3s

//

const greet = (userName, userAge, isAdmin) => {
  console.log(`Hello ${userName} - ${userAge} - ${isAdmin}`);
};

setTimeout(greet, 2000, "Ted", 23, true);

//

console.log("1");
console.log("2");
setTimeout(() => {
  console.log("3");
}, 0);
console.log("4");
setTimeout(() => {
  console.log("5");
}, 3000);
console.log("6");

//

setTimeout(() => {
  console.log("1");
}, 3000);

setTimeout(() => {
  console.log("2");
}, 3000);

//

const showMessage = (ms) => {
  const messageTimer = ms / 1000;

  const alertMessage = () => {
    console.log(`Прошло ${messageTimer} секунды`);
  };

  setTimeout(alertMessage, ms);

  console.log("2");
};

showMessage(4000);

console.log("1");

//setInterval
const simpleCounter1 = () => {
  let count = 1;

  let countFunc = () => {
    console.log(count);
    count++;

    if (count > 5) {
      clearInterval(intervalId);
    }
  };

  const intervalId = setInterval(countFunc, 1000);
};

simpleCounter1();

//

const simpleCounter2 = () => {
  let count = 1;

  const intervalId = setInterval(() => {
    console.log(count);
    count++;
  }, 2000);

  console.log(intervalId);

  setTimeout(() => {
    clearInterval(intervalId);
    console.log(intervalId);
  }, 7000);
};

simpleCounter2();

//callback
const fetchData = (callback) => {
  //ассинхронная операция, например, запрос к серверу
  setTimeout(() => {
    const data = "error";
    callback(data);
  }, 3000);
};

const processData = (data) => {
  if (data === "error" || data === "") {
    console.log("Перезагрузите страницу");
  } else {
    console.log(`Обработка данных: ${data}`);
  }
};

fetchData(processData);

console.log("Код идет дальше");

// callback hell

const cookBacon = (callback) => {
  console.log("Cooking bacon...");
  setTimeout(() => {
    console.log("Bacon is done!");
    callback();
  }, 3000);
};

const cookEggs = (callback) => {
  console.log("Cooking eggs...");
  setTimeout(() => {
    console.log("Eggs are done!");
    callback();
  }, 4000);
};

const toastBread = (callback) => {
  console.log("Toasting bread...");
  setTimeout(() => {
    console.log("Toast is done!");
    callback();
  }, 2000);
};

const cookMeet = (callback) => {
  console.log("Cooking meet...");
  setTimeout(() => {
    console.log("Meet is done!");
    callback();
  }, 4000);
};

toastBread(() => {
  cookBacon(() => {
    cookEggs(() => {
      cookMeet(() => {
        console.log("Sandwich is ready");
      });
    });
  });
});
```
