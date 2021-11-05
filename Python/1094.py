ex = int(input())
cont = 0
co = 0
sa = 0
ra = 0
for i in range(ex):
    a = input().split()
    q,t = a
    q = int(q)
    cont += q
    if (t == 'C'):
        co+=q
    elif (t == 'S'):
        sa += q
    elif (t == 'R'):
        ra += q
print("Total: {} cobaias".format(cont))
print("Total de coelhos: {}".format(co))
print("Total de ratos: {}".format(ra))
print("Total de sapos: {}".format(sa))
print("Percentual de coelhos: {:.2f} %".format((co*100)/cont))
print("Percentual de ratos: {:.2f} %".format((ra*100)/cont))
print("Percentual de sapos: {:.2f} %".format((sa*100)/cont))
        
    
