let delay = (value) => {
  return new Promise((resolve, reject) => {
    setTimeout(() => {
      if (typeof value === "number") {
        resolve(value * 2);
      } else {
        reject("The argument is not a number");
      }
    }, 5000);
  });
};

let processingDelay = (value) => {
  delay(value)
    .then((response) => {
      console.log(response);
    })
    .catch((response) => {
      console.log(response);
    });
};

processingDelay(10);
processingDelay("text");
