# 1.Escribir una función que reciba un número positivo n y devuelva la cantidad de dígitos que tiene.

def digits(n):
    if n<10:
        return 1
    else:
        return 1+digits(n//10)

num=123
print(digits(num))


# 2.	Escribir una función que reciba 2 enteros n y b y devuelva True si n es potencia de b.


def potencia(a,b):
    if a==1:
        return True
    elif a<b:
        return False
    else:
        return potencia(a/b,b)

a=7
b=2
print(potencia(a,b))

# 3.Escribir una funcion recursiva que reciba como parámetros dos strings a y b, y devuelva una lista con las posiciones en donde se encuentra b dentro de a.
def Search(a, b, lista, cont):
    # Si es la primera vez que estamos buscando y encontramos una ocurrencia de 'b'
    if cont == 1 and a.find(b) != -1:
        num = a.find(b)
        lista.append(num)  # Almacenamos la posición de la primera ocurrencia
        cont += 1
        # Llamamos a la función recursivamente para buscar más ocurrencias
        return Search(a, b, lista, cont)
    # Si no es la primera vez y encontramos otra ocurrencia de 'b'
    elif a.find(b, lista[len(lista) - 1] + 1) != -1:
        num = a.find(b, lista[len(lista) - 1] + 1)
        lista.append(num)  # Almacenamos la posición de la siguiente ocurrencia
        # Llamamos a la función recursivamente para buscar más ocurrencias
        return Search(a, b, lista, cont)
    # Si no encontramos más ocurrencias
    else:
        return lista  # Retornamos la lista de posiciones


a = "Un tete a tete con Tete"
b = "te"
cont = 1
lista = []
print("Posiciones de las ocurrencias de 'te':", Search(a, b, lista, cont))

#4.Escribir dos funciones mutualmente recursivas par(n) e impar(n) que determinen la paridad del numero natural dado, conociendo solo que:
    #• 1 es impar.
    #• Si un número es impar, su antecesor es par; y viceversa.

def par(n):
    if n == 0:
        return True  # El 0 se considera un número par
    else:
        return impar(n - 1)

def impar(n):
    if n == 0:
        return False  # El 0 se considera un número par
    else:
        return par(n - 1)


numero = 262
if impar(numero):
    print(f"{numero} es impar.")
else:
    print(f"{numero} es par.")
#5.Escribir una función recursiva que encuentre el mayor elemento de una lista.
def mayor(list,cont,max):
    amount=len(list)
    if cont==amount:
        return max
    else:
        if list[cont]>max:
            max=list[cont]
        return mayor(list,cont+1,max)
    #6.Escribir una función recursiva para replicar los elementos de una lista una cantidad n de veces. Por ejemplo, replicar ([1, 3, 3, 7], 2) = ([1, 1, 3, 3, 3, 3, 7, 7])
    

list=[1,200,3,43,5,6,7,8,66]
cont=0
max=list[0]
print(mayor(list,cont,max))
#7.Escribir una función recursiva para replicar los elementos de una lista una cantidad n de veces. Por ejemplo, replicar ([1, 3, 3, 7], 2) = ([1, 1, 3, 3, 3, 3, 7, 7])
def calculate_K(n, p):
    if n == 1:
        return p
    else:
        return n * p + calculate_K(n - 1, p)

def main():
    try:
        n = int(input("Enter the value of n: "))
        p = int(input("Enter the value of p: "))
        
        result = calculate_K(n, p)
        
        print(f"K({n}, {p}) = {result}")
    except ValueError:
        print("Please enter valid integer values for n and p.")

if __name__ == "__main":
    main()
#8.El triángulo de Pascal es un arreglo triangular de números que se define de la siguiente manera: Las filas se enumeran desde n = 0, de arriba hacia abajo. Los valores de cada fila se enumeran desde k =
def pascal(n, k):
    if k == 0 or k == n:
        return 1
    else:
        return pascal(n - 1, k - 1) + pascal(n - 1, k)

def main():
    try:
        n = int(input("Enter the row number (n) for Pascal's Triangle: "))
        k = int(input("Enter the column number (k) for Pascal's Triangle: "))
        
        if n < 0 or k < 0 or k > n:
            print("Invalid input. n and k must be non-negative integers with k <= n.")
        else:
            result = pascal(n, k)
            print(f"The value at row {n} and column {k} of Pascal's Triangle is: {result}")
    except ValueError:
        print("Please enter valid non-negative integers for n and k.")

if __name__ == "__main__":
    main()
#9.escribí una función recursiva combinaciones(lista, k) que reciba una lista de caracteres únicos, y un número k, e imprima todas las posibles cadenas de longitud k formadas con los caracteres dados (permitiendo caracteres repetidos).
def combinations(lista, k, prefix=""):
    if k == 0:
        print(prefix)
        return

    for char in lista:
        new_prefix = prefix + char
        combinations(lista, k - 1, new_prefix)

def main():
    lista = input("Enter a list of unique characters: ")
    k = int(input("Enter the length of combinations (k): "))

    if k < 0:
        print("k must be a non-negative integer.")
        return

    if not lista:
        print("The list of characters is empty.")
        return

    # Convert the input string into a list of unique characters
    unique_characters = list(set(lista))

    combinations(unique_characters, k)

if __name__ == "__main__":
    main()
#10.Escribí una función recursiva medidas_hoja_A(N) que para una entrada N mayor que cero, devuelva el ancho y el largo de la hoja A(N) calculada recursivamente a partir de las medidas de la hoja A(N−1), usando la hoja A0 como caso base. La función debe devolver el ancho y el largo -en ese orden- en una tupla.
def medidas_hoja_A(N):
    # Caso base: A0
    if N == 0:
        return (841, 1189)
    
    # Caso recursivo: calcular las dimensiones de A(N) a partir de A(N-1)
    width_N_1, height_N_1 = medidas_hoja_A(N - 1)
    
    # Calcular las dimensiones de A(N) doblando a la mitad A(N-1)
    width_N = height_N_1
    height_N = width_N_1 * 2
    
    return (width_N, height_N)

# Ejemplo de uso:
N = int(input("Ingrese el valor de N para calcular las dimensiones de la hoja A(N): "))
if N > 0:
    width, height = medidas_hoja_A(N)
    print(f"Las dimensiones de la hoja A({N}) son {width} mm de ancho y {height} mm de largo.")
else:
    print("N debe ser un número entero mayor que cero.")