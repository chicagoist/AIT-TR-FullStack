// DOM elements
const weatherApp = document.querySelector(".weather");
const weatherLoading = document.querySelector(".loading");
const getCityForm = document.getElementById("city-input");

// Button element
const getDataButtonWeather = document.querySelector(".get-data");

// <div>
const div26 = document.createElement("div");

// API key
const apiKey = "24c6bd9b4cb8bb4433066d1eccc4e060";

// Стилизация блока отображения вывода
const styleBlock = () => {
  weatherApp.style.margin = "10px";
  weatherApp.style.textAlign = "center";
  weatherApp.style.borderColor = "#ccc";
  weatherApp.style.borderWidth = "2px";
  weatherApp.style.borderRadius = "5px";
  weatherApp.style.backgroundColor = "#9fd1eb";
  weatherApp.style.padding = "20px";
};

// Если всё успешно
const handleSuccess = (respondWeather) => {
  const name = respondWeather.name;
  const temp = respondWeather.main.temp;
  const iconURl = `https://openweathermap.org/img/wn/${respondWeather.weather[0].icon}@2x.png`;

  div26.innerHTML = `
    <h2>${name}</h2>
    <p>Temperature: ${temp} °C</p>
    <img src="${iconURl}" alt="Weather Icon">
  `;
  weatherApp.append(div26);
  styleBlock();
};

// Если всё плохо
const handleError = (error) => {
  if (error) {
    weatherApp.style.color = "#fc0505";
  }

  console.error(error);
  //div26.textContent = `${error.message}: ${error.response.statusText} ${error.response.status}.`;
  div26.innerHTML = `
  <h2>${error.message}:</h2>
  <h3>${error.response.statusText} </h3>
  <h3>${error.response.status}</h3>
  `;

  styleBlock();
  weatherApp.append(div26);
};

// Функция для получения данных о погоде
const getWeatherData = async () => {
  try {
    const cityName = getCityForm.value.trim(); // передаём данные из формы
    if (!cityName) {
      alert("Please enter a city name");
      return;
    }

    // получаем данные уже метрические - в Цельсиях
    const responseFromServer = await fetch(
      `https://api.openweathermap.org/data/2.5/weather?q=${cityName}&appid=${apiKey}&units=metric`,
      { method: "GET" },
    );

    if (!responseFromServer.ok) {
      throw Object.assign(new Error("Response error"), { response: responseFromServer });
    } else {
      const respondWeather = await responseFromServer.json();
      handleSuccess(respondWeather);
    }
  } catch (error) {
    handleError(error);
  }
};

// усложнил функцию, чтобы отрабатывала и через кнопку Enter
document.getElementById("weather-form").addEventListener("submit", async (event) => {
  event.preventDefault();
  weatherApp.style.color = "#080808"; // иначе после ошибки текст оставался красным
  weatherLoading.style.display = "flex"; // показываем загрузку пока ожидаем вызова функции
  await getWeatherData();
  weatherLoading.style.display = "none"; // сразу скрываем загрузку
});
