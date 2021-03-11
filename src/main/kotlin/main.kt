fun main(args: Array<String>) {
    pSecreta()
}


/*Cree una funcion para determinar si un texto es palindromo(Una palabra o texto que se lea igual de reves
 y derrecho ej:anona, ana, radar, etc)*/
fun palindromos(texto:String){
    var igual=0
    var aux=0

    for(i in texto.length-1 downTo 0){
        if(texto[i]==texto[aux]){
            igual++
        }
        aux++
    }
    if(igual==texto.length) {
        print("la palabra es palindroma")
    }else{
        print("la palabra no es palindroma")
    }
}

/*Carlitos quiere conocer si paso la materia de programacion de dispositivos moviles, la materia cuenta con
5 actividades evaluadas, 3 párciales y 2 tareas, el parcial 1 vale 20%, el segundo y el tercer parcial valen 25% y
cada tarea 15%, cree una funcion que reciba un arreglo con las notas de Carlitos y realice los calculos necesarios
para conocersi Carlitos paso la materia(nota mayor a 6.0) de ser asi la funcion retornara true y si no false*/

fun promedio(notas:Array<Double>):Boolean{
    var flag=false
    var total=0.0
    total = notas[0]*0.2+notas[1]*0.25+notas[2]*0.25+notas[3]*0.15+notas[4]*0.15
    if(total>=6.0){
        flag=true
    }
    return flag
}


/*cree una funcion que reciba un arreglo de numeros enteros y retorne el arreglo ya ordenado*/
fun ordernar(nums:Array<Int>):Array<Int>{
    for(i in 0..nums.size-1){
        for (j in 0..nums.size-i-2){
            if(nums[j]<nums[j+1]){
                var aux = nums[j+1]
                nums[j+1]=nums[j]
                nums[j]=aux
            }
        }
    }
    return nums
}


/*crear una funcion que dado un arreglo de numeros sume los impares y multiplique los pares*/

fun op(arr:Array<Int>) {
    var suma = 0
    var mult = 1
    for (i in 0..arr.size - 1) {
        if (arr[i] % 2 == 0) {
            mult *= arr[i]
        } else {
            suma += arr[i]
        }
    }
    println("suma:"+suma)
    println("Multiplicacion:"+mult)
}

/*Intenta adivinar la palabra secreta, se te dara la primera y ultima letra de la palabra y el numero de letras que posee la palabra.
Ejemplo: "pupusa"
la palabra secreta tiene 6 letras
p _ _ _ _ a
Cree una funcion que diga si pudiste adivinar la palabra antes de que pasen 3 intentos.
 */

fun pSecreta(){
    var secreta ="pupusa"
    var tam= secreta.length-1
    var intentos=0
    do{

        println("la palabra secreta tiene "+secreta.length+" letras")
        print(secreta[0])
        for(i in 1..secreta.length-2){
            print("_")
        }
        println(secreta[tam])
        print("intento:"+intentos+" ingrese la palabra:")
        var palabra= readLine()


    }while (palabra!=secreta&&++intentos<3)
    if(intentos==3){
        print("no lo lograste")
    }else{
        print("felicidades")
    }
}