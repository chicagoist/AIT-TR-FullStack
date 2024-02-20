
```js
code/index.js

//Стрелочные функции
let getDoubleNumber = (n, number2) => n * number2;

//function getDoubleNumber (){}

console.log(getDoubleNumber(9, 3));

//пример с массивом
let getNewArray = (oldArray) => {
oldArray.push("newElement");
};
let inputArray = [1, 2];
let resultFunction = getNewArray(inputArray);
console.log(resultFunction);
console.log(inputArray);

//пример стрелочной функции с числом
let doubleNumberFunction = (num) => {
return (num *= 2);
};
let numberExample = 20;
console.log(doubleNumberFunction(numberExample));
console.log(numberExample);

//функции callback
let generateNumber = (n, operation) => {
let number = operation(); // let generateNumber = randomNumber();
console.log(number);
return number + n;
};

let randomNumber = () => {
let random = Math.random(); //1
console.log(random);
let newRandom = random * 10; //2
console.log(newRandom);
let result = Math.round(newRandom); //3
console.log(result);
return result;
};

//0.63
//0.63*10 = 6.3
//Math.round(6.3) = 6

console.log(generateNumber(4, randomNumber));

//соединение массивов
let mergeArrays = (array1, array2) => {
for (let i = 0; i < array2.length; i++) {
array1.push(array2[i]);
}
return array1;
};

console.log(mergeArrays([1, 3], ["Tom", "Bob", "Bill"]));

//фильтрация
let removeNegativeNumbers = (oldArray) => {
let newArray = [];
for (let i = 0; i < oldArray.length; i++) {
if (oldArray[i] >= 0) {
newArray.push(oldArray[i]);
}
}
return newArray;
};

let numbersArray = [-1, -2, -7, -7, 2.5];
console.log(removeNegativeNumbers(numbersArray));

//максимальное число в массиве
let getMaxNumber = (arrayNumbers) => {
let maxNumber = arrayNumbers[0];
for (let i = 0; i < arrayNumbers.length; i++) {
if (arrayNumbers[i] > maxNumber) {
maxNumber = arrayNumbers[i];
}
}
return maxNumber;
};

// let pricesArray = [100, 300, 100, 800, -900, 200];
// let maxPrice = getMaxNumber(pricesArray);
console.log(getMaxNumber([100, 300, 100, 800, -900, 200]));
```
