const usersData = [
  {
    name: "John Doe",
    age: 25,
    email: "john.doe@example.com",
    city: "New York",
    profession: "Software Engineer",
  },
  {
    name: "Alice Johnson",
    age: 30,
    email: "alice.johnson@example.com",
    city: "Los Angeles",
    profession: "Data Scientist",
  },
  {
    name: "Bob Smith",
    age: 28,
    email: "bob.smith@example.com",
    city: "Chicago",
    profession: "Graphic Designer",
  },
  {
    name: "Eva Davis",
    age: 22,
    email: "eva.davis@example.com",
    city: "Miami",
    profession: "Marketing Specialist",
  },
  {
    name: "David Wilson",
    age: 35,
    email: "david.wilson@example.com",
    city: "San Francisco",
    profession: "Product Manager",
  },
];

// DOM element
const classworkContainer = document.querySelector(".classwork19");

// Button element
const getDataButton = document.querySelector(".get-data");

// From your homework 17
const elements = usersData.map((item) => {
  const divEl18 = document.createElement("div");
  divEl18.textContent = item;
  return divEl18;
});

getDataButton.addEventListener("click", () => {
  // hide button
  getDataButton.style.display = "none";

  usersData.forEach((user) => {
    const userCard = document.createElement("div");
    // CSS
    userCard.style.display = "flex";
    userCard.style.flexDirection = "column";
    userCard.style.margin = "10px";
    userCard.style.textAlign = "center";
    userCard.style.maxWidth = "400px";
    userCard.style.backgroundColor = "#9fd1eb";
    userCard.style.borderStyle = "solid";
    userCard.style.borderColor = "#ccc";
    userCard.style.borderWidth = "2px";
    userCard.style.borderRadius = "5px";
    userCard.style.backgroundColor = "#9fd1eb";
    userCard.style.padding = "20px";
    //
    userCard.className = "user-card"; // Thanks StackOverflow ! ))
    const nameHead = document.createElement("h2");
    nameHead.textContent = `${user.name}`; // only for name
    userCard.appendChild(nameHead); // entry to div
    //
    Object.keys(user).forEach((key) => {
      if (key !== "name") {
        // if not name, then create <p> for others
        const p = document.createElement("p");
        p.textContent = `${key}: ${user[key]}`;
        userCard.appendChild(p); // if name, thek create <p> for name
      }
    });
    classworkContainer.appendChild(userCard);
  });
});
