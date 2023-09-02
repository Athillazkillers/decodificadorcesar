import string

MSG = input("Ingrese el mensaje cifrado: ")
SP = int(input("Ingrese la cantidad de espacios que se ha movido: "))
resultado = ""
for letra in MSG:
    minuscula = letra in string.ascii_lowercase
    mayuscula = letra in string.ascii_uppercase
    if not (minuscula or mayuscula):
        resultado += letra
    else:
        ascii = ord(letra)
        baseAscii = ord('a')
        if mayuscula:
            baseAscii = ord('A')
        nuevoAscii = (ascii - baseAscii - SP + 26) % 26 + baseAscii
        nuevaLetra = chr(nuevoAscii)
        resultado += nuevaLetra

print("El mensaje descifrado es: " + resultado)