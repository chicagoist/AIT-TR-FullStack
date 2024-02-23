let submitButton = document.querySelector(".submit-button");
let userForm = document.querySelector("#user-form");
let userCard = document.querySelector(".user-card");

let sendData = () => {
  let name = userForm.name.value;
  let surName = userForm.surname.value;
  let email = userForm.email.value;
  let phone = userForm.phone.value;

  // для добавления кода в скрытую сейчас карточку userCard
  if (name && surName && email && phone) {
    userCard.innerHTML = `
    <p>Name: ${name}</p>
    <p>Surame: ${surName}</p>
    <p>Email: ${email}</p>
    <p>Phone: ${phone}</p>
    `; // готово для вставки

    userForm.style.display = "none";
    userCard.style.display = "block";
  } else {
    alert("Fill out all form fields");
  }
};
submitButton.addEventListener("click", sendData);

/*submitButton.addEventListener("click", () => {
  alert("Name: " + userForm.name.value);
  alert("Surname: " + userForm.surname.value);
  alert("Email: " + userForm.email.value);
  alert("Phone: " + userForm.phone.value);
  }
);*/
