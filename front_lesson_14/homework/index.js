//Задача 1
// const findMax = (number1, number2) => number1 > number2 ? number1 : number2 // однострочник
function findMax(number1, number2) {
  return number1 > number2 ? number1 : number2
}

let result = findMax(-3, -1)
console.log(result)

// Задача 2
function findSubstring(string = "", number = 0) {
  return string.substring(0, number)
}
console.log(string) // а вот это не печатает, хотя и переменная string объявлена, как var

var string = "Hello, JS!"
for (let i = 0; i < 3; i++) {
  let indexOfLoop = Math.round(Math.random() * (string.length + 1))
  let temp = findSubstring(string, indexOfLoop)
  console.log(temp)
}

// Задача 3
function isExistsElementInArray(array = [], element) {
  //return !!array[element]; // как вариант вместо if-else
  if (array[element]) {
    return true
  }
  return false
}

let intArray = [1, 2, 3, 4, 5, 0]

console.log(isExistsElementInArray(intArray, 0))
console.log(isExistsElementInArray(intArray, 1))
console.log(isExistsElementInArray(intArray, -1))

// P.S.
// Мой Prettier во время форматирования кода JS удаляет точку с запятой ";"
// Но код работает. Я не понимаю этого...
