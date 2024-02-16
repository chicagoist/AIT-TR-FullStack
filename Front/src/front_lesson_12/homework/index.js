// Задача 1
for (let i = 0; i < 20; i++) (i % 2 === 0) && console.log(i);

// Задача 2
for (let element of [2, 4, 6, 8, 10]) (element *= 2) && console.log(element);

// Задача 3
let arrayOfInt = Array(10, 15, 20, 25, 30);
let sum = 0;
for (let i = 0; i < arrayOfInt.length; i++) {
  sum += arrayOfInt[i];
}
console.log(sum / arrayOfInt.length);