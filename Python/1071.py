def maior_E_menor(x, y):
    if x > y:
        return x, y
    return y, x
x = int(input())
y = int(input())
if(x == y):
    print("0")
else:
    maior, menor = maior_E_menor(x, y)
    soma = 0
    menor +=1
    while(menor < maior):
        if menor % 2 != 0:
            soma += menor
        menor += 1   
    print(soma)