// DOM element
const weatherApp = document.querySelector(".weather");
const weatherLoading = document.querySelector(".loading");

// Button element
const getDataButtonWeather = document.querySelector(".get-data");

// <div>
const div26 = document.createElement("div");

// City
const cityName = "Berlin"; // for test

// API key
const apiKey = "24c6bd9b4cb8bb4433066d1eccc4e060";

// Стилизация блока ответов и ошибки
const styleBlock = () => {
  weatherApp.style.margin = "10px";
  weatherApp.style.borderColor = "#ccc";
  weatherApp.style.borderWidth = "2px";
  weatherApp.style.borderRadius = "5px";
  weatherApp.style.backgroundColor = "#9fd1eb";
  weatherApp.style.padding = "20px";
};

const getWeatherData = async (callback) => {
  try {
    const responseFromServer = await fetch(
      "https://api.openweathermap.org/data/2.5/weather?q=Berlin&appid=24c6bd9b4cb8bb4433066d1eccc4e060&units=metric ",
      {
        method: "GET",
      },
    );

    // //Error test
    //const responseFromServer = await fetch(
    //       "https://api.openweathermap.org/data/2.5/weather?q=Berlin&appid=Ё24c6bd9b4cb8bb4433066d1eccc4e060&units=metric ",
    //       {
    //         method: "GET",
    //       },
    //     );

    console.log(`ОТВЕТ СЕРВЕРА ${responseFromServer}`);

    if (!responseFromServer.ok) {
      //throw `${responseFromServer}`;
      throw Object.assign(new Error("Response error"), {
        response: responseFromServer,
      });
    } else {
      weatherLoading.style.display = "none";
      const respondWeather = await responseFromServer.json();
      const name = respondWeather.name;
      const temp = respondWeather.main.temp;
      const iconURl = `https://openweathermap.org/img/wn/${respondWeather.weather[0].icon}@2x.png`;

      console.log(respondWeather);

      const weatherInfo = `
    <h2>${name}</h2>
    <p>Temperature: ${temp}°C</p>
    <img src="${iconURl}" alt="Weather Icon">
  `;

      // Заполнение div
      div26.innerHTML = weatherInfo;
      weatherApp.append(div26);
      callback();
    }
  } catch (error) {
    weatherApp.style.color = "#fc0505";
    console.log(error.message);
    div26.textContent = `${error.message}: ${error.response.statusText} ${error.response.status}.`;
    styleBlock();
    weatherApp.append(div26);
  }
};

getDataButtonWeather.addEventListener("click", async () => {
  weatherLoading.style.display = "flex";
  await getWeatherData(styleBlock);
});
