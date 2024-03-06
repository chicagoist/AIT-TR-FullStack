// DOM element
const homeworkContainer = document.querySelector(".homework25");

// Button element
const getDataButton = document.querySelector(".get-data");

// <div>
const div25 = document.createElement("div");

// Стилизация блока ответов и ошибки
const styleBlock = () => {
  homeworkContainer.style.margin = "10px";
  homeworkContainer.style.borderColor = "#ccc";
  homeworkContainer.style.borderWidth = "2px";
  homeworkContainer.style.borderRadius = "5px";
  homeworkContainer.style.backgroundColor = "#9fd1eb";
  homeworkContainer.style.padding = "20px";
};

const getRandomCat = async (callback) => {
  try {
    const responseFromServer = await fetch("https://catfact.ninja/fact", {
      method: "GET",
      headers: {
        "Content-Type": "application/json",
      },
    });

    // //Error test
    //const responseFromServer = Object.assign(new Error("404"));

    if (!responseFromServer.ok) {
      throw `${responseFromServer}`;
    } else {
      const respondFact = await responseFromServer.json();

      // Заполнение div
      div25.textContent = `${respondFact["fact"]}`;
      homeworkContainer.append(div25);
      callback();
    }
  } catch (error) {
    homeworkContainer.style.color = "#fc0505";
    div25.textContent = `ОШИБКА: ${error}`;
    styleBlock();
    homeworkContainer.append(div25);
  }
};

getDataButton.addEventListener("click", async () => {
  await getRandomCat(styleBlock);
});
