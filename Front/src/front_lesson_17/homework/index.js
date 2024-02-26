// Object
let spaceship = {
  name: "Falcon Heavy",
  manufacturer: "Space Exploration Technologies Corporation",
  crew: 0,
  "max speed": "1050 km/h",
};

// To fill the .spaceship-info block
let spaceshipeInfo = document.querySelector(".homework18");

// Variable names obtained from spaceship's Object
let nameStarship = spaceship.name; // name - ключевое слово! переименовываем в  nameStarship
let manufacturer = spaceship.manufacturer;
let crew = spaceship.crew;
let maxSpeed = spaceship["max speed"];

// To fill in HTML
spaceshipeInfo.innerHTML = `
    <p class="name">Name: ${nameStarship}</p>
    <p class="manufacturer"><strong>Manufacturer:</strong> <strong>${manufacturer}</strong></p>
    <p class="crew">Crew: ${crew}</p>
    <p class="maxSpeed">Max Speed: ${maxSpeed}</p>
    `;

let isManufacturerHidden = false;

// Elements of classes
let hideManufacturerButton = document.querySelector(".hide-manufacturer");
let manufacturerSpan = document.querySelector(".manufacturer");

// Action to button
hideManufacturerButton.addEventListener("click", () => {
  isManufacturerHidden = !isManufacturerHidden;
  manufacturerSpan.style.display = isManufacturerHidden ? "none" : "block";
});
