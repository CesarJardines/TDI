function FORM() {
	var name = document.forms["RegForm"]["Name"];
	var email = document.forms["RegForm"]["EMail"];
	var phone = document.forms["RegForm"]["Telephone"];
	var what = document.forms["RegForm"]["Subject"];
	var password = document.forms["RegForm"]["Password"];
	var address = document.forms["RegForm"]["Address"];
	
	if (name.value == "") {
		window.alert("Completa el campo de nombre");
		name.focus();
		return false;
								}
	
	if (address.value == "") {
		window.alert("Completa el campo de dirección");
		address.focus();
		return false;
								}
	
	if (email.value == "") {
		window.alert(
		"Completa el campo de correo electrónico");
		email.focus();
		return false;
								}
	
	if (password.value == "") {
		window.alert("Completa el campo de contraseña");
		password.focus();
		return false;
								}
	
	if (what.selectedIndex < 1) {
		alert("Selecciona tu grupo");
		what.focus();
		return false;
								}
	
return true;
}

var palabras =[];

function getInfo() {
    var palabra = prompt("Ingresa una palabra para guardarla en un arreglo");
  
    var person ={
        fname : palabra
    };
    palabras.push(person);  

    var currPerson = palabras[palabras.length-1]; //take the last pushed object from the array
    
    var lastNameFirstChar = currPerson.fname.charAt(0).toUpperCase();
  
    if(!document.getElementById(lastNameFirstChar + "_holder")){      
    document.getElementById("mydiv").innerHTML += "<div  id='"+lastNameFirstChar+"_holder' class='holder'><span class='charValue'>"+lastNameFirstChar+"</span></br></div>";
    
  }
   document.getElementById(lastNameFirstChar + "_holder").innerHTML += currPerson.fname + "<br/>";
 

}

const cars = ["BMW", "Volvo", "Saab", "Ford", "Fiat", "Audi"];
function getCarros(){
	let text = "";
	for (let i = 0; i < cars.length; i++) {
  	text += cars[i] + "<br>";
	}

	document.getElementById("carro").innerHTML = text;
}