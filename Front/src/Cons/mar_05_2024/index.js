/*
const asyncFetch = async () => {
    try {
        const result = await fetch('https://google.com');
        console.log(result);
    }catch (error) {
        console.error(error.message);
    }
}

asyncFetch();
*/

/*
Требуется написать функцию, выводящую в консоль числа от 1 до n, где n — это целое число,
которая функция принимает в качестве параметра, с такими условиями:

 вывод fizz вместо чисел, кратных 3;

 вывод buzz вместо чисел, кратных 5;

вывод fizzbuzz вместо чисел, кратных как 3, так и 5.

*
* */

/*const fizzBuzz = (n) => {
  for (let i = 1; i <= n; i++) {
    if (i % 3 === 0 && i % 5 === 0) {
      console.log("fizzbuzz");
    } else if (i % 5 === 0) {
      console.log("buzz");
    } else if (i % 3 === 0) {
      console.log("fizz");
    } else {
      console.log(i);
    }
  }
};

fizzBuzz(15);*/

/*
function isPalindrome(word) {
  const reversedWord = word.split('').reverse().join('');
  return word.toLowerCase() === reversedWord.toLowerCase();
}

console.log(isPalindrome("Panama")); //false
console.log(isPalindrome("Radar")); //true
*/

/*
Нужно написать функцию, принимающую строку в качестве аргумента и
возвращающую количество гласных, которые содержатся в строке.
«a», «e», «i», «o», «u».*/

const countVowels = (str) => {
  str = str.toLowerCase();

  const arrayOfChar = ["a", "e", "i", "o", "u"];
  let count = 0;

  for (let i = 0; i < str.length; i++) {
    if (arrayOfChar.includes(str[i])) {
      count++;
    }
  }
  return count;
};

console.log(countVowels("HeEllo, World!"));
