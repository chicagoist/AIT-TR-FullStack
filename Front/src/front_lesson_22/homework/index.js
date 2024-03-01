const homeworkDiv = document.querySelector(".homework22>div");
const button = document.querySelector(".countdown");
let count = 60; // начально значение на странице
homeworkDiv.textContent = count.toString(); // отображение начального значение счётчика
let isButtonInUse = false;

const timer = () => {
  let countTimeFunc = () => {
    count--;
    if (count >= 0) {
      homeworkDiv.textContent = count.toString().padStart(2, "0"); // двухциферное отображение
    } else if (count <= 0) {
      clearInterval(intervalSec); // STOP
    }
  };
  let intervalSec = setInterval(countTimeFunc, 1000);
};

// BUTTON
button.addEventListener("click", () => {
  if (!isButtonInUse) {
    // чтобы кнопка не срабатывала во время счёта
    isButtonInUse = !isButtonInUse;
    timer();
  }
});
