//1
let arrayProcessor = (argArray = [], otherFunction) => {
  let tmpArray = [];

  for (const argArrayElement of argArray) {
    tmpArray.push(argArrayElement.toString());
  }
  return otherFunction(tmpArray);
};

//2
let modifyElementsToUpperCase = (someArray = []) => {

  let tempArray = [];
  for (const string of someArray) {
    tempArray.push(string.toUpperCase());
  }
  return tempArray;
};

//3
let sumOfTheLengthsOfAllStrings = (someArray = []) => {

  let sum = 0;
  for (const string of someArray) {
    sum += string.length;
  }
  return sum;
};

// Test
let testArray = ['mr.black', 'mr.blue', 'mr.orange', 'mr.white'];
let result1, rersult2;

result1 = arrayProcessor(testArray, modifyElementsToUpperCase);
console.log(result1);

rersult2 = arrayProcessor(testArray, sumOfTheLengthsOfAllStrings);
console.log(rersult2);

/*OUTPUT

[ 'MR.BLACK', 'MR.BLUE', 'MR.ORANGE', 'MR.WHITE' ]
32
Process finished with exit code 0

 */