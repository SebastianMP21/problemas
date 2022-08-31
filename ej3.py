def inv_cad(cadena):
    cadena_invertida=" "
    for letra in cadena:
        cadena_invertida = letra + cadena_invertida 
    return cadena_invertida

print(inv_cad("Hola Mundo"))