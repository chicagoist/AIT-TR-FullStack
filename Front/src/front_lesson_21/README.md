**Задачи на урок:**

    Создание классов
    Наследование классов
    Приватные поля и методы
    Геттеры и сеттеры

_**JS: class, inheritance**_

Ссылка на презентацию: [презентация](https://github.com/ait-tr/cohort37.1/blob/main/front_end/lesson_21/JS_class_inheritance.pdf)

**Homework**


    Создайте базовый класс Transport, представляющий транспортное средство. У транспортного средства должны быть следующие свойства:
        make (марка)
        model (модель)
        year (год выпуска)

    Добавьте в класс Transport метод displayMainInfo(), который выводит всю информацию о транспортном средстве в консоль.

    Создайте два подкласса, расширяющих класс Transport:

        Car - представляет автомобиль. Дополнительные свойства:
            numDoors (количество дверей)
            isConvertible (является ли кабриолетом)

        Motorcycle - представляет мотоцикл. Дополнительные свойства:
            numWheels (количество колес)
            hasSideCar (имеет ли боковую коляску)

    Создайте по два экземпляра для классов Car и Motorcycle

Для демонстрации результатов вызовите метод displayMainInfo() для каждого экземпляра (4 вызова).

```js
code/homework/index.js

// Создать персонажей для игры с помощью прототипного наследования и this

// Создайте объект character, представляющий следующие характеристики и действие для всех персонажей:

// свойства name (имя), health (здоровье), level (уровень)
// метод introduce для character, который выводит в консоль информацию о персонаже, например:
//"Hello, my name is [name], I am at level [level], and I have [health] health." - на квадратные скобки не обращайте внимание, они для схемы, чтобы указать на переменные значения

// Создайте объект warrior, который будет наследовать свойства и методы от character, также при создании объекта добавьте в него:
// свойства name (имя), health (здоровье), level (уровень), weapon (оружие)
// метод attack, который выводит сообщение в консоль о нападении и название оружия (внутри использовать значение из weapon)

// Создайте объект wizard, наследующий свойства и методы от character, также при создании объекта добавьте в него:
// свойства name (имя), health (здоровье), level (уровень), spell (заклинание)
// метод castSpell, который выводит сообщение в консоль о том, как персонаж произносит заклинание (внутри использовать значение из spell).

// Результат должен состоять из следующих действий:
// вызова метода introduce для каждого из объектов
// вызова метода attack для объекта warrior
// вызова метода castSpell для объекта wizard

const character = {
  name: "User",
  health: 100,
  level: 1,
  introduce() {
    console.log(
      `Hello, my name is ${this.name}, I am at level ${this.level}, and I have ${this.health} health.`
    );
  },
};

const warrior = {
  // __proto__: character,
  name: "Conan",
  health: 90,
  level: 10,
  weapon: "Sword",
  attack() {
    console.log(`I'm attacking with ${this.weapon}`);
  },
};
warrior.__proto__ = character;


const wizard = {
  // __proto__: character,
  name: "Merlin",
  health: 110,
  level: 11,
  spell: "Firestorm",
  castSpell() {
    console.log(`I'm using ${this.spell}`);
  },
};

Object.setPrototypeOf(wizard, character);

character.introduce();
warrior.introduce();
wizard.introduce();

warrior.attack();

wizard.castSpell();
```


```js
code/lesson/index.js

// Создание класса и его экземпляров
class Wizard {
  constructor(name, house) {
    this.name = name;
    this.house = house;

    // this.introduce = function () {
    //   console.log(`I'm ${this.name} from ${this.house} house`);
    // };
  }

  introduce() {
    console.log(`I'm ${this.name} from ${this.house} house`);
  }
}

const harry = new Wizard("Harry Potter", "Gryffindor"); //экземпляр класса Wizard - объект harry
harry.introduce();
harry.introduce = function () {
  console.log(`My name is ${this.name}`);
};
harry.introduce();
console.log(harry);

const hermiona = new Wizard("Hermiona Granger", "Gryffindor");
console.log(hermiona);
hermiona.introduce();

// наследование классов

class DarkWizard extends Wizard {
  constructor(name, house, darkPower) {
    super(name, house);
    this.darkPower = darkPower;
  }

  useDarkPower() {
    console.log(`${this.name} uses dark power: ${this.darkPower}`);
  }
}

const voldemort = new DarkWizard(
  "Lord Voldemort",
  "Slytherin",
  "Avada Kedavra"
); //экземпляр класса DarkWizard - объект voldemort

console.log(voldemort);
voldemort.introduce();
voldemort.useDarkPower();

//приватные свойства и методы
class WizardPrivate {
  #privateField;

  constructor(name, house) {
    this.name = name;
    this.house = house;
    this.course = 1;
    this.#privateField = "Secret";
  }

  #privateMethod() {
    console.log(`This is private method - ${this.#privateField}`);
  }

  revealMethod() {
    console.log(`My secret is ${this.#privateField}`);
    this.#privateMethod();
  }
}

const jinny = new WizardPrivate("Jinny Weasly", "Gryffindor"); //экземпляр класса WizardPrivate - объект jinny
console.log(jinny);
console.log(jinny.name);
// console.log(jinny.#privateField);
// jinny.#privateMethod();
jinny.revealMethod();
console.log(jinny.course);

//геттеры и сеттеры
class WizardGetSet {
  #name;
  constructor(name, house) {
    this.#name = name;
    this.house = house;
  }

  get name() {
    return `${this.#name} Weasley`;
  }

  set name(newName) {
    if(newName!==''){
      this.#name = newName;
    } else {
      console.log('Enter name')
    }
  }
}

const ron = new WizardGetSet("Ron", "Gryffindor"); //экземпляр класса WizardGetSet - объект ron
console.log(ron.name);
ron.name = "";
console.log(ron.name);
// ron.house = "Slytherin";
// console.log(ron.house);
```
