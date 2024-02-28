// Character
let character = {
  name: "New Character",
  health: 100,
  level: 1,

  introduce() {
    console.log(`"Hello, my name is ${this.name}, I am at level ${this.level}, and I have ${this.health} health."`);
  },
};

//Warrior
let warrior = {
  name: "New Warrior",
  health: 200,
  level: 2,
  weapon: ["Knife", "Sword"],

  attack() {
    const index = Math.floor(Math.random() * this.weapon.length); // choosing a weapon to attack
    console.log(`Атакую с помощью ${this.weapon[index]}`);
  },
  __proto__: character,
};

// Wizard
let wizard = {
  name: "New Wizard",
  health: 1000,
  level: 10,
  spell: "NWO",

  castSpell() {
    console.log(`The wizard ${this.name} casts spells: ${this.spell}!!!`);
  },
  __proto__: character,
};

character.introduce();
warrior.introduce();
wizard.introduce();
console.log(wizard.castSpell());
