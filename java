var cible = Math.floor(Math.random() * 1000) + 1;
var nombre, compteur;
for (compteur=1; compteur<=10; compteur+=1) {
    nombre = parseInt(prompt("donnez un chiffre:"),10);
    if (nombre === cible) {alert("Bravo");
        break;
    }
    if (nombre > cible) {
        alert("trop grand");
    }
    if (nombre < cible) {
        alert("trop petit");
    }
}
    else {
        alert("ce n'est pas un chiffre");
        compteur-=1;
}
alert("c'est fini. le chiffre cherche est : " + cible);
