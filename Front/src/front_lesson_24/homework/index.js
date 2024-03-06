/*
const showNumbers = (seconds) => {
  const showPromise = new Promise((resolve, reject) => {
    setTimeout(() => {
      if (typeof seconds === "number") {
        resolve(`Прошло ${seconds} секунд(ы)`);
      } else {
        reject(new Error("Аргумент не является числом"));
      }
    }, seconds * 1000);
  });
  return showPromise;
};

const wait = (seconds) => {
  showNumbers(seconds)
    .then((result) => {
      console.log(result);
    })
    .catch((error) => {
      console.error(error.message);
    });
};
*/
const showNumbers = (seconds) => {
  return new Promise((resolve, reject) => {
    if (typeof seconds === "number") {
      setTimeout(() => {
        resolve(`Прошло ${seconds} секунд(ы)`);
      }, seconds * 1000);
    } else {
      reject(new Error("Аргумент не является числом"));
    }
  });
};

const wait = async (seconds) => {
  try {
    const result = await showNumbers(seconds);
    console.log(result);
  } catch (error) {
    console.error(error.message);
  }
};



wait(3);
wait(1);
wait(5);
wait("7");


/* OUTPUT

Прошло 1 секунд(ы)
Прошло 3 секунд(ы)
Прошло 5 секунд(ы)
Аргумент не является числом

Process finished with exit code 0

 */
