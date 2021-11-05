maior = 0
for i in range (100):
    x = int(input())
    if (maior < x):
        maior = x
        posicao = i
print(maior)
print(posicao + 1)
