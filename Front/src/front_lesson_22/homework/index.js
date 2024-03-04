const homeworkDiv = document.querySelector(".homework22>div");
const button = document.querySelector(".countdown");
let count = 10; // начальное значение на странице
homeworkDiv.textContent = count.toString().padStart(2, "0"); // отображение начального значения счетчика
let intervalSec;

const startTimer = () => {
  count = 10;
  homeworkDiv.textContent = count.toString().padStart(2, "0");
  button.setAttribute('disabled', true); // Делаем кнопку неактивной во время счетчика
  intervalSec = setInterval(() => {
    count--;
    if (count >= 0) {
      homeworkDiv.textContent = count.toString().padStart(2, "0"); // двузначное отображение
    } else {
      clearInterval(intervalSec); // Остановка таймера
      button.removeAttribute('disabled'); // После остановки таймера кнопка снова доступна
    }
  }, 1000);
};

// Обработчик кнопки
button.addEventListener("click", () => {
    startTimer(); // Запуск таймера
});
