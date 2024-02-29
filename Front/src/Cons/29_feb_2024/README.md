```js
code/index.js

// Задача 1. Преобразовать массив строк в новый массив, в котором все значения будут в верхнем регистре
const myArray = ["apple", "banana", "orange", "grape"];
// const newArray = myArray.map (value => value.toUpperCase());
const newArray = myArray.map((value) => {
return value.toUpperCase();
});
console.log(newArray);

//Задача 2. Создайте новый массив, в который будут входить только значения имен
const persons = [
{ name: "John", age: 20 },
{ name: "Tom", age: 22 },
{ name: "Bob", age: 21 },
];

const newPersons = persons.map((arr) => arr.name);
console.log(newPersons);

//Задача 3. Проверить есть ли в массиве значение "grape" начинать поиск со второго элемента массива
const fruits = ["apple", "banana", "orange", "grape"];
let fruit = "banana";
const isFruit = fruits.includes(fruit, 1);
console.log(isFruit);

//Задача 4. Задан массив чисел. Найдите сумму квадратов этих чисел
const arrayNumbers = [1, 2, 3];
const newArraySq = arrayNumbers.reduce((acc, num) => acc + num ** 2);
console.log(newArraySq);

//Задача 5. Задан массив чисел. Вернуть массив только с нечетными числами - [3, 5, 8, 10, 13, 121, 5, 12, 14]
const arrayNumbersNew = [3, 5, 8, 10, 13, 121, 5, 12, 14];
const newArrayNum = arrayNumbersNew.filter((num) => num % 2 !== 0);
console.log(newArrayNum);

//Задача 6. Вернуть массив, в который будут входить слова с длиной строго больше 5 символов и кроме слова "orange". ["apple", "banana", "orange", "grape", "kiwi"]
const array = ["apple", "banana", "orange", "grape", "kiwi"];
const filteredArray = array.filter(
(word) => word.length > 5 && word !== "orange"
);
console.log(filteredArray);

//Задача 7. Вернуть сумму всех чисел массива, которые больше 10. [3, 5, 8, 10, 13, 121, 5, 12, 14];
const nums3 = [3, 5, 8, 10, 13, 121, 5, 12, 14];
const newNums = nums3.filter((el)=>el>10).reduce((acc, num)=> acc + num);
console.log(newNums);

//Задача 8.Объеденить два массива
const array2 = [...fruits, ...nums3];
console.log(array2);
```
