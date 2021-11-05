#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Created on Tue Nov 12 17:17:32 2019

@author: marcela
"""
#recebe dia inicial do evento
dia_i = int(input("Dia "))
hora_i = list()
for i in range(3):
    hora_i.append(int(input()))
dia_f = int(input("Dia "))
hora_f = list()
for i in range(3):
    hora_f.append(int(input()))
hi = hora_i[0]
mi = hora_i[1]
si = hora_i[2] 
hf = hora_f[0]
mf = hora_f[1]
sf = hora_f[2]
#dia_i = int(input("Dia "))
#hora inicial
#hi = int(input())
#minuto inicial
#mi = int(input())
#segundo inicial
#si = int(input())
#dia final
#dia_f = int(input("Dia "))   
#hora final
#hf = int(input())
#minuto final
#mf = int(input())
#segundo final
#sf = int(input())

#suposicao de dias
dias = dia_f - dia_i


if hf < hi and mf < mi and sf < si:
    dias -= 1


seg_tot = 60 * 60 * 24 * dias # dias em seg
seg_tot += (hf - hi) * 3600  # dias em seg somado com horas em seg.
seg_tot += (mf - mi) * 60 # dias em segundos + horas restantes + min restante
seg_tot += sf - si # + seg restante

#dias inteiros
d_in = seg_tot / 86_400
#horas inteiras
seg_tot %= 86_400
h_in = seg_tot / 3600
#minutos inteiros
seg_tot %= 3600
m_in = seg_tot /60
#segundos inteiros
seg_tot %= 60

print("%d dia(s)" % (d_in))
print("%d hora(s)"% (h_in))
print("%d minuto(s)"% (m_in))
print("%d segundo(s)"% (seg_tot))









