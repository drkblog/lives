
juan = {
  nombre : 'Juan',
  edad : 3
}

nuevo_juan = advance(juan);

// Es verdadero que...
console.log(nuevo_juan.edad == juan.edad + 1);


function advance(persona) {
  antes = persona.edad;
}
