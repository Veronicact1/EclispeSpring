 /*ejercicio 6*/
 let n=prompt("Bienvenido a nuestra escuela");
 console.log(n);
 document.write(n);
/*ejercicio.7*/
var y=n;
 console.log('Hola soy'+" "+y);

/*ejercicio.8*/
 var a=3;
 if(a%2==0){
     console.log("el numero "+ a +" es par");
 }
 else{
     console.log("el numero "+a+" es impar");
}
/* ejercicio 9*/
let l=prompt('Escribe un numero entero positivo');
for (let k=l; k<=20; k++)
if (k<=20){
   console.log(k)
}
else (k>20);{
   console.log(l)
}

/*ej.10*/
function texte()
{
 let palindromo="sometemos";
 for (let p=0; p<palindromo.length; p++){
 if (palindromo[p]!=palindromo[palindromo.length-p-1]){
 return false;
  }
 }
 return true;
}
 if(texte())
 {console.log("La variable es palindromo");
 }
 else{
   console.log("La variable no es palidromo")
 }

/*ej.11*/
     let colores=["yellow","green","red"];
     let repeat_colores=[];
     for ( f of colores) {
      repeat_colores.push(f);
     }
     console.log(repeat_colores);
     
 
 /*ejercicio12
1.Formamos un nuevo file.typescript
2.Abrimos cmd en la carpeta donde esta guardado el exam2.ts
3.escribimos el comando: tsc exam2.ts
4.enter
5.en la misma carpeta aparece un nuevo file transpilado a JavaScript de TypeScript: exam2.js*/

 /*ejecicio 13*/
    var text="la version de"
    console.log(text+" TS: tsc -v");
    console.log(text+" Node: node -v");
    console.log(text+" Angular: ng v");

    